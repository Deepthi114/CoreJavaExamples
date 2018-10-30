class College
{
	String name;
	String location;
	String course;
	void details()
	{
		this.name="University Of The Cumberlands";
		this.location="KY";
	}
	void show()
	{
		System.out.println("College Name:"+this.name);
		System.out.println("College Location:"+this.location);
	}
}
class Student extends College
{
	void details()
	{
		this.name="Deepthi Lavanya";
		this.location="VA";
		this.course="Masters in ISS";
	}
	void show()
	{
		System.out.println("Student Name:"+this.name);
		System.out.println("Location:"+this.location);
		System.out.println("Course:"+this.course);
	}
}
class StudentOverriding
{
public static void main(String []args)
{
College c=new Student();
c.details();
c.show();
c=new College();
c.details();
c.show();
}
}

Output:
C:\Users\deept\Documents\Java by DS\java progms\Rohit\Deepu>javac StudentOverriding.java

C:\Users\deept\Documents\Java by DS\java progms\Rohit\Deepu>java StudentOverriding
Student Name:Deepthi Lavanya
Location:VA
Course:Masters in ISS
College Name:University Of The Cumberlands
College Location:KY
	

		