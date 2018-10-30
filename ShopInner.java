class Shopping
{
	Shopping()
	{
		final String mallName="Clarks burg Outlet Mall";
		class HandBag
		{
			String name="Kate Spade";
			String cost="$450";
			HandBag()
			{
				System.out.println("Mall Name :"+mallName);
				System.out.println("Bag Brand :"+name);
				System.out.println("Cost :"+cost);
			}
		}
		HandBag hb=new HandBag();
	}
}
class ShopInner
{
	public static void main(String[] args)
	{
		Shopping s=new Shopping();
	}
}