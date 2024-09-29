package JavaBasic3;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,20,30,40,50,60,70,80,90,100};
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number you want to search");
		int key=sc.nextInt();
		
		/*
		int L=0;
		int H=a.length-1;
		boolean flag = false;
		while(L<=H)
		{
			int M=(L+H)/2;
			if(a[M]==key)
			{
				System.out.println("Element Found");
				flag = true;
				break;
			}
			
			if(a[M]<key)
			{
				L=M+1;
			}
			
			if(a[M]>key)
			{
				H=M-1;
			}
		}
		
		if(flag ==false)
		{
			System.out.println("Element not found");
		}
		
		*/
		
		System.out.println(Arrays.binarySearch(a, 100));
	}

}
