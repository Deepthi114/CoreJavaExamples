class Bank
{
	String customerName;
	int customerAccountNumber;

	void proof(int aptNum,String city,String state)
	{
		System.out.println("Customer Appartment Number :"+aptNum);
		System.out.println("City :"+city);
		System.out.println("State :"+state);
	}

	void proof(int companyBuildingNum,String state)
	{
		System.out.println("Company Building Number :"+companyBuildingNum);
		System.out.println("State :"+state);
	}



}

class Customer
{
	public static void main(String[] args)
	{
		Bank bofa=new Bank();
		Bank c=new Bank();
		c.customerName="Mahee";
		System.out.println("Customer Name :"+c.customerName);


		bofa.proof(405,"Fairfax","Virginia");
		bofa.proof(7777,"Virginia");

	}

}
