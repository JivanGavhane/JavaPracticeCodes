package java_basic2;

import java.util.Scanner;

public class LinearSearch_20 {
	public static void main(String[] args) {
		
		int a[] = {10,20,30,80,70};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to search");
		int element = sc.nextInt();
		boolean flag=false;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==element)
			{
				System.out.println("Element Found");
				flag=true;
				break;
			}
		}
		
		if(flag==false)
		{
			System.out.println("Element not found");
		}
	}
}
