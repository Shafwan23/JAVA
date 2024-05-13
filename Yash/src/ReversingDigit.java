import java.util.Scanner;
public class ReversingDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int sum = 0;
		while(n!=0) {
			int ld = n%10;
			sum = sum*10 + ld; //3 35 351
			n=n/10;
		}
		System.out.println(sum);
	}
}
