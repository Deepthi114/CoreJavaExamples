class Test 
{
	int a=200;
	int b=400;
	static int c=100;
	static int d=300;

	void m1()
	{
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(Test.c);
	}

	static void m2()
	{
		Test t = new Test();

		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(t.d);
		t.m1();

	}
	
	public static void main(String[] args) 
	{
		Test p = new Test();
		p.m1();
		Test.m2();
	}
}
