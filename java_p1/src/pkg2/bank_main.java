package pkg2;

import pkg2.bank_acc;

public class bank_main {

	public static void main(String[] args) {
		
		bank_acc satish = new bank_acc(1234,"satish",5000);
		
		/*bank_acc priya= new bank_acc();
		priya.acc_name="Priya";
		priya.acc_no=1111;
		priya.balance=5000;
		System.out.println("Account Name :" +priya.acc_name+ "\nAccount Number: "+priya.acc_no+ "\nAccount Balance : "+priya.balance);*/
		
		satish.show_details();
		satish.deposit(1000);
		satish.show_details();
		satish.withdraw(500);
		satish.show_details();
		
		//int arr[] = new int[5];
		
		/*bank_acc acc_list[] = new bank_acc[3];
		acc_list[0].acc_name = "Priya";
		acc_list[0].acc_no=13213;
		acc_list[0].balance=10000;
		
		acc_list[0].show_details();*/

	}

}
