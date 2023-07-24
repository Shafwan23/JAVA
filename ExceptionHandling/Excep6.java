package ExceptionHandling;

public class Excep6 {

	public static void main(String[] args) throws Exception
	{
		//Run Time Exception
		
		System.out.println("First line");
		
			Thread.sleep(5000);
		
		System.out.println("last line");

	}

}

/*
usage of wrapper class
1. valueOf() method
We can use the valueOf() method to create a Wrapper object for a given primitive or String.
ex: Integer i1 = Integer.valueOf("10"); //10
    Integer i2 = Integer.valueOf(10): //10

2. xxxValue() method
We can use xxxValue() methods to get the primitive for the given Wrapper Object. 
ex: 

3. parsexxx() method
We can use parsexxx() methods to convert String to primitive.
 
4. toString() method
We can use the toString() method to convert the Wrapper object or primitive to String. 
*/