package Java_Basic1;

import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		/*
		//Method 1 : using algo
		int rev = 0;
		while(num !=0)  //last condition fail and print the reverse number as 4321
		{
			rev = rev*10 + num%10;     //0+4=4            40+3=43         430+2=432       4320+1=4321
			num = num/10;			   //1234/10=123	  123/10=12       12/10=1         1/10=0
		}
		
		*/
		
		/*
		//Using StringBuffer Class
		StringBuffer br = new StringBuffer(String.valueOf(num));
		StringBuffer rev = br.reverse();
		*/
		
		//Using String Builder Class
		StringBuilder br = new StringBuilder();
		br.append(num);
		StringBuilder rev = br.reverse();
		
		System.out.println("Reverse number is "+rev);
	}

}
