import java.util.*;
import java.io.*;

class vowcon 
{
public static void main(String args[])
{
try
{
FileOutputStream out=new FileOutputStream("C:\\Users\\NITIN\\test\\vowcon.txt");
FileOutputStream out1=new FileOutputStream("C:\\Users\\NITIN\\test\\vowcon1.txt");
Scanner sc=new Scanner(System.in);
String s[]=new String[5];

System.out.println("Enter the 5 names");
for(int k=0;k<5;k++)
{
s[k]=sc.next();
char[] c=s[k].toCharArray();
if((c[0]=='a')||(c[0]=='e')||(c[0]=='i')||(c[0]=='o')||(c[0]=='u'))
{
System.out.println("The begining character of the word is vowel");
System.out.println(s[k]);
byte[] b=s[k].getBytes();
out.write(b);
}
else
{
System.out.println("These are consonants");
System.out.println(s[k]);
byte[] e=s[k].getBytes();
out1.write(e);
}
}

out.close();
out1.close();
}

catch(Exception e)
{
System.out.println(e);
}
}
}

