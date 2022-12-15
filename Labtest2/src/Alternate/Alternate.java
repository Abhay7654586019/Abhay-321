package Alternate;

public class Alternate {
	public static int sumOfArrayElement(int arr[]) {
		int sum = 0;
		for(int i:arr) {
			sum = sum +i;
		}
		return sum;
		
	}
	
	
	public static void main(String args[]) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int arr1[]=new int[5];
		int index =0;
		
		for (int i = 0; i <= 9; i++) {	
			if (i % 2 == 0) {
				arr1[index] = arr[i];
				index++;
			}
		}
		
		
		for (int i = 0; i <= 4; i++) {
			System.out.print(arr1[i]+" ");
		}
		
		int sum = sumOfArrayElement(arr1);
		System.out.println("\nSum of element "+sum);

		
	}

}
