package constructor;

public class calc_std {
	
	public static student findmax(student[] s)
	{
		student smax = new student();
		smax.avg = 0;
		for(student a:s)
		{
			if(a.avg > smax.avg) {
				smax.avg = a.avg;
				smax.name = a.name;
			}
		}
		return smax;
	}
	
	public static void main(String[] args)
	{
		int i;
		
		student sourabh = new student("Sourabh",1,85,90);
		student sachin = new student("Sachin",2,88,80);
		
		sourabh.avg = (sourabh.english+sourabh.maths)/2;
		sachin.avg = (sachin.english+sachin.maths)/2;
	}
}
