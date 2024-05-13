package May3;

import java.util.Scanner;

public class Divisible9 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num>=100&&num<=999) {
			if(num%9==0) {
				System.out.println("Number "+num+" is divisible by 9.");
			} else 
				System.out.println("Number "+num+" is not divisible by 9.");
		}
	}
}
