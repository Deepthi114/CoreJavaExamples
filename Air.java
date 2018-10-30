import java.util.Scanner;
class Airlines
{
	
	void bookingFlight(String internationalFlights)
	{
		System.out.println("Search for International Flight :"+internationalFlights);
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
		Scanner sc=new Scanner(System.in);
		travelar.listOfFlights();
		System.out.println("Enter the Flight ");
		String book=sc.next();
		System.out.println("flight booked for ");
		String flight=sc.next();
		travelar.bookingFlight(book);
		System.out.println(travelar.bookFlight(flight));

	}
}


