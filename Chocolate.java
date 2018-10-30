class World
{
 String name;
 int flavors;
int pack;
int collections;
String myChoice;
	
	World(String name,String location,int flavors)
	{ 
		System.out.println("Factory Name="+name);
		System.out.println("Address="+location);
		System.out.println("Flavors="+flavors);
	}
}

class Chocolate extends World
{
	Chocolate()
	{
		super("Lindt Chocolates","Switzerland",12);
		this.collections=4;
		this.myChoice="Truffle";
		System.out.println("Collections:"+this.collections);
		System.out.println("My choice:"+this.myChoice);
	}
public static void main(String[]args)
	{
		Chocolate cho=new Chocolate();
	}
}

		
		