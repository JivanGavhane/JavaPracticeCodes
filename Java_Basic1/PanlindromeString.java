package Java_Basic1;

public class PanlindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "madam";
		String rev ="";
		
		for(int i=name.length()-1; i>=0; i--)
		{
			rev = rev +name.charAt(i);
		}

		
		if(name.equals(rev)) 
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}

}
