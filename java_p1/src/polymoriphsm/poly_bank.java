package polymoriphsm;

public class poly_bank {

	public static void main(String[] args) {
		
		bank b; //object of parent class
		
		b= new bob();
		//bob b1 = new bob();
		System.out.println("Bob : ROI "+ b.getRateOfInterest());
		
		b = new citi();
		System.out.println("CITI : ROI "+b.getRateOfInterest());
		
		b = new canara();
		System.out.println("Canara : ROI "+b.getRateOfInterest());
	}

}
