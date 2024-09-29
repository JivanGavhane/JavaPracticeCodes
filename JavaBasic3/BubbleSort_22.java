package JavaBasic3;

import java.util.Arrays;

public class BubbleSort_22 {
	public static void main(String[] args) {
		
		int a[]= {20,10,30,40,50,70,60,80,90,100};
		
		System.out.println("Array before sorting"+ Arrays.toString(a));
		
		
		int size = a.length;
		int temp;
		for(int i=0;i<size-1;i++)
		{
			for(int j=0;j<size-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.println("Array After sorting"+ Arrays.toString(a));
	}
}
