package Array;
import java.util.Arrays;
import java.util.Scanner;
public class Largest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int largest = largestElementArray(arr);
		System.out.println("The largest element in the array is "+largest);
		sc.close();
	}
	public static int largestElementArray(int[] arr) {
		int largest = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest)
				largest = arr[i];
		}
		return largest;
		
		
//		int largest = arr[0];
//		int secondLargest= arr[0];
//		for(int i=1;i<arr.length;i++) {
//			if(arr[i]>largest)
//				largest = arr[i];
//			else if(arr[i]>secondLargest&&secondLargest<largest)
//				secondLargest = arr[i];
//		}
//		return secondLargest;
		
		
//		Arrays.sort(arr);
//		int largest = arr[arr.length-1];
//		return largest;
	}
}
