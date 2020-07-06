package cooper;
import java.util.*;
public class CAR 
{
   public static void main(String[] args)
   {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name=obj.nextLine();
		Date date=new Date();
			System.out.println();
			System.out.println("--------------------------------------------------------------");
		System.out.println("Hotel Name\t"+"User Name\t"+"Date and Time\t\t");
		System.out.println("7Star\t\t"+name+"\t\t"+date.toString());
		System.out.println();
		System.out.println("--------------------------------------------------------------");
		int sum=0;
	   String c="YES";
	  while(c.equals("YES"))
	  {
	    System.out.println("Order an item :");
	    System.out.println("Intem name\t"+"Price\t"+"Press to Order");
	    System.out.println("Dosa\t\t"+"40\t\t"+"1");
	    System.out.println("Poori\t\t"+"50\t\t"+"2");
	    System.out.println("Briyani\t\t"+"100\t\t"+"3");
	    System.out.println("Rice\t\t"+"50\t\t"+"4");
	    System.out.println("--------------------------------------------------------------");
	     System.out.print("Press to Order :");
	    int n=obj.nextInt();
	    switch(n)
	    {
	        case 1:
	            System.out.print("How many plate :");
	            int x1=obj.nextInt();
	            int d=40;
	            while(x1!=0)
	            {
	                sum=sum+d;
	                --x1;
	            }
	            System.out.println("Total Price :"+sum);
	            break;
	            
	       case 2:
	            System.out.print("How many plate :");
	            int x2=obj.nextInt();
	            int p=50;
	            while(x2!=0)
	            {
	                sum=sum+p;
	                --x2;
	            }
	            System.out.println("Total Price :"+sum);
	            break;
	            
	       case 3:
	            System.out.print("How many plate :");
	            int x3=obj.nextInt();
	            int b=100;
	            while(x3!=0)
	            {
	                sum=sum+b;
	                --x3;
	            }
	            System.out.println("Total Price :"+sum);
	            break;
	            
	            
	       case 4:
	            System.out.print("How many plate :");
	            int x4=obj.nextInt();
	            int r=40;
	            while(x4!=0)
	            {
	                sum=sum+r;
	                --x4;
	            }
	            System.out.println("Total Price :"+sum);
	            break;
	      }
	        System.out.println("--------------------------------------------------------------");
	        System.out.println("Do You Want Anyother Order");
	        System.out.println("Please say YES or NO");
	        String s=obj.next();
	        c=s;
	        System.out.println("--------------------------------------------------------------");
	  }
	   System.out.println("Your Ordered Placed Successfully");
	     System.out.println();
	       System.out.println();
	    System.out.println("Delivery Details ");
	     System.out.println();
	   System.out.print("Name\t\t:");
	   String u=obj.next();
	 
	   System.out.print("Mobile Number\t:");
	   int t=obj.nextInt();
	  
	   System.out.print("Email Address\t:");
	   String z=obj.next();
	   
	     System.out.print("Address\t\t:");
	     String y=obj.next();
	    
	   System.out.print("City\t\t:");
	   String w=obj.next();
	   System.out.println();
	    System.out.println();
	     System.out.println();
	   System.out.println("Your Ordered Will be Delivered Verysoon");
	   
	   System.out.println();
	     System.out.println();
	  System.out.println("----------------------------THANKYOU--------------------------");
	
		
   }
}
