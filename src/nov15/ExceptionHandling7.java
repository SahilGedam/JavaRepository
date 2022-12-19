package nov15;
import java.util.*;
class InvalidExponentValueException extends Throwable
{
	InvalidExponentValueException(String s)
	{
		super(s);
	}	
}
public class ExceptionHandling7 {
	public static void check(int b,int x) throws InvalidExponentValueException
	{
		if(x==0 || x<0)
		{
			throw new InvalidExponentValueException("Invalid exponent value entered");
		}else {
			System.out.println(Math.pow(b, x));
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of base : ");
		int base=sc.nextInt();
		System.out.println("Enter value of exponent : ");
		int expo=sc.nextInt();
		try {
			check(base,expo);
		}catch(InvalidExponentValueException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

