
public abstract class Operation extends Token {
	int precedence = 0;

	public abstract double operate(double first, double second);

	public int getPrecedence() {
		return precedence;
	}
	@Override
	boolean isNumber ()
	{
		return false;
	}
	
}
