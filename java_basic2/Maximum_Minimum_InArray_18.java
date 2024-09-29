package java_basic2;

public class Maximum_Minimum_InArray_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {50,20,40,60,70};
		
		int max = a[0];
		int min = a[0];
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Max element form array is"+ max);
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Min element from array is"+ min);
		
	}

}
