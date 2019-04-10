package ar.edu.udc.lapii.excepciones.t02lanzarexcepcion;

public class EjemploLanzarExcepcion {
	
	public static void main(String[] args) {
		
		calcularEImprimirFactorial();
		
	}
	
	
	public static void calcularEImprimirFactorial() {
		int n = 8;		
		try {
			System.out.printf("Factorial de %d es %d\n", n, factorial(n));
		} catch (ValorInvalidoException e) {
			System.err.println("Error al calcular el factorial de " + n);
		} 
		
	}
	
	public static int factorial (int n) throws ValorInvalidoException {
		if (n < 0)
			throw new ValorInvalidoException(n);
		
		int factorial = 1;
		while (n > 1) {
			factorial *= n--; 
		}
		return factorial;
	}

}
