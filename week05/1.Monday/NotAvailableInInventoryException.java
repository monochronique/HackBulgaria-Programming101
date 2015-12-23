package week5_monday;

public class NotAvailableInInventoryException extends Exception {

	private static final long serialVersionUID = 1L;
	public NotAvailableInInventoryException()
	{
		super();
	}
	public NotAvailableInInventoryException (String message)
	{
		super(message);
	}
	
	public NotAvailableInInventoryException (String message, Throwable cause)
	{
		super(message, cause);
	}
}
