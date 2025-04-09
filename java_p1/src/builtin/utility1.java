package builtin;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class utility1 {

	public static void main(String[] args) {
		
		int num_arr[] = {5,99,11,55,2,18};
		List<Integer> nlist = Arrays.asList(5,99,11,55,2,18);
		
		System.out.println(nlist);
		
		Collections.sort(nlist);
		System.out.println(nlist);
		
		Collections.reverse(nlist);
		System.out.println(nlist);
	}
}
