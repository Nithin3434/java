import java.util.*;

class chaprint
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String a[]=new String[5];
char vowels[]={'a','e','i','o','u'};
char c []=new char[50];

System.out.println("Enter 5 words");
for(int i=0;i<5;i++)
{
a[i]=sc.next();
}

c=a[].toCharArray();

char[] b=a[0].toCharArray();

char[] r=a[1].toCharArray();

char[] x=a[2].toCharArray();

char[] y=a[3].toCharArray();

char[] z=a[4].toCharArray();

System.out.println("");
System.out.println("Consonants");
System.out.println("");
for(int g=0;g<5;g++)
{
if(b[0]==vowels[g])
{
System.out.println("The First character of the first word It is a vowels:"+b[0]);
}
else
{
System.out.println("The First character of the first word It is Not a vowels");
}

if(r[0]==vowels[g])
{
System.out.println("The First character of the first word It is a vowels:"+r[0]);
}
else
{
System.out.println("The First character of the first word It is Not a vowels");
}

if(x[0]==vowels[g])
{
System.out.println("The First character of the first word It is a vowels:"+x[0]);
}
else
{
System.out.println("The First character of the first word It is Not a vowels");
}

if(y[0]==vowels[g])
{
System.out.println("The First character of the first word It is a vowels:"+y[0]);
}
else
{
System.out.println("The First character of the first word It is Not a vowels");
}

if(z[0]==vowels[g])
{
System.out.println("The First character of the first word It is a vowels:"+z[0]);
}
else
{
System.out.println("The First character of the first word It is Not a vowels");
}
}


System.out.println("Vowels");

for(int k=0;k<c.length;k++)
{
for(int j=0;j<5;j++)
{
if(c[k]==vowels[j])
{
System.out.println(c[k]);
}

}
}



}
}




