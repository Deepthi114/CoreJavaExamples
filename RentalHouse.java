import java.util.Scanner;
class RentalHouse
{
	void lease()//menthod with no returntype and no parameters
	{
		System.out.println("Renting for      1.Apartments 2.Town houses 3.Independent Houses");
	}
	void apartment(int buildingNumber,int roomNum,String city,String state)//method overloading apartment1 details
	{
		System.out.println("Apartment Building Number:"+buildingNumber);
		System.out.println("Apartment Room number:"+roomNum);
		System.out.println("City:"+city);
		System.out.println("State:"+state);
	}
	void apartment(int buildingNumber,char roomNum,String city,String state)//method overloading apartment2 details
	{
		System.out.println("Apartment Building Number:"+buildingNumber);
		System.out.println("Apartment Room number:"+roomNum);
		System.out.println("City:"+city);
		System.out.println("State:"+state);
	}
	void townHouse(int houseNum,String city,String state)
	{
		System.out.println("Town house Number :"+houseNum);
		System.out.println("City:"+city);
		System.out.println("State:"+state);
	}
	void customer(String customerName,int customerPhnNumber,String customerIdProof)
	{
		System.out.println("Customer Name :"+customerName);
		System.out.println("Phone number:"+customerPhnNumber);
		System.out.println("Id Proof:"+customerIdProof);
	}
	void takeLease(String renting)//method no returntype withparameters....Main_block to sub_block
	{
		System.out.println("Want to take a lease for :"+renting);
	}
	String payRent(int deposit)//method with returntype and with parameters........ return value from sub_block to main_block
	{
		System.out.println("Deposit Amount is:"+deposit);
		return "Deposit Paid";
	}
	String newLease()//method with returntype ....... Sub_block to Main_block 
	{
		return "Approved";
	}
}

class Resident
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		RentalHouse rh=new RentalHouse();
		System.out.pritnln("House renting retails);
		int buildingNumber=sc.nextInt();

	}
}
