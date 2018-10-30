class Text() 
{
	void m1(X x, Emp e)
	{
		System.out.println("m1 method");
	}
	void m2(Y y,Student s)
	{
		System.out.println("m2 method");
	
	}


	public static void main(String[] args) 
	{
		Text t=new Text();
		X x1=new X();
		Emp e1=new Emp();
		t.m1(10,001);

		Y y1=new Y();
		Student s1=new Student();
		Text.m2(20,111);

	}
}
