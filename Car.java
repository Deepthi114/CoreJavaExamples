class Car
{
	String drive;

	Car()
	{
		System.out.println("Enter the car details");
	}
	
}
class Honda extends Car
{
	Honda()
	{
		this.drive="4Wheel";
		System.out.println("Honda Drive:"+this.drive);
	}

}
class Toyota extends Car
{
	Toyota()
	{
		this.drive="2Wheel";
		System.out.println("Toyota Drive:"+this.drive);
	}
	public static void main(String[]args)
	{
		Car c=new Car();
		Toyota t=new Toyota();
		Honda h=new Honda();

	}

}

