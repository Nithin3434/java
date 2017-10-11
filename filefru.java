import java.util.*;
import java.io.*;
class filefru
{
public static void main(String args[])
{
try
{
FileOutputStream out=new FileOutputStream("C:\\Users\\NITIN\\test\\filefru1.txt");
Scanner sc=new Scanner (System.in);
String f;
String[] d={"orange"};

System.out.println("Enter the name of 5 fruits ");

for(int i=0;i<5;i++)
{
f=sc.next();

if(f.equals(d[0]))
{
System.out.println("Not Printed in the file"+f);
}
else
{
System.out.println("Inserted");
byte[] b=f.getBytes();
out.write(b);
}
}

out.close();
}

catch(Exception e)
{
System.out.println(e);
}

}
}