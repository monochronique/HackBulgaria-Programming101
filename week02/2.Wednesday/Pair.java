public class Pair {

	private final Object first, second;

	public Pair(Object f, Object s) {
		first = f;
		second = s;
	}

	public final Object getFirst() {
		return first;
//		Object o = new Object();
//		o = first;
//		return o;
	}

	public final Object getSecond() {
		Object o = new Object();
		o = second;
		return o;
	}

	public String toString() {
		return first.toString() + second.toString();
	}

	@Override
	public boolean equals(Object p) {
		if (this == p)
			return true;
		if (p == null)
			return false;
		final Pair pair = (Pair) p;

		return (first.equals(pair.getFirst()) && second
				.equals(pair.getSecond()));
	}

}
