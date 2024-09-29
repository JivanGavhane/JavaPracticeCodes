package JavaBasic3;

public class CountOccurencOfChar_26 {
	public static void main(String[] args) {
		
		String lang= "I love java";
		int OldSize = lang.length();
		
		String latestLang = lang.replaceAll("a","");
		int NewSize = latestLang.length();
		
		int Occurence = OldSize - NewSize;
		
		System.out.println("Alphabet A occured "+Occurence+ " Times");
	}
}
