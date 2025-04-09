package builtin;

import java.util.Arrays;

public class array_utility {

	public static void display(int a[]) {
		
		for(int n :a)
		{
			System.out.println(n+ " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		int arr[] = {22,91,8,101,6,18};
		display(arr);
		Arrays.sort(arr);
		display(arr);
		int pos = Arrays.binarySearch(arr, 91);
		System.out.println("Position : "+pos);
		int arr1[] = new int[5];
		int arr2[] = new int[5];
		
		Arrays.fill(arr1,5);
		Arrays.fill(arr2,5);
		System.out.println("Array Fill");
		display(arr1);
		
		boolean f = Arrays.equals(arr1, arr2);
		System.out.println("Array Equal : "+f);
		
		String s = Arrays.toString(arr1);
		System.out.println("Array To String : "+s);
		
	}
}
