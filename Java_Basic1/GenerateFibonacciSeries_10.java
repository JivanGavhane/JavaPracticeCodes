package Java_Basic1;

public class GenerateFibonacciSeries_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A series of number in which each number is sum of the two preceding numbers is called febonacci series
		
		int n1=0;
		int n2=1;
		int sum =0;
		
		System.out.print(n1+ " "+ n2);
		
		for(int i=2;i<10;i++)
		{	
			sum = n1 +n2;
			System.out.print(" "+sum);
			n1 =n2;
			n2 = sum;
		}
		
	}

}
