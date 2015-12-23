import java.util.LinkedList;

public class HackNumber {
	
	private LinkedList<Integer> binaryNum;
	private boolean isHackNumber;
	
	public HackNumber ()
	{
		isHackNumber = false;
		binaryNum = new LinkedList<Integer>();
	}
	private boolean isPalindrome ()
	{
		LinkedList <Integer> bin = new LinkedList<Integer> (binaryNum);
		
		while (bin.size() > 1)
		{
			if (bin.getFirst() != bin.getLast()) return false;
			bin.removeLast();
			bin.removeFirst();
		}
		
		return true;
	}
	
	private boolean hasOddNumberOfOnes ()
	{
		LinkedList <Integer> bin = new LinkedList<Integer>(binaryNum);
		int numberOfOnes = 0;
		while (bin.size() > 0)
		{
			if (bin.getFirst() == 1) numberOfOnes++;
			bin.removeFirst();
		}
		
		return numberOfOnes % 2 == 1;
	}
	
	public boolean isHack (int n)
	{
		binaryNum = new LinkedList<Integer>();
		while (n != 0)
		{
			binaryNum.addLast(n % 2);
			n /= 2;
		}
				
		isHackNumber = (hasOddNumberOfOnes() && isPalindrome());

		return isHackNumber;
	}
	
	public int nextHack (int n)
	{
		n++;
		while (!isHack(n))
		{
			n++;
		}
		return n;
	}
	

}
