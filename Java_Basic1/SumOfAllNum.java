package Java_Basic1;

import java.util.Scanner;

public class SumOfAllNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		int sum =0;
		while(number>0)
		{
			sum = sum + number%10;
			number = number/10;
		}
		
		System.out.println("Sum of all number is "+ sum);
	}

}
