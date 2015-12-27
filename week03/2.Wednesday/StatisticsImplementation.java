import java.util.ArrayList;
import java.util.HashMap;

public class StatisticsImplementation implements Statistics {

	int sum = 0;
	int smallest = 0;
	int biggest = 0;
	int mode = 0;
	int modeOccurences = 0;
	HashMap<Integer, Integer> map = null;
	ArrayList<Integer> numbers = null;

	StatisticsImplementation() {
		numbers = new ArrayList<>();
		map = new HashMap<>();
	}

	public HashMap<Integer, Integer> getMap() {

		return map;
	}

	public void add(int element) {
		sum += element;
		if (modeOccurences == 0) {
			smallest = element;
			biggest = element;
		}
		if (element > biggest)
			biggest = element;
		if (smallest > element) {
			smallest = element;

		}
		int index = 0;
		while (index < numbers.size() && numbers.get(index) < element)
			index++;
		numbers.add(index, element);
		if (modeOccurences == 0) {
			mode = element;
			modeOccurences = 1;
			map.put(mode, modeOccurences);
		} else if (mode == element) {
			modeOccurences++;
			map.put(mode, modeOccurences);
		} else if (map.containsKey(element)
				&& map.get(element) + 1 > modeOccurences) {
			modeOccurences++;
			mode = element;
		} else if (map.containsKey(element)) {
			map.put(element, map.get(element) + 1);
		} else {
			map.put(element, 1);
		}

	}

	@Override
	public double getMean() {
		return (double) sum / (double) numbers.size();
	}

	@Override
	public double getMedian() {
		if (numbers.size() % 2 != 0)
			return numbers.get(numbers.size() / 2);
		else
			return (numbers.get(numbers.size() / 2) - numbers.get((numbers
					.size() / 2) - 1)) / 2;
	}

	@Override
	public double getMode() {
		return mode;
	}

	@Override
	public int getRange() {
		return biggest - smallest;
	}

}
