import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int number=n;
		int sum = 0;
		while(n!=0) {
			int ld = n%10;
			sum = sum*10 + ld; //3 35 351
			n=n/10;
		}
		if(number==sum)
			System.out.println("It's a Palindrome");
		else
			System.out.println("It's not a Palindrome");
	}
}
