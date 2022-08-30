package notecount.main;

import java.util.Scanner;
 
public class NoteCountDriver {
	
	public static void main(String[]args) {
	
		
		System.out.println("Enter the size of transaction array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int [] arr = new int [size];
		System.out.println("Enter the values of array");
		
//		System.out.println("Enter the currency denominations value ");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		int targetNumbers = sc.nextInt();
		
		
		for(int i=0;i<targetNumbers;i++) {
			int sum=arr[0];
			System.out.println("Enter the value of targe");
			int target = sc.nextInt();
			for(int j=0;j<arr.length;j++) {
				if(sum<target) {
					int val=j+1;
					System.out.println("Target achieved after "+val+" transaction");
					break;
				}else {
					sum=sum+arr[j];
				}
			}
			sum=arr[0];
		}
	}

}
