package pkg1;
import java.util.Scanner;

public class prgrm10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 1234;
        int balance = 5000;
        int c; 

        System.out.println("Welcome to ATM!");

        do {
            System.out.println("Enter the PIN number:");
            int no = sc.nextInt();

            if (no == pin) {
                do {
                    System.out.println("Choose the operation:\n1. Check balance\n2. Withdraw money\n3. Deposit money\n4. Exit");
                    c = sc.nextInt();

                    switch (c) {
                        case 1: 
                            System.out.println("Your current balance is " + balance);
                            break;

                        case 2: 
                            System.out.println("Enter the amount to withdraw:");
                            int withdraw = sc.nextInt();
                            if (withdraw > balance) {
                                System.out.println("Insufficient Balance");
                            } else {
                                balance -= withdraw;
                                System.out.println("Amount withdrawal successful");
                            }
                            break;

                        case 3: 
                            System.out.println("Enter the amount to deposit:");
                            int deposit = sc.nextInt();
                            balance += deposit;
                            System.out.println("Amount deposited successfully");
                            break;

                        case 4: 
                            System.out.println("Thank you for using our ATM!");
                            System.exit(0);

                        default: 
                            System.out.println("Invalid Input. Please try again.");
                            break;
                    }
                } while (c != 4); 
            } else {
                System.out.println("You have entered the wrong PIN number. Please try again.");
            }
        } while (true);
    }
}
