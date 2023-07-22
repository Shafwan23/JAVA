package OOPS;

@FunctionalInterface               //so that no one can make any methods in the interface , if they means it'll be not FI..so
interface First23{
	void disp();                   //only one abstract method, so we called as Functional Interface
}
class Second23 implements First23{
	public void disp() {
		System.out.println("Implementing the body");
	}
}
public class Fi14 {
	public static void main(String args[]) {
		First23 f = new Second23();
		f.disp();
	}

}
