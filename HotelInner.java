class Trip
{
	Trip(int noOfDays,int noOfPeople)
		{
			System.out.println("Enter the Trip details");
			System.out.println("Number of days :"+noOfDays);
			System.out.println("Number of People :"+noOfPeople);
		}

		static class Hotel//static class 
		{
			String name="Comfort Suites";
			String location="Kentucky";
			static int bedRooms=2;//static variable to use in static method 
			void vaDetails()
			{
				System.out.println("Hotel :"+name);
				System.out.println("Location :"+location);
			}
			static void roomDetails()
			{
				System.out.println("Bed Rooms :"+bedRooms);
			}
		}
		class Location
		{
			String place="Niagara falls";
			String address="New York";
			Location()
			{
				System.out.println("Trip for :"+place);
				System.out.println("Location :"+address);
			}

		}		

}
class HotelInner
{
	public static void main(String[] args)
	{
		Trip t=new Trip(5,6);

		Trip.Hotel th=new Trip.Hotel();
		th.vaDetails();
		Trip.Hotel.roomDetails();//calling static method

		Trip.Location tl=t.new Location();

	}
	

}