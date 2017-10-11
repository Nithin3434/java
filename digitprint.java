import java.util.*;

class digitprint
{
public static void main(String args[])
{
Scanner sc =new Scanner (System.in);
String a[]=new String[1];
char b[]=new char[5];
System.out.println("Enter the four digit number:");

a[0]=sc.next();

b=a[0].toCharArray();
System.out.println("once value is:"+b[3]);
System.out.println("tence value is:"+b[2]);
System.out.println("hundreds value is:"+b[1]);
System.out.println("thousands value is:"+b[0]);
}
}


