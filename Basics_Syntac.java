Main Import:

class Classname
{
	// Class body 

		1.Variables
		2.Methods
		3.Constructors
		4.Instant Blocks
		5.Static Blocks
}


 class Classname 
				{
					//class body
				} 
Eg:

class Car // first leter capital
{
	//class body 
}


1. Variables:

class Car
{

//Instance Variable -> varibles inside the class 
String model="Honda Accord"; 
String color="Black";
int year=2007;


//Local Variables -> Inside the Class & Inside the method 



//Static Variables -> Inside the Static Block

}



2. Methods:

void details()  // void details ( parameters)
{
	int door; // Local Variable 

	System.out.println("Car Model =" +model);

	//Method body 
}

EG:

class Car
{
	String model="Honda Accord"; 
	String color="Black";
	int year=2007;
	String name;

	void details() 
	{
		int door;
		System.out.println("Car Model =" +model);

	}

	String fit(String fname)
	{
		this.name=fname;
		//String name="Honda Fit";
		System.out.pritnln("Car Name ="+fname);
		return fname;
	}
}


3.Constructor : Same as ClassName

Car()
{
	//constructor block
}


Eg:

class Car
{
	String model="Honda Accord"; 
	String color="Black";
	int year=2007;
	String name;

	Car()
	{
			System.out.println("My Car");

	}

	void details() 
	{
		int door;
		System.out.println("Car Model =" +model);

	}

	String fit(String fname)
	{
		this.name=fname;
		//String name="Honda Fit";
		System.out.pritnln("Car Name ="+fname);
		return fname;
	}
}

class CarExample
{
	public static void main(String []args)
	{

		Cars c=new Cars();
		
		c.details();
		System.out.println("Name="+c.fit("Honda Fit"));



	}
}





