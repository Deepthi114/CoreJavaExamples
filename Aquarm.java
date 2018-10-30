class Aqua
{
int length;
int width;
int height;
String weight;
String size;

Aqua(String size,int length,int width,int height,String weight)
{
	
	System.out.println("Tank size:"+size);
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
	Aqua aq=new Aqua("50Gallowns",36,18,19,"600Lbs");
}
}

Output

C:\Users\deept\Documents\Java by DS\java progms\Rohit\Deepu>javac Aquarm.java

C:\Users\deept\Documents\Java by DS\java progms\Rohit\Deepu>java FishTank
Enter the Aquarium details
Tank size:50Gallowns
Aqua Length:36
Aqua Width:18
Aqua Height:19
Aqua Weight:600Lbs

