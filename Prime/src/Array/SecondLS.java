package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLS {

	public static void main(String[] args) {
		System.out.println("Enter the Size of an array ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		if(arr.length<2)
			System.out.println("-1");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
//		Arrays.sort(arr);
//		int smallest = arr[1];
//		int largest = arr[arr.length-2];
		int smallest = secondSmallest(arr);
		int largest = secondLargest(arr);
		System.out.println("The Second Smallest Number in the Array is "+smallest);
		System.out.println("The Second Largest Number in the Array is "+largest);
		sc.close();
	}
	
	public static int secondSmallest(int[] arr) {
		int smallest = arr[0];
		int secondSmallest= arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<smallest)
				smallest = arr[i];
			else if(arr[i]<secondSmallest&&secondSmallest>smallest)
				secondSmallest = arr[i];
		}
		return secondSmallest;
	}
	public static int secondLargest(int[] arr) {
		int largest = arr[0];
		int secondLargest= arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest)
				largest = arr[i];
			else if(arr[i]>secondLargest&&secondLargest<largest)
				secondLargest = arr[i];
		}
		return secondLargest;
	}
}
