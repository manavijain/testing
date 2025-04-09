package polymoriphsm;

public class car extends Vehicle {
	
	//override
	public void start()
	{
		System.out.println("Car has self starter");
	}
	
	public static void main(String[] args)
	{
		Vehicle v1= new Vehicle();
		v1.start();
		
		car c1 = new car();
		c1.start();
	}
	
}
