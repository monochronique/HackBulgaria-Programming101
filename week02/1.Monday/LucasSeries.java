public class LucasSeries {

	public int nthLucas(int n) {
		if (n == 0)
			return 2;
		else if (n == 1)
			return 1;
		else
			return nthLucas(n - 1) + nthLucas(n - 2);
	}

}
