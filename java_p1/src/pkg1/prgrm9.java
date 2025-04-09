package pkg1;
import java.util.Scanner;

public class prgrm9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        int[][] factorialArray = new int[n][2];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            int num = sc.nextInt();
            factorialArray[i][0] = num; 
            factorialArray[i][1] = calculateFactorial(num); 
        }

        System.out.println("Number | Factorial");
        for (int i = 0; i < n; i++) {
            System.out.println(factorialArray[i][0] + "       | " + factorialArray[i][1]);
        }

        sc.close(); 
    }

    public static int calculateFactorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
