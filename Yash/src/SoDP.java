import java.util.Scanner;
public class SoDP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int sum1=0;
		int sum2=0;
		int temp=n;
		while(temp!=0) {
			int lastDigit=temp%10;
			temp=temp/10;
			sum1=sum1+lastDigit;
		}
		int num=sum1;
		while(sum1!=0) {
			int ld = sum1%10;
			sum2 = sum2*10 + ld; //3 35 351
			sum1=sum1/10;
		}
		if(num==sum2)
			System.out.println("It's a Palindrome");
		else
			System.out.println("It's not a Palindrome");
	}
}


