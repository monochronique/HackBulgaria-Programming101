package week10_Monday;

import java.util.ArrayList;
import java.util.List;

public class PointsGenerator {

	public static List<Point> generatePoints() {
		List<Point> list = new ArrayList<>();
		int x, y;
		for (int i = 0; i < 100000; i++) {
			x = (int) (Math.random() * 10000);
			y = (int) (Math.random() * 10000);
			list.add(new Point(x, y));
		}

		System.out.println("Points generated");
		return list;

	}

}
