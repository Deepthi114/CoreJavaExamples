abstract class Shopping
{
	abstract void shoeDetails();
}
class ShoppingInner
{
	public static void main(String[]args)
	{
		Shopping s=new Shopping()
		{
			String brand="Nike";
			int size=8;
			String brandName;
			String style;
			void shoeDetails()
			{
				System.out.println("Brand of my Choice :"+brand);
				System.out.println("Size :"+size);
			}
		};
		s.shoeDetails();	
	}
}

Output:
C:\Users\deept\Documents\Java by DS\java progms\Rohit\Deepu>javac ShoesInner.java

C:\Users\deept\Documents\Java by DS\java progms\Rohit\Deepu>java ShoppingInner
Brand of my Choice :Nike
Size :8