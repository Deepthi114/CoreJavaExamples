class Parent  
{
	Parent()
	{
		System.out.println("parent cls 0-arg const");
	}
	class Child extends Parent
	{
		Child()
		{
			this(10);
			
			System.out.println("Child clss 0-arg");
		}
		Child(int a)
		{
			super();
			System.out.println("Child cls 1-arg");
		}
	}
	public static void main(String[] args) 
	{
		new Child();
	}
}
