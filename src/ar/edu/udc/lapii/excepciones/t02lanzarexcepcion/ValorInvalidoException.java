package ar.edu.udc.lapii.excepciones.t02lanzarexcepcion;

@SuppressWarnings("serial")
public class ValorInvalidoException extends Exception {

	private int valor;
	
	public ValorInvalidoException(int valor) {
		this.valor = valor;
	}
	
	@Override
	public String getMessage() {
		return "Valor inválido: " + this.valor;
	}
}
