class Test
{
	int m=1000;
	int p=2000;
	static int a=10;
	static int b=30;
	public static void main(String[] args)
	{
		System.out.println(Test.b);
		System.out.println(Test.a);
		Test t=new Test();
		Test d=new Test();
		Test p=new Test();
		t.m1();
		d.m2();
		p.m3();
	}
	
	void m1()
	{
		System.out.println(Test.a);

	}

	void m2()
	{ 
		System.out.println(Test.b);
	}
	void m3()
	{ 
		System.out.println(p);
	}
	
}