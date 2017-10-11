class detail
{
public int rollno=10;
private String name="nnn";
private int age=20;

void detstud()
{
System.out.println("Roll NO:"+rollno);
System.out.println("Name:"+name);
System.out.println("Age:"+age);
}
}
class example1
{
public static void main(String args[])
{
detail obj=new detail();
obj.detstud();
System.out.println(obj.rollno);
}
}
  