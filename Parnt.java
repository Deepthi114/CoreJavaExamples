class Parnt 
{
	private void m1()
	{
		System.out.println("parent m1");
	}

}
class Child extends Parnt 
{
	void m1()
	{
		System.out.println("child m1");
	}
	public static void main(String[] args) 
	{
		//Parnt p= new Child();
		//p.m1();

		Child c = new Child();
		c.m1();
	
	}
}
