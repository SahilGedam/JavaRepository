package test1oct;

//3) Write a program to find Minimum frequency char from an Array
//e.g char arr[]={‘a’,’b’,’b’,’c’,’c’,’b’};
//output= a
import java.util.*;

public class MinFreqChar {
	int min= Integer.MIN_VALUE;
	public static void minFreq(char a[]) {
		for (int i = 0; i < a.length; i++) {
			boolean isVisited = false;
			int count = 1;
			int c=0;
			for (int k = i - 1; k >= 0; k--) {
				if (a[i] == a[k]) {
					isVisited = true;
					break;
				}
			}
			if (isVisited == false) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						count++;
					}
				}
			//	System.out.println(a[i] + " " + count);
				if(count==1) {
					System.out.println(a[i]+ " "+ count);
				}
//				for(int l=0;l<a.length;l++) {
//				
//				}
				
				

			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a[] = { 'a', 'b', 'b', 'c', 'c', 'b', };	
		int min=Integer.MAX_VALUE;
		char ch=' ';
		
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			boolean isvalid=false;
			for(int k=i-1;k>=0;k--)
			{
				if(a[i]==a[k])
				{
					isvalid=true;
					break;
				}
			}
			if(isvalid==false)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						count++;
					}
				}
				
				if(count<min)
				{
					min=count;
					ch=a[i];			
			}}}		
		System.out.println(ch+" "+min);
		
	}
}
