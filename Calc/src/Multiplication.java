
public class Multiplication extends Operation {
	
	
	Multiplication ()
	{
		precedence = 2;
	}
	
	@Override
	public double operate(double first, double second) {
		return first * second;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "*";
	}

}
