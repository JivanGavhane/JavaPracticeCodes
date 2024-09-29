package Java_Basic1;

import java.util.Scanner;

public class CountEvenOddDigits_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		int Even_Num = 0;
		int Odd_Num = 0;
		
		while(number > 0)
		{
			int rem = number%10;
			if(rem%2 == 0)
			{
				Even_Num++;
			}
			else
			{
				Odd_Num++;
			}
			
			number =number/10;
		}
		
		System.out.println("Number of Even number is "+Even_Num);
		System.out.println("Number of Odd number is "+Odd_Num);
	}

}
