package week1.day3;

public class PrintDuplicateValuesInArray {

	public static void main(String[] args) {
		int[] arr= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		//compare values use for loop
		
for (int i=0;i<arr.length;i++) {
	
	for (int j=i+1;j<arr.length;j++) {
		//compare values
		
		if(arr[i]==arr[j]) {
			
		
				System.out.println("print duplicate value: "+ arr[j]);
					//break;
					
		}
	}
}
	}
}
	


