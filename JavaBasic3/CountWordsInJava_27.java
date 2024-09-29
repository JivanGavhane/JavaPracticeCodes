package JavaBasic3;

public class CountWordsInJava_27 {
	public static void main(String[] args) {
		
		String Address = "Shivaji nagar Jalgaon";
		
		int count =1;
		
		for(int i=0;i<Address.length()-1;i++)
		{
			if((Address.charAt(i)==' ') && (Address.charAt(i+1)!= ' '))
			{
				count++;
			}
		}
		
		System.out.println("Number of words in the sentenece "+count);
	}
}
