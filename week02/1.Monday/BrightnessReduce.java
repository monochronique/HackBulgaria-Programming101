
public class BrightnessReduce implements MatrixOperation {

	@Override
	public Pixel withPixel(int x, int y, Pixel[][] matrix) {
		
		Pixel newPixel = new Pixel();
		
		newPixel.setB(matrix[x][y].getB() * (float) 0.3);
		newPixel.setR(matrix[x][y].getR() * (float) 0.3);
		newPixel.setG(matrix[x][y].getG() * (float) 0.3);
		
		
		return newPixel;
		
		
	}

}
