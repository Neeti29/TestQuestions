package JDBC;
import java.util.*;
import java.util.Comparator;

class Book1
{
	int bookId;
	String bName;
	Integer price;
	
	Book1(int bookId,String bName,int price)
	{
		this.bookId=bookId;
		this.bName=bName;
		this.price=price;
	}
	
}	
	class SortByPrice implements Comparator<Book1>
	{
		@Override
		public int compare(Book1 a,Book1 b)
		{
			return a.price.compareTo(b.price);
		}
	}

public class BookExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Book1> bObj=new ArrayList<Book1>();
		
		Book1 b1 = new Book1(101,"C",1000);
		Book1 b2 = new Book1(102,"C++",5000);
		Book1 b3 = new Book1(101,"Java",6000);
		Book1 b4 = new Book1(101,"ASP.NET",7000);
		Book1 b5 = new Book1(101,"C#",10000);
		Book1 b6 = new Book1(101,"EJAVA",9000);
		Book1 b7 = new Book1(101,"VB.NET",3000);
		Book1 b8 = new Book1(101,"DBMS",2000);
		Book1 b9 = new Book1(101,"SQL",1500);
		Book1 b10 = new Book1(101,"HTML",1100);
		
		bObj.add(b1);
		bObj.add(b2);
		bObj.add(b3);
		bObj.add(b4);
		bObj.add(b5);
		bObj.add(b6);
		bObj.add(b7);
		bObj.add(b8);
		bObj.add(b9);
		bObj.add(b10);

		for(Book1 e :bObj)
		{
			System.out.println(e.bookId+ " "+ e.bName+ " "+e.price);
			
		}
		
	System.out.println("After Sorting Price is:");
		
	Collections.sort(bObj, new SortByPrice());
		
	   for(Book1 e :bObj)
		{
			System.out.println(e.bName+ " " + "-> " +e.price);
			
		}

	}

	

}
