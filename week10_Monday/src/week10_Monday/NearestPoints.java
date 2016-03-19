package week10_Monday;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NearestPoints {

	public static HashMap<Point, Point> map = new HashMap<>();

	public static Map<Point, Point> getNearestPoints(List<Point> generatedPoints) {

		int cores = Runtime.getRuntime().availableProcessors();
		int range = generatedPoints.size() / cores;
		
		ArrayList<Thread> threadPool = new ArrayList<>();
		long startTime = System.nanoTime();
		for (int i = 0; i < cores - 1; i++) {
			Thread t = new Thread(new NearestPointsCalculator(i * range, (i + 1) * range, generatedPoints));
			t.start();
			threadPool.add(t);
		}
		Thread t = new Thread(
				new NearestPointsCalculator((cores - 1) * range, generatedPoints.size(), generatedPoints));
		
		t.start();
		threadPool.add(t);
		for (int i = 0; i < threadPool.size(); i++) {
			while (threadPool.get(i).isAlive()) {
			}

		}
		long endTime = System.nanoTime();
		System.out.println("Elaspsed time: " + (endTime - startTime));
		return map;
	}

}
