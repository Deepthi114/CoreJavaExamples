class PetAnimals
{
	String name;
	String lifeSpan;
	String eats;
	PetAnimals()
	{
		this.name="Golden Retriever";
		this.lifeSpan="10-12 Years";
		this.eats="Meat";
		System.out.println("Name of Pet Dog :"+this.name);
		System.out.println("Life Span:"+this.lifeSpan);
		System.out.println("Eats :"+this.eats);
	}
	class Fish
	{	Fish(String name,String eats)
		{
		System.out.println("Name of Fish :"+name);
		System.out.println("Eats :"+eats);
		}
	}
}
class FishesInner
{
	public static void main(String[]args)
	{	
		PetAnimals pa=new PetAnimals();
		PetAnimals.Fish f=pa.new Fish("Tiger Shark","Baby Shrimp");
		
	}
}
