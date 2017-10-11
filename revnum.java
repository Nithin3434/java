class revnum
{
public static void main(String args[])
{
int a=405,r,b=0;
while(a !=0)
{
r=a%10;
b=b*10+r;
a/=10;
}
System.out.println(b);
}
}