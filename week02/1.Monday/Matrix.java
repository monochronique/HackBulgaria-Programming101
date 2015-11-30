public class Matrix {

	public Pixel[][] matrix;
	public int n = 0, m = 0;

	Matrix(int n, int m, Pixel[][] mat) {
		matrix = new Pixel[n][m];
		matrix = mat;
		this.n = n;
		this.m = m;
	}

	public Matrix() {
	}

	public void operate(MatrixOperation op) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrix[i][j] = op.withPixel(i, j, matrix);
			}
		}
	}

	public String toString() {
		String ans = "";
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				ans += matrix[i][j].toString();
			}

			ans += "\n";
		}

		return ans;
	}

}
