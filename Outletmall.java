class Outletmall
{  
	void stores()
	{
		System.out.println("1.Holister 2.A&F 3.Nike 4.Puma 5.Skechers 6.American Eagle 7.Adidas");
	}
	void footwear(String shoe)
	{
		System.out.println("My footware choice :"+shoe);
	}
	String specifications(int size,String color)
	{
		System.out.println("Shoe Size:"+size);
		System.out.println("Shoe Color:"+color);
		return "Instock";
	}
	String payment()
	{
			return "Bill paid";
	}		
} 
class Mahesh
{
	public static void main(String[] args)
	{
		Outletmall mall=new Outletmall();

		mall.stores();
		mall.footwear("Puma");
		System.out.println("Item Requested:"+mall.specifications(8,"Brown"));
		System.out.println("Payment Status"+mall.payment());
	}
}

Output 

C:\Users\deept\Documents\Java by DS\java progms>javac Outletmall.java

C:\Users\deept\Documents\Java by DS\java progms>java Mahesh
1.Holister 2.A&F 3.Nike 4.Puma 5.Skechers 6.American Eagle 7.Adidas
My footware choice :Puma
Shoe Size:8
Shoe Color:Brown
Item Requested:Instock
Payment StatusBill paid
