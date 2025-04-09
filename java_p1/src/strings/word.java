package strings;

public class word {

	public static void main(String[] args) {
		
		String str = "Hi Surya, When are you visiting?";
		
		int start= str.indexOf(" ")+1;
		
		int end = str.indexOf(",", start);
		
		System.out.println(str.substring(start,end));
	}

}
