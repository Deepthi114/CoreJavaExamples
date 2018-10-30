interface Towers1//Abstract
{	
		String buildingName=" Merrifield Apartments";//by defaul public ,static,final
		int bulNum=9411;
		String period="1 Year";
		int bedRooms=3;
		int roomNum=201;
		int noOfRoomets=7;
		//public void roomDetails();

interface Towers2
		{
			 String buildingName=" Bell FairOaks Apartments";
			 int bulNum=12249;
			 String period="8 Months";
			 int bedRooms=2;
			 int roomNum=405;
			 int noOfRoomets=5;
			//public void roomDetails();

		}
}
		
	
class Apartment implements Towers1.Towers2
{
	
	public void roomDetails()
	{
		System.out.println("Name of the Building :"+Towers1.buildingName);
		System.out.println("Building Number :"+Towers1.bulNum);
		System.out.println("ENTER THE LEASING DETAILS 2016");
		System.out.println("Leasing Period :"+Towers1.period);
		System.out.println("Our Room Number :"+Towers1.roomNum);
		System.out.println("Bed Rooms :"+Towers1.bedRooms);
		System.out.println("Roomments :"+Towers1.noOfRoomets);
	
		System.out.println("Name of the Building :"+Towers2.buildingName);
		System.out.println("Building Number :"+Towers2.bulNum);

		System.out.println("ENTER THE LEASING DETAILS 2017");
		System.out.println("Leasing Period :"+Towers2.period);
		System.out.println("Our Room Number :"+Towers2.roomNum);
		System.out.println("Bed Rooms :"+Towers2.bedRooms);
		System.out.println("Roomments :"+Towers2.noOfRoomets);
	}
}
class Inter
{
	public static void main(String[]args)
	{
		Apartment r=new Apartment();
		r.roomDetails();
		
	}
}



