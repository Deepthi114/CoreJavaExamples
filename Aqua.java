class Aqua
{
int length;
int width;
int height;
String weight;
String size;

Aqua(String size,int length,int width,int height,String weight)
{
	System.out.println("Enter the Aquarium details");
	System.out.println("Tank size");
	size=sc.next();
	System.out.println("length");
	length=sc.nextInt();
	System.out.println("width");
	width=sc.nextInt();
	System.out.println("height");
	height=sc.nextInt();
	System.out.println("weight");
	weight=sc.next();	
}
void details()
{
	System.out.println("Aqua Length:"+length);
	System.out.println("Aqua Width:"+width);
	System.out.println("Aqua Height:"+height);
	System.out.println("Aqua Weight:"+weight);
}
}
class FishTank
{
public static void main(String [] args)
{
	Aqua aq=new Aqua();
	aq.details();

}
}

Output;

C:\Users\deept\Documents\Java by DS\java progms\Rohit\Deepu>javac Aqua.java

C:\Users\deept\Documents\Java by DS\java progms\Rohit\Deepu>java FishTank
Enter the Aquarium details
Tank size
50gallons
Length
36
width
18
Height
19
Weight
600lbs
Aqua Length:36
Aqua Width:18
Aqua Height:19
Aqua Weight:600lbs




