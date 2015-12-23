
public class Power extends Operation {
	
	
	Power ()
	{
		precedence = 2;
	}
	
	@Override
	public double operate(double first, double second) {
		return Math.pow(first, second);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "^";
	}

}
