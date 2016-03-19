package week10_Monday;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		ArrayList<Point> list = (ArrayList<Point>) PointsGenerator.generatePoints();
		HashMap<Point, Point> map = (HashMap<Point, Point>) NearestPoints.getNearestPoints(list);
		System.out.println("done");
		System.out.println(map.size());
	}

}
