class palindrome
{
public static void checkpalindrome(String s)
{
String reverse = new StringBuffer(s).reverse().toString();
if (s.equals(reverse))
System.out.println("Yes:"+reverse);
 
else
System.out.println("No:"+reverse);
}
 
public static void main (String[] args)
               
{
checkpalindrome("NITIN");
checkpalindrome("NITHIN");
}
}