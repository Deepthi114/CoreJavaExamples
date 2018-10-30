class Apartment
{
	String name;
	int roomNum;
	String location;
	int buildingNum=8137;
	int floor=2;
	int noOfRooms=3;

	Apartment(String name,int noOfApartments,String location,int buildingNum)
	{
		System.out.println("Apartment Name:"+name);
		System.out.println("Num of Apartments:"+noOfApartments);
		System.out.println("Location:"+location);
		System.out.println("Leasing office:"+buildingNum);
	}
}
class Room extends Apartment
{
	Room()
	{
		super("Merrifield",400,"Vienna",8133);
		System.out.println("Our Building Number:"+this.buildingNum);
		System.out.println("Num of Rooms:"+this.noOfRooms);
		System.out.println("Floor:"+this.floor);
				
	}
	Room(int noOfRoomets)
	{
		this();
		System.out.println("Number of people in the Room:"+noOfRoomets);
	}
		
}
class X
{
public static void main(String[]args)
{
	Room r=new Room(2);
		
}
}

Output:

C:\Users\deept\Documents\Java by DS\java progms\Rohit\Deepu>javac Apt.java

C:\Users\deept\Documents\Java by DS\java progms\Rohit\Deepu>java X
Apartment Name:Merrifield
Num of Apartments:400
Location:Vienna
Leasing office:8133
Our Building Number:8137
Num of Rooms:3
Floor:2
Number of people in the Room:2



		
		
