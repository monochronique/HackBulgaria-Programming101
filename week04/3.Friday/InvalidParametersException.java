package week4_Friday;

public class InvalidParametersException extends Exception {

	public InvalidParametersException()
	{
		super();
	}
	public InvalidParametersException (String message)
	{
		super(message);
	}
	
	public InvalidParametersException (String message, Throwable cause)
	{
		super(message, cause);
	}
	private static final long serialVersionUID = 1L;

}
