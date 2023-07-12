package OOPS;
import java.util.*;
public class Array {
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number of Students");
		int no = s.nextInt();
		int []a=new int[no];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the marks of Student "+i);
			a[i] = s.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			System.out.println("The marks of Student "+i+" is "+a[i]);	
		}

//		int [][][]b=new int[3][2][3];
//		Scanner sc = new Scanner(System.in);
//		for(int i=0; i<b.length;i++) {
//			for(int j=0; j<b[i].length;j++) {
//				for(int k=0;k<b[i][j].length;k++) {
//					System.out.println("Enter the marks of School "+i+" class "+j+" Student "+k);
//				    b[i][j][k]=sc.nextInt();
//				}
//			}
//		}
//		for(int i=0; i<a.length;i++) {
//			for(int j=0; j<b[i].length;j++) {
//				for(int k=0;k<b[i][j].length;k++) {
//					System.out.print(b[i][j][k]+" ");
//				}System.out.print("  ");
//			}System.out.println();
//		}	
//		
//		int [][][]c= {{{1,2},{2,4}},{{3,2},{3,4}}};
//		for(int i=0; i<c.length;i++) {
//			for(int j=0; j<c[i].length;j++) {
//				for(int k=0;k<c[i][j].length;k++) {
//					System.out.print(c[i][j][k]+" ");
//				}System.out.print("  ");
//			}System.out.println();
//		}
		
	}
}
