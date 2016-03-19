package week6_Friday;

public class NonExistingBankAccountException extends Exception {

	private static final long serialVersionUID = 1L;

	public NonExistingBankAccountException() {
		super();
	}

	public NonExistingBankAccountException(String message) {
		super(message);
	}

	public NonExistingBankAccountException(String message, Throwable cause) {
		super(message, cause);
	}

}
