package Java_Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Streams1 {

	/*What is Java Streams?
	->Stream API is new feature available from Java 8
	->By using streams, We can perform various aggregate options on the data returned 
	  from collection classes by drastically reduce the complexity of the code  
	  
	 *What is Lambda Expression 
	 ->Lambda expression introduce the new arrow operator ->into java.
	 It divides lambda expression into two parts.
	 ->The left side specifies the parameter required by the expression,
	  which could also be empty if no paramter is required.
	 -> The right side is the lambda body which specifies the actions of the lambda expression 
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//1.Count the name start with letter A
		//*)Normal Way
		
		/*
		int Count  = 0;
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Jivan");
		names.add("Akanksha");
		
		for(int i=0;i<names.size();i++)
		{
			String C_Name = names.get(i);
			
			if(C_Name.startsWith("A"))
			{
				Count++;
			}
		}
		
		System.out.println("Count of names starts with A is equal to "+Count);
		
		*/
		
		
		/* 
		1.Create a stream
		
		2.Performed Intermediate operations on the initial stream to transform it into
		 another stream and so on further intermediate operations
		 
		3.Perform terminal operation on the final stream to get the result 
		
		*/
		
		ArrayList<String> Names = new ArrayList<String>();
		
		Names.add("Akanksha");
		Names.add("Jivan");
		
		/*
		  ->Stream is nothing but the collection of string
		  
		  ->Filter is Intermediate operation
		  
		  ->count is the terminal operation. 
		 
		 */ 
		
		//1 . Count the name start with letter A
		long c = Names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
		//2.print all the names from the list which have size greater than 4
		Names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
		//3.print only one name from list
		Names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
		//4 create of stream and print all names
		
		long d = Stream.of("Jivan","Akanksha","Chakuli","Om").filter(s->
				{
					s.startsWith("A");
					return true;
				}).count();
		System.out.println(d);
		/*
		 1.There is no life for intermediate operation if there is no terminal operation 
		 2.Terminal operation will execute only if inter operation (filter) return true
		 3.We can create steam using  stream.of
		 */
	}	

}
