package Array;
import java.util.Scanner;
public class Smallest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++) {
        	array[i]=sc.nextInt();
        }
        int smallest = findSmallestElement(array);
        System.out.println("The smallest element in the array is: " + smallest);
        sc.close();
	}
	 public static int findSmallestElement(int[] arr) {
		 if (arr == null || arr.length == 0) 
	            throw new IllegalArgumentException("Array must not be empty");
		 int smallest = arr[0];
		 for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < smallest) {
	                smallest = arr[i];
	            }
	        }
		 return smallest;
	 }
}
