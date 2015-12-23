
public class Sum extends Operation {
	
	Sum ()
	{
		precedence = 1;
		
	}
	
	@Override
	public double operate(double first, double second) {
		return first + second;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "+";
	}
	
	
	
}
