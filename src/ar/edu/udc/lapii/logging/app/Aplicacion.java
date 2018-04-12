package ar.edu.udc.lapii.logging.app;

import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ar.edu.udc.lapii.logging.biblioteca.Biblioteca;
import ar.edu.udc.lapii.logging.biblioteca.NumeroImparException;

public class Aplicacion {

	private static Logger logger = LogManager.getLogger(Aplicacion.class);

	/*
	 * Obtiene un número al azar entre 40 y 50 para luego invocar al objeto en
	 * biblioteca para que realice el cálculo.
	 */
	public static void main(String[] args) {

		/*
		 * la obtención del número al azar puede ser más eficiente pero se
		 * utiliza un algoritmo iterativo
		 */

		int valor = 0;
		Random rnd =  new Random();
		do {
			valor = rnd.nextInt(100);
			logger.debug("El valor generado es " + valor);
		} while (valor < 40 ||  valor > 50);
		logger.info("El valor elegido es " + valor);
		
		
		try {
			int mitad = Biblioteca.obtenerMitadAloPampa(valor);
			
			System.out.println("La mitad es " + mitad);
			
		} catch (NumeroImparException e) {
			logger.error(e, e);
		}
		

	}

}
