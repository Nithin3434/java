import java.util.*;
class stud
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
try
{
String sname[]=new String[5];
int m[]=new int[5];
int tot[] =new int[4];
int a[]=new int[1];
int avg[]=new int[1];
a[0]=0;

for(int i=0;i<5;i++)
{
System.out.println("Enter students name:");
sname[i] =sc.next();
System.out.println("Enter students" +i+ "mark:");

m[i]  =sc.nextInt();

System.out.println("Name"+i+":"+sname[i]);
System.out.println("mark"+i+":"+m[i]);
}
}

catch(ArrayIndexOutOfBoundException e)
{
tot[0]=a[0] + m[0] + m[1] + m[2]+m[3]+m[4];
System.out.println(tot[0]);
System.out.println("In Array the index value should be provided correctly");
}
}
}