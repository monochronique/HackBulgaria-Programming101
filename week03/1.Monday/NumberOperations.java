public class NumberOperations<T extends Number, V extends Number> {

	public double sumation(T f, V s) {
		return f.doubleValue() + s.doubleValue();
	}

	public double subtraction(T f, V s) {
		return f.doubleValue() - s.doubleValue();
	}

	public double multiplication(T f, V s) {
		return f.doubleValue() * s.doubleValue();
	}

	public double division(T f, V s) {
		return f.doubleValue() / s.doubleValue();
	}

	public double power(T f, V s) {
		return Math.pow(f.doubleValue(), s.doubleValue());
	}


}
