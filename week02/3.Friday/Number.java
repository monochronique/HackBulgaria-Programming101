
public class Number extends Token {
	double number = 0;

	Number(double n) {
		number = n;
	}

	@Override
	boolean isNumber() {
		return true;
	}

	public double getNumber() {
		return number;
	}

	@Override
	public String toString() {

		return Double.toString(number);
	}

}
