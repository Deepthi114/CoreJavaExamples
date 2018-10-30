class Test
{
	static int a=10;
	static int b=30;
	public static void main(String[] args)
	{
		System.out.println(Test.b);
		System.out.println(Test.a);
		Test t=new Test();
		t.m1();
		
	}
	
	void m1()
	{
		System.out.println(Test.a);
		System.out.println(Test.b);

	}
}