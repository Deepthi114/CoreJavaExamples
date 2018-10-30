class Stest 
{
	{
	System.out.println("instance blocks");
    }
	
	{
	System.out.println("instance blocks 2");
    }
	static	
	{
	System.out.println("Static blocks");
    }
	Stest()
	{
		System.out.println("0-arg");
	}
	Stest(int a)
	{
		System.out.println("1-arg");
	}

	public static void main(String[] args) 
	{
		new Stest();
	
	}
}
