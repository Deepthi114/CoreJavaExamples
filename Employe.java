import java.util.Scanner;
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
		Scanner sc=new Scanner(System.in);
		Employee.empCompany="Google";
		Employee.empBranch="Research and Development";
		Employee.empState="Virginia";

		Employee deepu=new Employee();
		Employee mouni=new Employee();

		System.out.println("Enter the Employee Deepu details");

		int id=sc.nextInt();
		int age=sc.nextInt();
		String sex=sc.next();
		
	}
}