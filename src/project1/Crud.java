package project1;
import java.util.*;
class Author{
	int a_id;
	String a_name;
	String city;	
}

class Book{
	int id;
	String name;
    int price;
	Author a=new Author();
}

public class Crud {
	
	static Book[] barr=new Book[2];
	
	static Book[] createArray()
	{		
		for(int i=0;i<barr.length;i++) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Book Id");
			int idd=sc.nextInt();
			System.out.println("Book Name");
			String n=sc.next();
			System.out.println("Book Price");
			int bp=sc.nextInt();
			System.out.println("Author Id");
			int aid=sc.nextInt();
			System.out.println("Author Name");
			String nm=sc.next();
			System.out.println("Author City");
			String ct=sc.next();			
			
			Book b=new Book();
			b.id=idd;
			b.name=n;
			b.price=bp;
			b.a.a_id=aid;
			b.a.a_name=nm;
			b.a.city=ct;
			
			barr[i]=b;
		}
		return barr;	
	}
	
	static Book getBookDetails(int id)
	{
		for(int i=0;i<barr.length;i++)
		{
			if(barr[i].id==id)
			{
				return barr[i];
			}
		}
		
		return null;	
	}
	
	
	static Book updation(int id,char c)
	{
		
		if(c=='y')
		{
			for(int i=0;i<barr.length;i++)
			{
				if(id==barr[i].id)
				{
					Scanner sr=new Scanner(System.in);
					System.out.println("Enter new price");
					int np=sr.nextInt();
					barr[i].price=np;
					return barr[i];
				}				
			}		   	
		}
		return null;		
	}
	
	static Book deletion(char c,int id)
	{
		if(c=='y')
		{
			for(int i=0;i<barr.length-1;i++)
			{
				if(id==barr[i].id)
				{
					barr[i]=barr[i+1];
					
					return barr[i];
				}				
			}
		}
		return null;
	}
	public static void main(String[] args) {		
		Book[] bu=createArray();
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Book id for details");
		int bid=s.nextInt();
		Book bk=getBookDetails(bid);
		System.out.println(bk.id+" "+bk.name+" "+bk.price+" "+bk.a.a_id+" "+bk.a.a_name+" "+bk.a.city);
		//Scanner sn=new Scanner(System.in);
		
		System.out.println("Do you want to update price of book?\nIf yes press 'y'.");
		char cr=s.next().charAt(0);		
		Book boo=updation(bid,cr);
		System.out.println(boo.id+" "+boo.name+" "+boo.price+" "+boo.a.a_id+" "+boo.a.a_name+" "+boo.a.city);
		
		
		System.out.println("Do you want to delete id?\nIf yes press 'y'.");
		char ch=s.next().charAt(0);
		Book bkk=deletion(ch,bid);
		System.out.println(bkk.id+" "+bkk.name+" "+bkk.price+" "+bkk.a.a_id+" "+bkk.a.a_name);
	}
}
