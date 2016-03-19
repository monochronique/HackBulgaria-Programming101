
public class Factorial extends Operation {

	private int factorialTimes = 0;

	public Factorial(int fact) {
		precedence = 3;
		factorialTimes = fact;
	}

	private double factorial(double number) {
		double ans = 1;
		while (number > 0) {
			ans *= number;
			number -= 1;
		}

		return ans;
	}

	@Override
	public double operate(double number, double factorialTimes) {
		return operate(number);
	}

	public double operate(double number) {
		double ans = number;
		for (int i = 0; i < factorialTimes; i++) {
			ans = factorial(ans);
		}
		return ans;
	}

	@Override
	public String toString() {
		return "!";
	}

}
