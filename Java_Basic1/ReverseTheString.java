package Java_Basic1;

public class ReverseTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Jivan";
		String rev = "";
		
		
		/*
		//Method 1 : using +(String Concatenation) Operator
		for(int i=name.length()-1 ; i>=0; i--)
		{
			rev = rev + name.charAt(i);
		}
		
		System.out.println("After reversing the string "+rev);
		
		*/
		
		/*
		//Method 2 : Using Character Array
		char[] a= name.toCharArray();
		
		for(int i=a.length-1; i>=0; i--)
		{
			rev = rev +a[i];
		}
		
		System.out.println("After reversing the string "+rev);
		*/
		
		//Method 3 : Using StringBuffer class
		StringBuffer br = new StringBuffer(name);
		System.out.println(br.reverse());
	}

}
