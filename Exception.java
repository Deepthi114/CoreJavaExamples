class ExceptionDemo
{
	public static void main(String[]args)
	{
		int a=10,b=0;
		System.out.println("Addition:"+(a+b));
		try
		{
			System.out.println("Division:"+(a/b));
		}
		catch (ArithmeticException ex)
		{
			ex.printStackTrace();
		}

		
	}
}