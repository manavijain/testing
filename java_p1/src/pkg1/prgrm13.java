package pkg1;

import java.util.Arrays;

public class prgrm13 {

	public static void main(String[] args) {
		int[] numbers = {5,3,8,2,17};
		
		for(int n:numbers)
		{
			System.out.print(n+" ");
		}
		System.out.println();
		Arrays.sort(numbers);
		for(int n:numbers)
		{
			System.out.print(n+" ");
		}
		System.out.println();
		int pos=Arrays.binarySearch(numbers,8);
		System.out.println("Number 8 is found at position "+pos);
	}

}
