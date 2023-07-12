package OOPS;

class Boo{
	int coin=5;
	public void callingFunc(){
		System.out.println("Hello");
		System.out.println(coin);
	}
}

public class Basics {
//	1960 B language was not sstructured
//	then C came working on Procedual/functional Manner (POP)
//	After that Objects came (OOP) with was used by java
//	then c uses oop by making a new language called c with classes
//	afer that the name changed to C++
//	class - virtual entity , object - real world entity (entity-things)
	
	public static void main(String args[]) {
		Boo lame = new Boo();
		lame.coin=8;
		lame.callingFunc();
	}
}

