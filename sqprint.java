import java.util.*;
class sqprint
{
public static void main(String []s)
{
Scanner sc=new Scanner(System.in);
int j=3;
String a[]=new String[5];
String b[]=new String[5];
String c[]=new String[5];
String d[]=new String[5];
char e[][]=new char[10][10];
char[][] k=new char[10][10];


System.out.println("Enter the 5 charctered word");
a[0]=sc.next();
char[] f=a[0].toCharArray();

System.out.println("Enter the 5 charctered word which should start with the above words 1st character ");
b[0]=sc.next();
char[] g=b[0].toCharArray();
if(f[0]==g[0])
{System.out.println("enter the next term");
}
else
{
System.out.println("re-enter the  term");
b[0]=sc.next();
}

System.out.println("Enter the 5 charctered word which should start with the above words 5st character ");
c[0]=sc.next();
char[] h=c[0].toCharArray();
if(h[0]==f[4])
{System.out.println("enter the next term");
}
else
{
System.out.println("re-enter the  term");
c[0]=sc.next();
}

System.out.println("Enter the 5 charctered word which should start with 2nd words last character and end with 3rd word last character");
d[0]=sc.next();
char[] i=d[0].toCharArray();
if((i[0]==g[4])||(i[4]==h[4]))
{System.out.println("check your output");
}
else
{
System.out.println("re-enter the  term");
d[0]=sc.next();
}

if(j==3)
{
e[0][0]=f[0];
e[0][1]=f[1];
e[0][2]=f[2];
e[0][3]=f[3];
e[0][4]=f[4];
}

else if(e[0][0]==g[0])
{
e[1][0]=g[1];
e[2][0]=g[2];
e[3][0]=g[3];
e[4][0]=g[4];
}

else if(e[0][4]==h[0])
{
e[1][4]=h[1];
e[2][4]=h[2];
e[3][4]=h[3];
e[4][4]=h[4];
}

else if((e[4][0]==i[0])||(e[4][4]==i[4]))
{
e[4][1]=i[1];
e[4][2]=i[2];
e[4][3]=i[3];
}

else if(j!=0) 
{
e[1][1]=0;
e[1][2]=0;
e[1][3]=0;
e[2][1]=0;
e[2][2]=0;
e[2][3]=0;
e[3][1]=0;
e[3][2]=0;
e[3][3]=0;
e[4][1]=0;
e[4][2]=0;
e[4][3]=0;
}

else 
{
System.out.println("error");
}

for(int l=0;l<5;l++)
for(int m=0;m<l;m++)
System.out.println(k[l][m]);
}
}

