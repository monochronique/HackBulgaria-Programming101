
public class Audi extends Car {
	
	
	private int mileage = 0;
	
	Audi (int mil)
	{
		mileage = mil;
	}
	
	@Override
	public boolean isEcoFriendly(boolean testing) {
		// TODO Auto-generated method stub
		return true;
	}
	
	public int getMileage () 
	{
		return mileage;
	}
}
