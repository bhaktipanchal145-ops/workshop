interface Norms
{
final static int ta=5000;
static final double da=0.9;
final static double hra=0.6;
public void compute_sal();
}
class Emp
{
int id;
String name;
double bas_sal;
Emp(int i,String s,double bs)
{
id=i;
name=s;
bas_sal=bs;
}
void put()
{
System.out.println("id="+id);
System.out.println("name="+name);
System.out.println("basic salary="+bas_sal);
}
}
class Empsal extends Emp implements Norms
{
double gs;
Empsal(int i,String s,double bs)
{
super(i,s,bs);
}
public void compute_sal()
{
gs =bas_sal+(bas_sal*ta)+(bas_sal*da)+(bas_sal*hra);
System.out.println("gross salary="+gs);
}
}
class Exp5
{
public static void main(String arg[])
{
Empsal e1=new Empsal(1,"bhakti",35000.50);
e1.put();
e1.compute_sal();
}
}