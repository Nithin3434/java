class freqdig 
{ 
public static void main(String[] args) 
{ 
String a="12124345"; 
int count=0,count1=0; 

char [] input = a.toCharArray(); 
System.out.println("Duplicate Characters are as follows:"); 
for(int i=0;i<a.length();i++) 
{ 
for(int j=i+1;j<a.length();j++) 
{ 
if(input[i]==input[j]) 
{ 
System.out.println(input[j]); 
count ++; 
break; 
} 
} 
} 
System.out.println("count value is:"+count);
}
}