package week1.day3;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data= {3,2,11,4,6,7};
		Arrays.sort(data);
		
		for (int i =0; i<data.length-1;i++) {
			
			if(data[4]==data[i]+1) {
				
				System.out.println(data[i+1]);
				
			}
			
		}
		

	}

}
