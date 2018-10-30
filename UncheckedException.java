class UncheckedException
{
	public static void main(String[]args)
	{
		int a[]={10,20,30,40,50};
		String name="Deepu";
		System.out.println(a[2]);
		System.out.println(name.charAt(2));
		try
		{
			System.out.println(a[6]);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			//e.printStack
		}


		/*C:\Users\deept\Documents\Java by DS\java progms\Rohit\Deepu>java UncheckedException
		30
		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 6
        at UncheckedException.main(UncheckedException.java:7)*/
		System.out.println(a[1]);//after exception nothing is executed.
	}

}