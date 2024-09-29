package JavaBasic3;

public class Remove_SpecialCharFromString_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "^&*Jivan)(@#";
		
		name=name.replaceAll("[^a-zA-Z1-9]","");
		System.out.println(name);
	}

}
