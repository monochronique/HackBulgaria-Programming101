import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Vector;

public class mainClass {

	public static void main(String[] args) {

		StatisticsImplementation stat = new StatisticsImplementation();
		stat.add(13);
		stat.add(13);
		stat.add(13);
		stat.add(13);
		stat.add(14);
		stat.add(14);
		stat.add(16);
		stat.add(18);
		stat.add(21);

		System.out.println(MapToString.toString(stat.getMap()));

		System.out.println("Mode = " + stat.getMode());
		System.out.println("Median = " + stat.getMedian());
		System.out.println("Mean = " + stat.getMean());
		System.out.println("Range = " + stat.getRange());
		String s = MapToString.toString(WordOccurences.words("Ninjas are all over the place! We are all going to die!"));
		
		System.out.println(s);
		/*
		 * Vector<String> t = new Vector<>(); t.add("first"); t.add("second");
		 * t.add("third"); Rotation.rotate(t, -2); System.out.println(t);
		 * Collection<Integer> ints = Arrays.asList(1, 3, 2, 4, 5, 5, 4, 3, 1);
		 * System.out.println(UniqueElement.firstUniqueElement(ints));
		 * Vector<Integer> A = new Vector<Integer>(); A.add(1); A.add(2);
		 * A.add(3); A.add(4); A.add(5); ArrayList<Integer> B = new
		 * ArrayList<>(); B.add(4); B.add(5); B.add(6);
		 * 
		 * LinkedList<Integer> C = new LinkedList<>(); C.add(5); C.add(6);
		 * C.add(7); C.add(8);
		 * 
		 * System.out.println(DuplicatingElements.duplicatingElements(A, B, C));
		 */
	}

}
