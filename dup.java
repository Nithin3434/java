class dup 
{ 
public static void main(String[] args) 
{ 
String a="nithin"; 
int count=0,count1=0; 
char b;

char [] input = a.toCharArray(); 
System.out.println("Duplicate Characters are as follows:"); 
for(int i=0;i<a.length();i++) 
{ 
for(int j=i+1;j<a.length();j++) 
{ 
if(input[i]==input[j]) 
{ 
b=Character.toUpperCase(input[j]);
System.out.println(b);
System.out.println(input[j]); 
count ++; 
break; 
} 
} 
} 
System.out.println(+count);
}
}