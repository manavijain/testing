package abstraction;

public class working_bank {

	public static void main(String[] args) {
		
		bank b;
		
		b=new icici();
		System.out.println("ICICI Bank Rate Of Interest is : "+b.getRateOfInterest()+" %");
		//b.show();
		
		b=new citi();
		System.out.println("CITI Bank Rate Of Interest is : "+b.getRateOfInterest()+" %");
		//b.show();
	}

}
