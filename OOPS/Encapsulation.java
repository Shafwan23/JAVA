package OOPS;

class Bank{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String x) {
		if(x=="AYAAN")
			name=x;
		else
			System.out.println("Invalid Type");
	}
}

class Fan{
	private int cost;
	private String Brand;
	
	public int getCost() {
		return cost;
	}
	public String getBrand() {
		return Brand;
	}
	
//	public void setCost(int cost) {
//		this.cost = cost;
//	}
//	public void setBrand(String Brand) {
//		Brand = Brand;
//	}
	Fan(int cost,String Brand){         // -
		this.cost=cost;                 //  |  Enhanced setter => Constructor
		this.Brand = Brand;             // -
	}
	
}

public class Encapsulation {
	public static void main(String args[]) {
		Bank b = new Bank();
//		System.out.println(b.name);
		System.out.println(b.getName());
		
//		b.name="lol";
//		System.out.println(b.name);
		b.setName("AYAAN");
		System.out.println(b.getName());
		b.setName("23");                   //numbers cannot be someone's name. so we are settting conditions on seter
		
//		Fan f = new Fan();                     -
//		f.setCost(5000);                        |
//		f.setBrand("Bajaj");                    |    for normal setters
//		System.out.println(f.getCost());        |
//		System.out.println(f.getBrand());      -
	
		Fan f = new Fan(5000,"Bajaj");
		System.out.println(f.getCost());
		System.out.println(f.getBrand());
		
		Shafwan s1 = new Shafwan();
		System.out.println(s1.getAge());
		System.out.println(s1.getName());
		Shafwan s2 = new Shafwan(10);
		System.out.println(s2.getAge());
		System.out.println(s2.getName());
		
	}
}

class Shafwan{
	int age;
	String name;
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public Shafwan() {
		this(23,"Shaf");
	}
	public Shafwan(int age, String name) {
		this.age=age;
		this.name=name;
	}
	public Shafwan(int age) {
		this();
		this.age=age;
	}
}
