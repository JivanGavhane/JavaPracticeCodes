package java_basic2;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class Gen_Random_Num_String_12 {

	//Download apache commons lang API jar from - https://commons.apache.org/lang/download_lang.cgi
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Approach 1 - Random class
		
		//Random r = new Random();
		//int Ran_number1 = r.nextInt(1000);
		//System.out.println(Ran_number1);
		
		//double Ran_number2 = r.nextDouble();
		//System.out.println(Ran_number2);
		
		//Approach 2 - Math class - Math is a static class so no need to create object
		//System.out.println(Math.random()); // it will create decimal random number
		
		//Approach 3- apache comman lang API
		String Ran_number3 = RandomStringUtils.randomNumeric(10);
		System.out.println(Ran_number3);
		
		String Ran_Alpha1 = RandomStringUtils.randomAlphabetic(10);
		System.out.println(Ran_Alpha1);
		
		
		
	
	}

}
