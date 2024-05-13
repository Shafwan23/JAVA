import java.util.Scanner;
public class Amstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int sum=0;
		int temp=n;
		while(temp!=0) {
			int lastDigit=temp%10;
			temp=temp/10;
			sum=sum+(lastDigit*lastDigit*lastDigit);
		}
		if(sum==n)
			System.out.println("It's a Amstrong Number");
		else
			System.out.println("It's not a Amstrong Number");
	}
}


