import java.util.Arrays;
import java.util.Scanner;
public class ArraySwap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=sc.nextInt();
		System.out.println(Arrays.toString(arr));
		System.out.println("enter the swap location number");
		int n=sc.nextInt();    //2
		
		int temp = arr[n-1];     //3
		arr[n-1]=arr[arr.length-n]; //3->7
		arr[arr.length-n]=temp;  //7->3
		
		System.out.println(Arrays.toString(arr));
	}
}
