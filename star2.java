class star2
{
public static void main(String args[])
{
for(int i=0;i<8;i++)
{
for(int j=2*i;j>=5;j++)
{
for(int k=2*i;k>=4;k++)
{
System.out.println("*");
if(k==4)
{
break;
}
}
System.out.println("*");
if(j==10)
{
break;
}
}
System.out.println("*");
}
}
}