package JavaBasic3;

public class ReverseEachWord_28 {
	public static void main(String[] args) {
		
		String name = "My Nmae is Jivan";
		
		String Rev_sent = "";
		
		String []words = name.split(" ");
		
		for(String s:words)
		{
			String Rev_Word = "";
			
			for(int i=s.length()-1;i>=0;i--)
			{
				Rev_Word=Rev_Word+s.charAt(i);
			}
			
			Rev_sent=Rev_sent+Rev_Word+ " ";
		}
		
		System.out.println(Rev_sent);
	}
}
