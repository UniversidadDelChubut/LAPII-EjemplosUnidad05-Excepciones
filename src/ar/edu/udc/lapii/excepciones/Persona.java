package ar.edu.udc.lapii.excepciones;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Persona {

	private int numeroDocumento;
	private String nombre;
	
	
	public void setNombre(String nombre) throws NombreInvalidoException {
		if (nombre == null || nombre.trim().isEmpty()){
			throw new NombreInvalidoException ("Debe ingresar un nombre no vacío");
		}
		this.nombre = nombre;
	}
	
	public void setNumeroDocumento(int numeroDocumento) throws NumeroDocumentoInvalidoException {
		if (numeroDocumento < 1000000 || numeroDocumento > 99999999){
			throw new NumeroDocumentoInvalidoException("El numero de documento " + numeroDocumento + " es inválido");
		}
		this.numeroDocumento = numeroDocumento;	
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getNumeroDocumento() {
		return numeroDocumento;
	}
	
	
	
	public static Persona getPersona(int numeroDocumento) throws PersonaInexistenteException, AplicacionException {
		File file = new File("personas.txt");
		FileReader fr = null;
		BufferedReader br = null;
		try {
			
			fr = new FileReader(file);
			br = new BufferedReader (fr);
			
			String linea = null;
			while ((linea = br.readLine()) != null){
				
				try { 
					int auxDoc  = Integer.parseInt(linea.substring(0, 8));
					String auxNombre = linea.substring(8);
					
					if (auxDoc == numeroDocumento) {
						Persona persona = new Persona();
						persona.setNumeroDocumento(auxDoc);
						persona.setNombre(auxNombre);
						return persona;
					}
					
				} catch (ArrayIndexOutOfBoundsException | NumberFormatException ex) {
					AplicacionException aex = new AplicacionException("Error en el formato de los datos en la base de datos", ex);
					throw aex;
				}

			}
		} catch (FileNotFoundException e) {
			AplicacionException aex = new AplicacionException("No se encotró el origen de la información", e);
			throw aex;
		} catch (IOException e) {
			AplicacionException aex = new AplicacionException("Ocurrio un error al acceder a la información", e);
			throw aex;
		} finally {
			//Cerrar el flujo
			try {
				fr.close();
				br.close();
			} catch (IOException | NullPointerException e) {
				;
			}
		}
		
		
		
		throw new PersonaInexistenteException();
	}
}
