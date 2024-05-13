package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Original Array: " + Arrays.toString(arr));
		reverse(arr);
		System.out.println("Reversed Array: " + Arrays.toString(arr));
	}
	public static void reverse(int[] arr) {
			 int start = 0;
		     int end = arr.length - 1;
		     while (start < end) {
		    	 int temp = arr[start];
		         arr[start] = arr[end];
		         arr[end] = temp;
		         start++;
		         end--;
		        }
	        }
}
