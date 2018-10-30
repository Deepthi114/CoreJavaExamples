class Bank
{
String name="Citi Bank";
String search="Account Details";

Bank()
{
System.out.println("Name of the Bank:"+name);
System.out.println("Search for :"+search);
}
}
class Online extends Bank
{
Online(String name,String search)
{
System.out.println("Name of the Bank:"+name);
System.out.println("Search for :"+search);
}
}
class OnlineBank
{
public static void main(String []args)
{
Online o=new Online("Bofa","Online Banking");


}
}











