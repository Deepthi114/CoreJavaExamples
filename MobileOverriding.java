import java.util.Scanner;
class Mobile
{
	String mobile;
	String capacity;
	float version;

	Scanner sc=new Scanner(System.in);
	void version()
	{
		String v=new String("List of Iphone's From :-Iphone 1.0 version to -IphoneX iOS 11.0.1");
		for (String x:v.split("-"))
		{
			System.out.println(x);
		}
	}
	void capacity()
	{
		System.out.println("Storage Capacity:16GB,32GB,64GB,128GB,256GB");

	}
}
class IphoneX extends Mobile
{
	Scanner sc=new Scanner(System.in);
	void version()
	{
		System.out.println("mobile:");
		mobile=sc.next();
		System.out.println("version:");
		version=sc.nextFloat();
		
	}
	void capacity()
	{
		System.out.println("capacity:");
		capacity=sc.next();
		System.out.println("Mobile Name:"+mobile);
		System.out.println("Software Version:"+version);
		System.out.println("Storage Capacity:"+capacity);
	}

}
class Iphone6S extends Mobile
{
	Scanner sc=new Scanner(System.in);
	void version()
	{
		System.out.println("mobile:");
		mobile=sc.next();
		System.out.println("version:");
		version=sc.nextFloat();
		
	}
	void capacity()
	{
		System.out.println("capacity:");
		capacity=sc.next();
		System.out.println("Mobile Name:"+mobile);
		System.out.println("Software Version:"+version);
		System.out.println("Storage Capacity:"+capacity);
	}

}
class MethodOverriding
{
	public static void main(String[]args)
	{
		Mobile i=new Mobile();
		i.version();
		i.capacity();
		i=new IphoneX();
		i.version();
		i.capacity();
		i=new Iphone6S();
		i.version();
		i.capacity();
		
}
}
/*
Output:

C:\Users\deept\Documents\Java by DS\java progms\Rohit\Deepu\Import>javac MobileOverriding.java

C:\Users\deept\Documents\Java by DS\java progms\Rohit\Deepu\Import>java MethodOverriding
List of Iphone's From :
Iphone 1.0 version to
IphoneX iOS 11.0.1
Storage Capacity:16GB,32GB,64GB,128GB,256GB
mobile:
IphoneX
version:
11.0
capacity:
256GB
Mobile Name:IphoneX
Software Version:11.0
Storage Capacity:256GB
mobile:
Iphone6S
version:
11.0
capacity:
128GB
Mobile Name:Iphone6S
Software Version:11.0
Storage Capacity:128GB
*/