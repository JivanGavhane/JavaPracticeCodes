package Java_Basic1;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number you want to reverse");
		int num = sc.nextInt();
		
		int OriginalNum = num;
		int rev = 0;
		
		while(num !=0)
		{
			rev = rev*10 + num % 10;
			num = num/10;
		}
		
		if(OriginalNum == rev)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is not Palindrome");
		}
	}

}
