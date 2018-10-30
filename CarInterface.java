interface Vehicle 
{	//all the abstract methods 
	public void details();
	public void interior();
	public void exterior();
}
class Honda implements Vehicle
{	//instant variables
	String make;
	String model;
	static int year=2018;//static variable
	String milage;
	String bodyStyle;
	String transmission;
	String drive;
	static String doors="4 Door";//static variable
	String seats;
	String windows;
	String player;
	String surroundings;
	String price;
	public void details()
	{	//this keyword
		this.make="Honda";
		this.model="Accord";
		this.price="$23,570";
		System.out.println("ENTER THE HONDA DETAILS");
		System.out.println("Make:"+this.make);
		System.out.println("Model:"+this.model);
		System.out.println("Year:"+this.year);
		System.out.println("Price :"+price);
	}	
	public void exterior()
	{
		this.milage="30/City , 38/Highway";
		this.bodyStyle="Sedan";
		this.transmission="Automatic";
		this.drive="4Wheel Drive";		
		System.out.println("Milage:"+this.milage);
		System.out.println("Body Style:"+this.bodyStyle);
		System.out.println("Transmission:"+this.transmission);
		System.out.println("Drive:"+this.drive);
		System.out.println("Doors:"+this.doors);
	}
	public void interior()
	{
		this.seats="5 Leather and Heat Seating";
		this.windows="Power Windows";
		this.player="Sony";
		this.surroundings="3D Music System";
		System.out.println("Seating:"+this.seats);
		System.out.println("Windows:"+this.windows);
		System.out.println("Player:"+this.player);
		System.out.println("Surroundings:"+this.surroundings);
	}
}
class Toyota extends Honda implements Vehicle
{
	public void details()
	{
		this.make="Toyota";
		this.model="Camry";
		this.price="$23,645";
		System.out.println("ENTER THE TOYOTA DETAILS");
		System.out.println("Make:"+this.make);
		System.out.println("Model:"+this.model);
		System.out.println("Year:"+this.year);
		System.out.println("Price :"+price);
	}	
	public void exterior()
	{
		this.milage="29/City , 41/Highway";
		this.bodyStyle="Sedan";
		this.transmission="Automatic";
		this.drive="4Wheel Drive";
		System.out.println("Milage:"+this.milage);
		System.out.println("Body Style:"+this.bodyStyle);
		System.out.println("Transmission:"+this.transmission);
		System.out.println("Drive:"+this.drive);
		System.out.println("Doors:"+this.doors);
	}
	public void interior()
	{
		this.seats="5 Leather and Heat Seating";
		this.windows="Power Windows";
		this.player="AM/FM Sterio , Sony Player";
		this.surroundings="3D Music System";
		System.out.println("Seating:"+this.seats);
		System.out.println("Windows:"+this.windows);
		System.out.println("Player:"+this.player);
		System.out.println("Surroundings:"+this.surroundings);
	}
}
class CarInterface
{
	public static void main(String []args)
	{
		Vehicle h;
		h=new Honda();
		h.details();
		h.exterior();
		h.interior();
		h=new Toyota();
		h.details();
		h.exterior();
		h.interior();
	}
}

