package pkg2;

public class zoo {

	public static void main(String[] args) {
		
		dog dog1 = new dog();
		dog1.eat();					//object of child class accessing the method of parent class 
		dog1.sleep();				//object of child class accessing the method of parent class
		
		dog dog2 = new dog();
		dog2.sleep();
		dog2.bark();				//object of child class accessing the method of parent class

	}

}
