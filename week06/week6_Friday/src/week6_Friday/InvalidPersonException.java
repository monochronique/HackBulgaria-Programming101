package week6_Friday;

public class InvalidPersonException extends Exception {

	private static final long serialVersionUID = 1L;
	public InvalidPersonException()
	{
		super();
	}
	public InvalidPersonException (String message)
	{
		super(message);
	}
	
	public InvalidPersonException (String message, Throwable cause)
	{
		super(message, cause);
	}
	
	
}
