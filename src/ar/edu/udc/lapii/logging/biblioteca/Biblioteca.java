package ar.edu.udc.lapii.logging.biblioteca;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Biblioteca {

	private static Logger logger = LogManager.getLogger(Biblioteca.class);
	
	public static int obtenerMitadAloPampa (int valor) throws NumeroImparException {
		
		int mitad = 0;
		
		logger.info("Valor de entrada es " + valor);
		
		
		while (valor > 0) {
			valor --;
			logger.debug("luego primer  decrmento el valor queda en " + valor);
			valor --;
			logger.debug("luego segundo decrmento el valor queda en " + valor);
			mitad ++;
			logger.debug("la mitad queda en " + mitad);
		}
		
		if (valor < 0) {
			logger.info("Entra a Impar");
			throw new NumeroImparException();
		}
		logger.info("Retorna mitad " + mitad);
		return mitad;
	}
	
	
}
