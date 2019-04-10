package ar.edu.udc.lapii.excepciones.t03jerarquiadeexcepciones;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EjemploJerarquiaDeExcepciones {

	public static void main(String[] args) {

		try {

			File file = new File("/tmp/copo.txt");
			FileInputStream fis = new FileInputStream(file);
			int c;
			while ((c = fis.read()) != -1)
				System.out.println((char) c);
			
			c = 0;
			c = c / c;
			
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		} catch (Exception e) {

		} catch (Throwable e) {

		} finally {

		}
		// ¿Dónde puedo poner NullPointerException? ¿DivisionByZero? 
	}

}
