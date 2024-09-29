package java_basic2;

public class Missing_Number_Array_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.Array should not have duplicates
		//2.Arrya no need to be in sorted order
		
		int a[] = {1,2,3,5,6};
		int sum1 =0;
		int sum2 = 0;
		
		for(int i=0;i<=a.length-1;i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println("Sum of elements of array "+sum1);
		
		for(int i=1;i<=6;i++)
		{
			sum2 =sum2+i;
		}
		System.out.println("Sum of range of element in array "+sum2);
		
		System.out.println("Missing number in array is "+(sum2-sum1));
		
		
		
	}

}
