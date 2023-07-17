package OOPS;

//one-one-Association(Setter Injection)
class Employee {

	// instance variables
	private Integer eid;
	private String ename;
	private String eaddress;

	// HAS-A variable injection
	private Account account;

	
	//setters are used to perform setter injection
	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	// code for displaying the data of Employee
	public void display() {
		System.out.println("Employee:: display method called");
		System.out.println("*************EMPLOYEE DETAILS ARE****************");
		System.out.println("EID    is  :: " + eid);
		System.out.println("ENAME  is  :: " + ename);
		System.out.println("EADDR  is  :: " + eaddress);
		System.out.println("**************ACCOUNT DETAILS ARE*****************");
		System.out.println("ACCNO   is  ::" + account.getAccNo());
		System.out.println("ACCTYPE is  ::" + account.getAccType());
		System.out.println("ACCNAME is  ::" + account.getAccName());

	}

}
class Account {

	// instance variables
	private String accNo;
	private String accType;
	private String accName;

	// setters are used to perform setter injection
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	// Sending the data to the users through getters
	public String getAccNo() {
		return accNo;
	}

	public String getAccType() {
		return accType;
	}

	public String getAccName() {
		return accName;
	}

}

//----------------------------------------------------------------------------

//one-one-Association(Constructor Injection)
class Employee1 {

	// instance variables
	private Integer eid1;
	private String ename1;
	private String eaddress1;

	// HAS-A variable injection
	private Account1 account1;

	// Performing constructor Injection(alt+shift+s,o)
	public Employee1(Integer eid1, String ename1, String eaddress1, Account1 account1) {
		System.out.println("Employee:: Constructor");
		this.eid1 = eid1;
		this.ename1 = ename1;
		this.eaddress1 = eaddress1;
		this.account1 = account1;
	}

	// code for displaying the data of Employee
	public void display1() {
		System.out.println("Employee:: display method called");
		System.out.println("*************EMPLOYEE DETAILS ARE****************");
		System.out.println("EID    is  :: " + eid1);
		System.out.println("ENAME  is  :: " + ename1);
		System.out.println("EADDR  is  :: " + eaddress1);
		System.out.println("**************ACCOUNT DETAILS ARE*****************");
		System.out.println("ACCNO   is  ::" + account1.getAccNo1());
		System.out.println("ACCTYPE is  ::" + account1.getAccType1());
		System.out.println("ACCNAME is  ::" + account1.getAccName1());

	}

}
class Account1 {

	// instance variables
	private String accNo1;
	private String accType1;
	private String accName1;

	// Performing Constructor Injection
	public Account1(String accNo1, String accType1, String accName1) {
		System.out.println("Account:: Constructor");
		this.accNo1 = accNo1;
		this.accType1 = accType1;
		this.accName1 = accName1;
	}

	//Sending the data to the users
	public String getAccNo1() {
		return accNo1;
	}

	public String getAccType1() {
		return accType1;
	}

	public String getAccName1() {
		return accName1;
	}

}

//---------------------------------------------------------------------------
class Department {

	// instance variables
	private Integer deptNo;
	private String deptName;
	private String deptLoc;

	// HAS-A variable
	private Employee2[] employees2;

	// Performing constructor injection
	public Department(Integer deptNo, String deptName, String deptLoc, Employee2[] employees2) {
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.deptLoc = deptLoc;

		// HAS-A variable injection through constructor
		this.employees2 = employees2;
	}

	//rendering the message to the user
	public void display() {
		System.out.println("**************DEPARTMENT DETAILS************************");
		System.out.println("DEPTNO    IS    :: " + deptNo);
		System.out.println("DEPTNAME  IS    :: " + deptName);
		System.out.println("DEPTLOC   IS    :: " + deptLoc);

		System.out.println("***********************************************************");
		System.out.println("*************EMPLOYEE DETAILS******************************");

		for (Employee2 employee2 : employees2) {
			System.out.println("EID    IS    :: " + employee2.getId2());
			System.out.println("ENAME  IS    :: " + employee2.getEname2());
			System.out.println();
		}

	}

}

class Employee2 {
	
	//instance variables
	private Integer id;
	private String ename;

	// Constructor injection
	public Employee2(Integer id, String ename) {
		this.id = id;
		this.ename = ename;
	}

	
	//getters to get the value
	public Integer getId2() {
		return id;
	}

	public String getEname2() {
		return ename;
	}

}

//----------------------------------------------------------------------

public class Association {
	//relationship
	//1.IS-A relationship is used for  inheritance
	//2.FOR-A relationship is used for association
	//Dependency Injection - injecting the dependent object into target object
	//ex: dependent - address(city/pin/dooNO)
//	    target    - Student(name/rollNo/address)
	//dependency injection is of two types
	//1.constructor injection 2.setter injection
	
	public static void main(String args[]) {
		// Creating an Dependent object
				Account account = new Account();

				// performing setter injection to inject the values
				account.setAccName("sachin");
				account.setAccNo("ISB-222");
				account.setAccType("current");

				// Create a Target object and inject the dependent object in the constructor
				Employee employee = new Employee();
				employee.setEid(10);
				employee.setEname("sachin");
				employee.setEaddress("IND");

				// Performing Setter injection to account
				employee.setAccount(account);

				// checking the data of employee to see whether injection happened or not
				employee.display();
				
				System.out.println("--------------------------------------------");
				
				//-----------------------------------------------------------------------------
				
				// Creating an Dependent object through constructor
				Account1 account1 = new Account1("ISB-1111", "savings", "sachin");

				// Create a Target object and inject the dependent object in the constructor
				Employee1 employee1 = new Employee1(10, "sachin", "MI", account1);

				// checking the data of employee to see whether injection happened or not
				employee.display();
				
				System.out.println("---------------------------------------------");
				
				//--------------------------------------------------------------------------------------

				// Creating an Dependent Object using Constructor injection
				Employee2 emp1 = new Employee2(10, "sachin");
				Employee2 emp2 = new Employee2(18, "kohli");
				Employee2 emp3 = new Employee2(45, "rohith");

				// Creating an Array to perform One-Many Association
				Employee2[] employees2 = new Employee2[3];
				employees2[0] = emp1;
				employees2[1] = emp2;
				employees2[2] = emp3;

				// Creating an Target Object using Constructor Injection
				Department department = new Department(123, "BCCI", "Dubai", employees2);
				department.display();
	}
}
