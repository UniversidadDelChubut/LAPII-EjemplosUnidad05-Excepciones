package ar.edu.udc.lapii.excepciones;

public class Principal {

	public static void main(String[] args) {
	
		Persona p = new Persona();
		try {
			
			p.setNombre("Pepe");
			p.setNumeroDocumento(-2523029);
			System.out.println(p.getNombre() + " " +  p.getNumeroDocumento());
			
		} catch (NumeroDocumentoInvalidoException | NombreInvalidoException  ex) {
			System.err.println(ex.getMessage());
		}
		
		
		/*
		try {
			Persona p = Persona.getPersona(25230298);
			
			System.out.println(p.getNombre());
		} catch (AplicacionException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		*/
		
		
	}
}
