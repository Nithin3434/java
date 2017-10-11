import java.util.*;

class arrascen
{
public static void main(String args[])
{
Scanner sc= new Scanner (System.in);
String a[]=new String [5];

System.out.println("Enter the 5 students names");
for(int i=0;i<5;i++)
{
a[i]=sc.next();
}


System.out.println();
System.out.println("In Ascending Order");
System.out.println();

for(int j=0;j<a.length;j++)
{
for(int k=j+1;k<a.length;k++)
{
if(a[j].compareTo(a[k])>0)
{
String temp=a[j];
a[j]=a[k];
a[k]=temp;
}
}
System.out.println(a[j]);
}
}
}


