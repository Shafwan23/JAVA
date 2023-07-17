package OOPS;

class Demo1{                   // final means cannot be inherited
	int a=10;                  //final means cannot be changes the value
	void trys() {              //final means can  inherited but cannot be overridden
		System.out.println("yoooo");
	}
}
class Demo2 extends Demo1{
	void lol() {
	int b=20;
	System.out.println(b);
	}
}
public class FinalConcept {
	public static void main(String args[]) {
		Demo2 d = new Demo2();
		d.lol();
	}
}



