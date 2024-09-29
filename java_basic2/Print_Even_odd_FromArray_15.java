package java_basic2;

public class Print_Even_odd_FromArray_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5,6};
		
		System.out.println("===Even Number====");
		/*
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		*/
		
		for(int value:a)
		{
			if(value%2==0)
			{
				System.out.println(value);
			}
		}
		
		System.out.println("===Odd Number====");
		
		/*
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}
		*/
		
		for(int value1:a)
		{
			if(value1%2!=0)
			{
				System.out.println(value1);
			}
		}
	}

}
