Program :

class Employee 
{
	int empId;
	int empAge;
	String empSex;
	float empSalary;
	static String empBranch;
	static String empCompany;
	static String empState;
public static void main(String[] args) 
	{
		Employee.empCompany="Google";
		Employee.empBranch="Research and Development";
		Employee.empState="Virginia";

		Employee deepu=new Employee();
		Employee mouni=new Employee();
		
		deepu.empId=111;
		deepu.empAge=24;
		deepu.empSex="F";
		deepu.empSalary=85475;

		mouni.empId=222;
		mouni.empAge=25;
		mouni.empSex="F";
		mouni.empSalary=95356;

		System.out.println("Deepu ID="+deepu.empId);
		System.out.println("Deepu Age="+deepu.empAge);
		System.out.println("Deepu Sex="+deepu.empSex);
		System.out.println("Deepu Salary="+deepu.empSalary);

		System.out.println("Mouni ID="+mouni.empId);
		System.out.println("Mouni Age="+mouni.empAge);
		System.out.println("Mouni Sex="+mouni.empSex);
		System.out.println("Mouni Salary="+mouni.empSalary);

		System.out.println("Company Name="+Employee.empCompany);
		System.out.println("Branch="+Employee.empBranch);
		System.out.println("State="+Employee.empState);
		
	}
}

Output

C:\Users\deept\Documents\Java by DS\java progms\Rohit\Deepu>java Employee
Deepu ID=111
Deepu Age=24
Deepu Sex=F
Deepu Salary=85475.0
Mouni ID=222
Mouni Age=25
Mouni Sex=F
Mouni Salary=95356.0
Company Name=Google
Branch=Research and Development
State=Virginia