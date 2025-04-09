package exceptions;

public class multiplecatch {

	public static void main(String[] args) {
		
		 try {
	            int[] numbers = {1, 2, 3};
	            int result = numbers[5] / 0; 
	        }
		 catch (ArithmeticException e) {
	            System.out.println("ArithmeticException caught");
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("ArrayIndexOutOfBoundsException caught");
	        } catch (Exception e) {
	            System.out.println("General Exception");
	        }
	}

}




       