package Exceptions;

public class CadastroException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public CadastroException(String log) {
		super(log);
	}

}
