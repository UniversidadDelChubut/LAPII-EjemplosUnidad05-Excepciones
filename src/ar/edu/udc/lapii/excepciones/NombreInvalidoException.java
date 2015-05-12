package ar.edu.udc.lapii.excepciones;

public class NombreInvalidoException extends RuntimeException {
	public NombreInvalidoException(String message) {
		super(message);
	}
}