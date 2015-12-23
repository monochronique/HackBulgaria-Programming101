public class GenericPair<T, V> {
	T first = null;
	V second = null;

	GenericPair(T f, V s) {
		first = f;
		second = s;
	}

	public void setFirst(T f) {
		first = f;
	}

	public void setSecond(V s) {
		second = s;

	}

	public T getFirst() {
		return first;
	}

	public V getSecond() {
		return second;
	}
	
	@Override
	public boolean equals(Object p) {
		if (this == p)
			return true;
		if (p == null)
			return false;
		@SuppressWarnings("unchecked")
		final GenericPair<T,V> pair = (GenericPair<T,V>) p;

		return (first.equals(pair.getFirst()) && second
				.equals(pair.getSecond()));
	}
	
	public String toString() {
		return first.toString() + second.toString();
	}
	

}
