package week10_Monday;

import java.util.List;

public class NearestPointsCalculator implements Runnable {

	private int fromIndex, toIndex;
	private List<Point> list;
	
	public NearestPointsCalculator(int fromIndex, int toIndex, List<Point> list) {
		super();
		this.fromIndex = fromIndex;
		this.toIndex = toIndex;
		this.list = list;
	}

	private Point getNearestPoint(Point p, int pointIndex) {
		double distance = 100000;
		double currentPointDistance = 100000;
		Point nearestPoint = new Point(0, 0);
		for (int i = 0; i < list.size(); i++) {
			if (i != pointIndex) {
				currentPointDistance = p.lengthToPoint(list.get(i));
				if (currentPointDistance < distance) {
					distance = currentPointDistance;
					nearestPoint = list.get(i);
				}
			}
		}
		return nearestPoint;
	}

	public void getNearestPoints() {

		for (int i = fromIndex; i < toIndex; i++) {
			NearestPoints.map.put(list.get(i), getNearestPoint(list.get(i), i));
		}
	}

	@Override
	public void run() {
		getNearestPoints();

	}

}
