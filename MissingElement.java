package week3.day1;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		int[] array = {1,2,3,7,6,8};
		Arrays.sort(array);
		
		for(int i = 0 ; i<=array.length; i++) {
			if(array[i] != array[i+1]) {
				System.out.println(array[i]);
				break;
			}
		}
	}

}
