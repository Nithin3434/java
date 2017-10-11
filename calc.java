class calc
{
int a=10,b=5,c;
void add()
{
c=a+b;
System.out.println(c);
}

void sub()
{
c=a-b;
System.out.println(c);
}

void mul()
{
c=a*b;
System.out.println(c);
}

void div()
{
c=a/b;
System.out.println(c);
}

public static void main (String args[])
{
int x=2;
calc obj=new calc();
switch(x)
{
case 1:obj.add();
break;
case 2:obj.sub();
break;
case 3:obj.mul();
break;
case 4:obj.div();
break;
default:System.out.println("invalid");
break;
}
}
}