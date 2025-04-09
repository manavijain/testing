package pkg1;
import java.util.Scanner;

public class prgrm12 {
    static int pin = 1234;
    static int balance = 5000;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
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
                            checkbalance();
                            break;
                        case 2:
                            withdraw();
                            break;
                        case 3:
                            deposit();
                            break;
                        case 4:
                            exit();
                            break;
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

    public static void checkbalance() {
        System.out.println("Your current balance is " + balance);
    }

    public static void withdraw() {
        System.out.println("Enter the amount to withdraw:");
        int withdraw = sc.nextInt();
        if (withdraw > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance = balance- withdraw;
            System.out.println("Amount withdrawal successful");
        }
    }

    public static void deposit() {
        System.out.println("Enter the amount to deposit:");
        int deposit = sc.nextInt();
        balance = balance+ deposit;
        System.out.println("Amount deposited successfully");
    }

    public static void exit() {
        System.out.println("Thank you for using our ATM!");
        System.exit(0);
    }
}
