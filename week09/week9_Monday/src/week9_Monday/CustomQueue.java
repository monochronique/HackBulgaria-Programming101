package week9_Monday;

import java.util.LinkedList;

public class CustomQueue<E> extends LinkedList<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 501838920574282506L;
	
	@Override
	public synchronized boolean add (E key)
	{
		
	   addLast(key);
	   if (this.size() == 1) notifyAll();
	   return true;
	}
	
	@Override
	public synchronized E poll ()
	{
		while (this.size() == 0)
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   return getLast();
		
	}
	
	
	
}
