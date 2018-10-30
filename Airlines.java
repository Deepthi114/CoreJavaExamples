class Airlines
{
	String passengerName;
	String flyingFrom;
	String flyingTo;
	int noOfPassengers;

	void bookingFlight(String internationalFlights)
	{
		System.out.println("Search for :"+internationalFlights);
	}

	void listOfFlights()
	{
		System.out.println("List of International Flights : British Airways , Qatar Airways , Emirates , Lufthansa");
	}
	String bookFlight(String flight)
	{
		System.out.println("Booked Flight :"+flight);
		return "Business Class Booked";
	}
	String payment(String creditCard)
	{
		System.out.println("Payment methord :"+creditCard);
		return "PAID";
	}

}
class Passengers
{
	public static void main(String[] args)
	{
		Airlines travelar=new Airlines();
		travelar.passengerName="Deepu";
		travelar.flyingFrom="Washnington DC";
		travelar.flyingTo="Vijayawada";
		travelar.noOfPassengers=1;

		System.out.println("Passenger name :"+travelar.passengerName);
		
		Airlines air=new Airlines();

		air.bookingFlight("International Flights");

		air.listOfFlights();

		System.out.println("Traveling From :"+travelar.flyingFrom);
		System.out.println("Traveling To :"+travelar.flyingTo);
		System.out.println("Number of Passengers :"+travelar.noOfPassengers);
		System.out.println("Status :"+air.bookFlight("British Airways"));
		System.out.println("Payment status :"+air.payment("Through credit card"));

		
	}
}


/*
Output:

C:\Users\deept\Documents\Java by DS\java progms>javac Airlines.java

C:\Users\deept\Documents\Java by DS\java progms>java Passengers
Passenger name :Deepu
Search for :International Flights
List of International Flights : British Airways , Qatar Airways , Emirates , Lufthansa
Traveling From :Washnington DC
Traveling To :Vijayawada
Number of Passengers :1
Booked Flight :British Airways
Status :Business Class Booked
Payment methord :Through credit card
Payment status :PAID*/