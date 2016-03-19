package week6_Wednesday;

import java.util.List;
import java.util.Collections;

public class FunnyArraySorter {

	Integer pivot;

	interface Sorter {
		public void sort();
	}

	public FunnyArraySorter(Integer pivot) {
		this.pivot = pivot;
	}
	
	public<T extends Comparable<? super T>> void collectionsSort (List<T> list)
	{
		Sorter sort = new Sorter ()
				{

					@Override
					public void sort() {
						Collections.sort(list);
						
					}
					
				};
		sort.sort();
	}
	
	
}
