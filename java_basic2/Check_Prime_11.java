package java_basic2;

public class Check_Prime_11 {

	//1.Natural number > 1
	//Which has only 2 factors 1 and itself 
	//19 is a prime number ->1 and 19 
	//28 is non prime number -> 1,2,4,7,14,28
	//Example 2,3,5,7,11,13,17
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 19;
		int count = 0;
		
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					count++;
				}
			}
			
			if(count==2)
			{
				System.out.println("Number is prime number");
			}
			else
			{
				System.out.println("Number is not a prime number");
			}
		}
		else
		{
			System.out.println("Number is not a prime number");
		}
	}

}
