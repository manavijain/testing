package pkg2;

public class bank_acc {
	int acc_no;
	String acc_name;
	float balance;
	
	public void deposit(float amt) //amt=2000
	{
		balance = balance+amt;
		System.out.println(this.acc_name+ " : Deposit of "+ amt + " successful ");
	}
	
	public void withdraw(float amt) //amt=500
	{
		balance = balance - amt;
		System.out.println(this.acc_name+ " : Withdrawal of "+ amt + " successful ");
	}
	
	//constructor
	public bank_acc(int acc_no, String acc_name,float balance) //balance 1000
	{
		this.acc_no=acc_no;
		this.acc_name=acc_name;
		this.balance = balance;
	}
	
	public bank_acc()
	{}
	
	public void show_details()
	{
		System.out.println("**********************************");
		System.out.println(
				"Account No : "+acc_no
				+ "\nAccount Name : "+acc_name
				+ "\nBalance : "+balance);
	}
}
