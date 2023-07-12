package OOPS;

class Instance{
	int a;
	double b=5.5;
}
class Local{
	public void show() {
		int a;
		double b=6.5;
//		System.out.println(a);   it will give error because we should declare the values in local
		System.out.println(b);
	}
}
class Constructor{
	public int addNum(int x , int y){
		return x+y;
	}
}

public class InstanceLocal {
	public static void main(String ags[]) {
		Instance i = new Instance();
		System.out.println(i.a);
		System.out.println(i.b);
		
		Local l = new Local();
		l.show();
        
		Constructor c = new Constructor();
		int lol=c.addNum(5,6);
		System.out.println(lol);
	}
}
