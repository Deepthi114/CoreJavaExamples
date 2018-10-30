class Parents 
{
	static void m1()
	{
		System.out.println("parent m1");
	}
	void m2()
	{
		System.out.println("parent m2");
	}
	
}
class Childs extends Parents
{
	static void m1()
	{
		System.out.println("child m1");
	}
	void m2()
	{
		System.out.println("child m2");
	}
	
	public static void main(String[] args) 
	{
		Parents p = new Childs();
		p.m1();
		p.m2();

		Childs c=(Childs)p;
		c.m1();



	}
}







	