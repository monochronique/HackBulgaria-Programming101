package week5_monday;

public class NotSupportedCountryException extends Exception {

	
	private static final long serialVersionUID = 1L;
	public NotSupportedCountryException()
	{
		super();
	}
	public NotSupportedCountryException (String message)
	{
		super(message);
	}
	
	public NotSupportedCountryException (String message, Throwable cause)
	{
		super(message, cause);
	}
	

}
