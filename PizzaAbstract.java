abstract class Pizza
{
	String item="Chiken Pizza";
	String bill="$18.96";
	
	Pizza(String location,double rating)
	{
		System.out.println("Papa John's Pizza");
		System.out.println("Location:"+location);
		System.out.println("Rating :"+rating);
	}
	abstract void order();

	
}
class PapaJohns extends Pizza
{
	 PapaJohns()
	{
		 super("Fairfax",4.8);
		 
	}
	void order()
	{
		System.out.println("Order :"+this.item);
		System.out.println("Bill:"+this.bill);
	}
	public static void main(String [] args)
	{

		PapaJohns pj=new PapaJohns();
		pj.order();
		
	}

}
