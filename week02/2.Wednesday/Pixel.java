public class Pixel {
	private float R, G, B;

	Pixel() {
		R = 0;
		G = 0;
		B = 0;
	}

	Pixel(float r, float g, float b) {
		R = r;
		G = g;
		B = b;
	}

	public float getR() {
		return R;
	}

	public float getB() {
		return B;
	}

	public float getG() {
		return G;
	}

	public void setR(float r) {
		R = r;
	}

	public void setG(float g) {
		G = g;
	}

	public void setB(float b) {
		B = b;
	}

	public String toString() {
		String ans = "";
		ans += "[" + R + ", " + G + ", " + B + "]";
		return ans;
	}

}
