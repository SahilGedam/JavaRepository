package mock;
import java.util.*;
public class Bouncy3 {
	

		public static void main(String[] args) {
			       Scanner sc= new Scanner((System.in));
			       System.out.println("Enter the number:-");
			       int num= sc.nextInt();
			      
			     bouncy b=new bouncy();
			     b.numbeis(num);
			   }
	}
	class bouncy32{
			  public static void numbeis(int num)
			   {
			       boolean isIncreasing= true,isDecreasing=true;
			       int temp= num;
			       // check if number is ascending
			       int prev= temp%10;
			       while(temp!=0)
			       {
			           int rem = temp%10;
			           if(rem > prev){
			               isIncreasing=false;
			               break;
			           }
			           prev= rem;
			           temp/=10;
			       }
			           if(isIncreasing==true) {
			        	   System.out.println("acending");
			           }
			       
			       temp=num;
			       prev= temp%10;
			       while(temp!=0)
			       {
			           int rem = temp%10;
			           if(rem < prev){
			               isDecreasing=false;
			               break;
			           }
			           prev= rem;
			           temp/=10;
			       }
			        if(isDecreasing==true){
			        	
			            System.out.println("decreasing");
			        }
			        

			  
			  if(!isIncreasing && !isDecreasing){
		            System.out.println("bouncy");
		        }
		        }

			   }

