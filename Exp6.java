class Exp6
{
public  static void main(String arg[])
{
String S1="abc";
String S2="PQR";
String S3="         XYZ   ";
String op1=S1.toUpperCase();
System.out.println("converting String to Upper Case:"+op1);
String op2=S2.toLowerCase();
System.out.println("converting String to Lower Case:"+op2);
String op3=S3.trim();
System.out.println("Trimming String S3:"+op3);
String op4=S1.replace('b','B');
System.out.println("replacing all 'b' to 'B':"+op4);
Boolean op5=S2.equals(S1);
System.out.println("checking that strings are equal or not:"+op5);
Boolean op6=S2.equalsIgnoreCase(S1);
System.out.println("chekig string is equal or not by ignoring the Case:"+op6);
int op7=S3.length();
System.out.println("the length of S3 string:"+op7);
char op8=S1.charAt(2);
System.out.println("String at specific position:"+op8);
int op9=S1.compareTo(S2);
System.out.println("Comparing strings S1 and S2:"+op9);
String op10=S1.concat(S2);
System.out.println("concating String S1 and S2:"+op10);
String op11=S1.substring(2);
System.out.println("sub String:"+op11);
}
}