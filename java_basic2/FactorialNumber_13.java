package java_basic2;

public class FactorialNumber_13 {

	//Factorial is a function that multiples a number by every number below it.
	//5! = 1*2*3*4*5 = 120	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 5;
		int factoral =1;
		

		for(int i=1;i<=number;i++)
		{
			factoral = factoral * i;
		}
		
		//5! = 5*4*3*2*1 = 120
		/*
		for(int i=number;i>=1;i--)
		{
			factoral = factoral * i;
		}
		*/
		System.out.println(factoral);
		
	}

}
