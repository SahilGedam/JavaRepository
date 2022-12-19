package nov21;

import java.util.*;

public class AdditionNumString {
	
	public static  boolean isNumber(String str)
	{
		try
		{
			Integer.parseInt(str);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int temp = 0;
		String s1 = "a45ac82bn3";
		s1 = s1.replaceAll("\\D", "@");
		System.out.println(s1);

		String s2[] = s1.split("@");
		System.out.println(Arrays.toString(s2));
		
		
		for(int i=0;i<s2.length;i++)
		{
			String[]s3=s2[i].split(" ");
			
			//System.out.println(Arrays.toString(s3));
			for(int j=0;j<s3.length;j++)
			{
				if(isNumber(s3[j]))
				{
					System.out.println("........."+s3[j]);
					sum=sum+Integer.parseInt(s3[j]);
				}
			}
//			if(s3[0]!=" ")
//			{
//				System.out.println(s3[0]);
//			}
			//System.out.println("////////"+st2);
			
			
		}
		System.out.println(sum+" ...................");
//		int arr[] = new int[s2.length];
//		for (int i = 0; i < arr.length; i++) {
//			temp = Integer.parseInt(s2[i]);
//		}
//		System.out.println(temp);

	}

}
