package ar.edu.udc.lapii.excepciones.t01trycatchfinally;

public class EjemploTryCatchFinally {
	
	public static void main(String[] args) {
		
		hacerDivision(850, 100);
		hacerDivision(850, 0);
		hacerDivision(850, null);
		
	}
	
	public static void hacerDivision(Integer divisor , Integer dividendo ) {
		
		int resultado;
		System.err.printf(">>>Antes de dividir %d entre %d\n", divisor, dividendo);
		resultado = divisor / dividendo;
		System.err.printf(">>>Después de dividir %d entre %d\n", divisor, dividendo);
		System.err.printf(">>>El resulado de dividir %d entre %d es %d\n", divisor, dividendo, resultado);
		
	}

}
