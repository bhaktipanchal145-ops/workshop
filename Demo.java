import java.util.Scanner;
class Demo
{
public static void main(String arg[])
{
Scanner sc= new Scanner (System.in);
System.out.println("enter name, radius and pi value:");
String name= sc.next();
int r= sc.nextInt();
float pi= sc.nextFloat();
double area= pi*r*r;
System.out.println("circle name:"+name);
System.out.println("Area:"+area);
}
}