package week5_monday;

import java.util.Vector;

public class CustomVector {

	private int size = 0;
	private Vector<Float> v = null;

	@SafeVarargs
	public CustomVector(Float... data) {
		size = data.length;
		v = new Vector<Float>();
		v.setSize(size);
		for (Float coordinate : data)
			v.add(coordinate);
	}

	public int dimensionality() {
		return size;
	}

	public CustomVector(CustomVector vec) {
		v = new Vector<Float>();
		v.setSize(vec.size);
		v = vec.v;
	}

	public Float getIndex(int ix) {
		return v.get(ix);
	}

	public void setIndex(int ix, Float element) {
		v.set(ix, element);
	}

	public double getLength() {
		Float length = new Float(0);

		for (int i = 0; i < size; i++) {
			length += getIndex(i) * getIndex(i);
		}

		return Math.sqrt(length);

	}

	@Override
	public String toString() {
		String ans = "[";
		for (int i = 0; i < size; i++) {
			ans += v.get(i);
			if (i != size - 1)
				ans += ", ";
		}

		ans += "]";
		return ans;

	}

	public boolean equals(CustomVector vec) {

		return v.equals(vec.v);

	}

	public int hashCode() {
		int code = 0;
		for (int i = 0; i < size; i++) {
			code += (i + 1) * v.get(i).intValue();
		}

		return code;
	}

	public CustomVector add(Vector<Float> vec) {
		if (size != vec.size()) {
			System.err.println("Cannot add vector of such size!");
			return null;
		}
		Vector<Double> vecc = new Vector<>();
		for (int i = 0; i < size; i++) {
			vecc.add(vec.get(i).doubleValue() + v.get(i).doubleValue());
		}

		return new CustomVector((Float[]) vecc.toArray());

	}

	public CustomVector subtract(Vector<Float> vec) {
		if (size != vec.size()) {
			System.err.println("Cannot add vector of such size!");
			return null;
		}
		Vector<Double> vecc = new Vector<>();
		for (int i = 0; i < size; i++) {
			vecc.add(v.get(i).doubleValue() - vec.get(i).doubleValue());
		}

		return new CustomVector((Float[]) vecc.toArray());
	}

	public CustomVector add(float by) {
		Vector<Float> vec = new Vector<>();

		for (int i = 0; i < size; i++) {
			vec.add(v.get(i).floatValue() + by);
		}
		return new CustomVector((Float[]) vec.toArray());
	}

	public CustomVector subtract(float by) {
		Vector<Float> vec = new Vector<>();

		for (int i = 0; i < size; i++) {
			vec.add(v.get(i).floatValue() - by);
		}
		return new CustomVector((Float[]) vec.toArray());
	}

	public CustomVector multiply(float by) {
		Vector<Float> vec = new Vector<>();

		for (int i = 0; i < size; i++) {
			vec.add(v.get(i).floatValue() * by);
		}
		return new CustomVector((Float[]) vec.toArray());
	}

	public CustomVector divide(float by) {
		Vector<Float> vec = new Vector<>();

		for (int i = 0; i < size; i++) {
			vec.add(v.get(i).floatValue() / by);
		}
		return new CustomVector((Float[]) vec.toArray());
	}

	public Double dotProduct(Vector<Double> vector) {
		double product = 0;
		if (size != vector.size()) {
			System.err.println("Are malko po serizno");
			return null;
		}
		for (int i = 0; i < size; i++) {
			product += v.get(i) * vector.get(i);
		}

		return product;
	}

}
