package JavaBasic3;

public class Remove_WhiteSpacesFromString_25 {
	public static void main(String[] args) {
		String name = "  Jivan    manohar  Gavhane";
		
		name = name.replaceAll("\\s","");
		System.out.println(name);
	}
}
