class ExceptionHandling
{
	public static void main(String args[])
	{
		int a[]={1,2,3,4,5};
		System.out.println("Mahesh");
		System.out.println("Mahesh");
		try
		{
			System.out.println(10/0);
			System.out.println(a[9]);
			
		}
		catch (ArithmeticException ae)
		{
			

		}
		catch(ArrayIndexOutOfBoundsException ab)
		{
		}

		
		System.out.println("Mahesh");
		
		System.out.println(a[0]);
		System.out.println(a[3]);
		
	}

}