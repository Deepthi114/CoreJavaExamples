class X
{
}
class Emp
{
}
class Y
{
}
class Student
{
}

class Text 
{
	void m1(X x, Emp e)
	{
		System.out.println("m1 method");
	}
	static void m2(Y y,Student s)
	{
		System.out.println("m2 method");
	
	}


	public static void main(String[] args) 
	{
		Text t=new Text();
		X x1=new X();
		Emp e1=new Emp();
		t.m1(x1,e1);

		Y y1=new Y();
		Student s1=new Student();
		Text.m2(y1,s1);

	}
}
