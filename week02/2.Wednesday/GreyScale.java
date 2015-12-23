public class GreyScale implements MatrixOperation {

	@Override
	public Pixel withPixel(int x, int y, Pixel[][] matrix) {
		Pixel newPixel = new Pixel();
		float value = matrix[x][y].getB() + matrix[x][y].getG()
				+ matrix[x][y].getR();
		value /= 3;
		newPixel.setB(value);
		newPixel.setG(value);
		newPixel.setR(value);
		return newPixel;
	}

}
