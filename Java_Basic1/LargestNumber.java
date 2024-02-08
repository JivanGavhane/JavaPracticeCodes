package Java_Basic1;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Value of a");
		int a = sc.nextInt();
		
		System.out.println("Enter the Value of b");
		int b = sc.nextInt();
		
		System.out.println("Enter the Value of c");
		int c = sc.nextInt();
		
		/*
		//Approch 1 - Logic
		if(a>b && a>c)
		{
			System.out.println(a + "is largest number");
		}
		else if(b>a && b>c)
		{
			System.out.println(b + "is largest number");
		}
		else
		{
			System.out.println(c + " is the largest number");
		}
		
		*/
		
		
		//Approach 2 : Ternary Operator
		
		/*
		int largest = a>b?a:b;                  //if condition pass a is consider as largest if false b is largest
		int largest1 = c>largest?c:largest;
		
		*/
		
		int largest1 = c>(a>b?a:b)?c:(a>b?a:b);
		
		System.out.println(largest1 +" is largest number");
	}

}
