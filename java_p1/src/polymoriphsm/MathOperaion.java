package polymoriphsm;
//overloading
public class MathOperaion {
	
	int add(int a,int b)
	{
		System.out.println("Method with 2 parameters: ");
		return a+b;
	}
	
	int add(int x,int y,int z)
	{
		System.out.println("Method with 3 parameters: ");
		return x+y+z;
	}
	
	public static void main(String[] args)
	{
		MathOperaion obj = new MathOperaion();
		System.out.println(obj.add(5,10));
		System.out.println(obj.add(10,20,35));
	}
}
