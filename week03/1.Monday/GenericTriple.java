public class GenericTriple<T, V, K> {
	T first = null;
	V second = null;
	K third = null;

	public void setFirst(T f) {
		first = f;
	}

	public void setSecond(V s) {
		second = s;
	}

	public void setThird(K t) {
		third = t;
	}

	public T getFirst() {
		return first;
	}

	public V getSecond() {
		return second;
	}

	public K getThird() {
		return third;
	}

}
