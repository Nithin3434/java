import java.util.*;

class empdetails1 extends empsal
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String empname;
int empage;
int empsal;
int empavg;
int sum=0;

for(int i=0;i<10;i++)
{
System.out.println("Enter the name of the employee:");
empname=sc.next();
System.out.println("Enter the name of the employee age:");
empage=sc.nextInt();
System.out.println("Enter the name of the employee salary:");
empsal=sc.nextInt();

empavg=sum+empsal(i);
}
try
{
if(empsal==0)
{
throw new checksal("Exception salary cannot be set as zero",empsal);
}

else if(empage<21)
{
throw new checkage("Exception age cannot be  below 21",empage);
}

else if(empavg<100000)
{
throw new checkavg("Exception Average cannot be below 1 lack",empavg);
}

else
{
System.out.println("");
}
}

catch(exception ioe)
{
System.out.println(ioe);
}
}
}



class empsal extends Exception
{
checksal (String message,int empsal)
{
System.out.println(message+""+empsal);
}

checkage(Sting message2,int empage)
{
System.out.println(message2+""+empage);
}

checkavg(Sting message3,int empavg)
{
System.out.println(message3+""+empavg);
}
}
