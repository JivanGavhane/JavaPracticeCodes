package Java_Basic1;

public class SwapNumber_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		
		System.out.println("Before swapping numbers are" + a+" "+b);
		
		/*
		//Logic 1 : Third Variable
		int t;
		t = a;
		a = b;
		b = t;
		
		*/
		
		//Logic 2 : use + and - Operator without using third variable
		/*
		a = a+b;   //10+20=30   a=30
		b = a-b;   //30-20=10   b=10;
		a = a-b;   //30-10=20   a=20;
		*/
		
		//Logic 3 :use * and / Operator without using third variable
		/*
		a= a*b;     //10*20=200  a=200;
		b =a/b;     //200/20=10  b=10;
		a =a/b;    //200/10=20   a=20;
		*/
		
		//Logic 4: Single statement
		b=a+b-(a=b);         
		
		//a=b  = a=20;
		//10+20 - 20 ->assign to b = 10
		//b= 10 and a= 20;
		System.out.println("After swapping numbers are" + a+" "+b);
	}

}
