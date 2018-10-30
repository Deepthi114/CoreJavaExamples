class Pinky 
{
	void m1()
	{
		System.out.println("Pinky m1 method");
		System.out.println("Pinky i love you");
	}
	void m1(int a)
	{
		System.out.println("Pinku 1-argument");
	}
}
	
class Funny extends Pinky 
	{
	void m1()
		{
		System.out.println("Funny m1 method");
		}
	void m2()
		{
		System.out.println("Funny m2 method");
		}
	
	public static void main(String[] args) 
	{
		Pinky p=new Funny();
		p.m1();
		p.m1(10);
		Pinky p1=new Pinky();
		p1.m1();
		new Funny().m2();


	}
}

