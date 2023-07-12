package OOPS;
import java.util.Scanner;

import java.io.IOException;

class Hello{
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public void add(int a,int b,int c) {             //method overloading
		System.out.println(a+b);
	}
}

public class Overloading {
	public static void main (String args[]) throws IOException {
		Hello h = new Hello();
//		int a = System.in.read() -48;
//		int b = System.in.read() -48;         it can only read one character at a time. so we using Scanner class
//		int c = System.in.read() -48;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
;		h.add(a,b);                //delegate (giving someone else the work to do)
		h.add(a,b,c);	
	}
}
