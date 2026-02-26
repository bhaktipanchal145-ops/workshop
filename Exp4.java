class Student
{
int rollno;
String name;
Student(int r,String n)
{
rollno=r;
name=n;
}
void show(){
System.out.println("name:"+name);
System.out.println("roll no:"+rollno);
}
}
class Test extends Student
{
int sub1,sub2;
Test(int r,String n,int s1,int s2)
{
super(r,n);
sub1=s1;
sub2=s2;
}
void display()
{
System.out.println("subject 1="+sub1);
System.out.println("subject 2="+sub2);
}
}
class Result extends Test
{
int total;
double per;
Result(int r,String n,int s1,int s2)
{
super(r,n,s1,s2);
}
void cal_res()
{
total=sub1+sub2;
System.out.println("total="+total);
per=(total/200.0)*100;
System.out.println("percentage="+per);
}
}
class Exp4
{
public static void main(String arg[])
{
Result R1=new Result(1,"bhakti",90,90);
R1.show();
R1.display();
R1.cal_res();
}
}