class freqchar
{ 
public static void main(String[] args) 
{ 
String a="nithin"; 
int count=0,count1=0; 

char [] input = a.toCharArray(); 
System.out.println("Frequency of characters are:"); 
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
System.out.println(+count);
}
}