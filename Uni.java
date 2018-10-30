class University
{
	String name;
	String location;
	int buildingNum;
	University(String name,String location,int buildingNum)
	{
		System.out.println("Name:"+name);
		System.out.println("Location:"+location);
		System.out.println("Bulding Number:"+buildingNum);	
	}
		
}
class Student extends University
{
	
	Student()
	{
		super("Umberlands","Kentucky",12345);
		this.name="Mouni";
		this.location="Fairfax";
		this.buildingNum=7777;
	}
	void info()
	{
		
		System.out.println("Name:"+name);
		System.out.println("Location:"+location);
		System.out.println("Bulding Number:"+buildingNum);	
	}
public static void main(String[]args)
{
	Student s=new Student();
	s.info();
	
}
}
		
		

	