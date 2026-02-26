class Account 
{
int accno;
float bal;
String name;
Account(int a,float b,String n)
{
accno=a;
bal=b;
name=n;
}
float desposit(float amt)
{
bal=bal+amt;
return bal;
}
float withdraw(float amt)
{
bal=bal-amt;
return bal;
}
}
class Exp3
{
public static void main(String arg[])
{
Account A1=new Account(104,300000.0f,"bhakti");
float t=A1.desposit(250.00f);
System.out.println("after depositing the amount:"+t);
float x=A1.withdraw(250.00f);
System.out.println("amount after withdrawl:"+x);
}
}
