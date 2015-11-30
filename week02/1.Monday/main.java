public class main {

	public static void main(String[] args) {


		StackImpl st = new StackImpl();
		st.push_back(5);
		//st.pop_back();
		st.push_back(444);
		System.out.println(st.pop_back());
		st.push_back(7);
		Pixel p = new Pixel (100,200,30);
		Pixel[][] hui = new Pixel[1][2];
		hui[0][0] = p;
		hui[0][1] = p;
		Matrix m = new Matrix(1, 2, hui);
		m.operate(new BrightnessReduce());
		System.out.println(m);		
	}

}
