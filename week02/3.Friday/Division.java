
public class Division extends Operation {
	
	
	Division ()
	{
		precedence = 2;
	}
	
	@Override
	public double operate(double first, double second) {
		return first / second;
	}

	@Override
	public String toString() {
		
		return "/";
	}
	
}
