class Emp
{
	String name;
	int id;
	float salary;
	
	Emp(String name,int id,float salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	void info()
	{
		System.out.println("Emloyee Name:"+name);
		System.out.println("Employee ID:"+id);
		System.out.println("Salary:"+salary);
	}
public static void main(String []args)
{
	Emp e1=new Emp("Deepthi",111,8600.99f);
	e1.info();
	Emp e2=new Emp("Mahesh",222,8700.99f);
	e2.info();
}
}
		
output

C:\Users\deept\Documents\Java by DS\java progms\Rohit\Deepu>javac EmpThis.java

C:\Users\deept\Documents\Java by DS\java progms\Rohit\Deepu>java Emp
Emloyee Name:Deepthi
Employee ID:111
Salary:8600.99
Emloyee Name:Mahesh
Employee ID:222
Salary:8700.99

		
