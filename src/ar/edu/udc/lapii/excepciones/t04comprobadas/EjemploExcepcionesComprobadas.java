package ar.edu.udc.lapii.excepciones.t04comprobadas;

public class EjemploExcepcionesComprobadas {
	
	public static void main(String[] args) {
		
		
		int [] valores = {1,7,8,3,4,5,6,7,8};
		
		int indice = 0;
		indice =Integer.parseInt(args[0]);
		
		System.out.printf("El valor en la posición % es %\n", indice, valores[indice]);

		
		try {
			
		} catch (NumberFormatException e) {
			
		} /* catch (IOException e) {
			
		} */
		
		
		
	}

}
