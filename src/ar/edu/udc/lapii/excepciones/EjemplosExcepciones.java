package ar.edu.udc.lapii.excepciones;

public class EjemplosExcepciones {

	public static void main(String[] args) {
		
		
		String patron = null;
		int cantidad = 0;
	
		if (args.length != 2){
			System.err.println("Uso: EjemplosExcepciones <patron> <cantidad>");
			return; 
		}
		
	
		patron = args[0];
		if (patron.isEmpty()) {
			System.err.println("El primer argumento no debe ser una cadena vacía");
			return;
		}
		
		
		try {
			cantidad = Integer.parseInt(args[1]);
		} catch (NumberFormatException nfex) {
			System.err.println("El valor '" + args[1] + "' no es un entero válido");
			return;
		}
		
		
		
		for (int i =0 ;  i < cantidad; i++) {
			System.out.print( patron.toLowerCase());
		}
		
		
		
	}
	
	
}
