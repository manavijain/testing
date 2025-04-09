package abstraction;

abstract class bank {
	
	abstract int getRateOfInterest();
	
	public void show()
	{
		System.out.println("in a non-abstract method");
		System.out.println("in class bank");
	}
}
