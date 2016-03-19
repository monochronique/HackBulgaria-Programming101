package week6_Friday;

public class InvalidWithdrawException extends Exception {
	
	
	private static final long serialVersionUID = 1L;
	public InvalidWithdrawException()
	{
		super();
	}
	public InvalidWithdrawException (String message)
	{
		super(message);
	}
	
	public InvalidWithdrawException (String message, Throwable cause)
	{
		super(message, cause);
	}

}
