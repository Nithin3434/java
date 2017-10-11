import java.util.Scanner;
class prime
{
   public static void main(String args[])
   {		
	int temp;
        boolean state=true; 
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter any number:");
	int num=scan.nextInt();
        scan.close();
	for(int i=2;i<=num/2;i++)
	{
           temp=num%i;
	   if(temp==0)
	   {
	    state=false;  
	   }
	}
	 if(state)
         {
	   System.out.println(num + " is a Prime Number");
	 } 
	 else
	 {
	   System.out.println(num + " is not a Prime Number");
	 }
         
   }
}