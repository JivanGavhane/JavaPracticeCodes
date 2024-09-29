package java_basic2;

import java.util.Arrays;

public class Arrays_EqualOrNot_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5};
		int b[] = {1,2,3,4,5};
		
		//Approach 1 - using arrays.equal function
		/*
		boolean status = Arrays.equals(a,b);
		
		if(status == true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
		
		*/
		
		boolean status =true;
		
		if(a.length == b.length)
		{
			for(int i=0;i<=a.length-1;i++)
			{
				if(a[i] != b[i])
				{
					status = false;
				}
			}
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
		
		if(status == true)
		{
			System.out.println("Arrays are same");
		}
		else
		{
			System.out.println("Arrays are not same");
		}
	}	

}
