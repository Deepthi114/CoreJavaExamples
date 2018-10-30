interface Education
{
	public void details();
}
class College implements Education
{
	String name;
	String location;
	int noOfPrograms;
	double rating;

	College()
	{
		this(4.7);
		this.name="Stratford";
		this.location="Virginia";
		this.noOfPrograms=10;
		
	}
	public void details()
	{
		System.out.println("Enter the college Details");
		System.out.println("Name of the college:"+this.name);
		System.out.println("Location:"+this.location);
		System.out.println("No of Programms in the college:"+this.noOfPrograms);
		System.out.println("Rating:"+rating);
	}
	College(double rating)
	{
		this.rating=rating;		
	}		
}
class Student extends College implements Education
{
	Student()
	{
		this.name="Jyoshna";
		this.location="Fairfax, VA";
		this.noOfPrograms=2;
	}
	public void details()
	{
		System.out.println("Name of the college:"+this.name);
		System.out.println("Location:"+this.location);
		System.out.println("No of courses:"+this.noOfPrograms);
	}
	public static void main(String []args)
	{
		Education e;
		e=new College();
		e.details();
		e=new Student();
		e.details();

	}


}
