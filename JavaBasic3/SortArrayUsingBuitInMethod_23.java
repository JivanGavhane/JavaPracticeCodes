package JavaBasic3;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayUsingBuitInMethod_23 {
	public static void main(String[] args) {
		
		int a[]= {20,10,30,40,50,70,60,80,90,100};
		
		//1
		/*
		System.out.println("Array before sorting"+ Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		*/
		
		//2
		/*
		System.out.println("Array before sorting"+ Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a));
		*/
		
		//3
		Integer b[]= {5,3,4,1,2};
		System.out.println("Array before sorting"+ Arrays.toString(a));
		Arrays.sort(b,Collections.reverseOrder());
		System.out.println(Arrays.toString(b));
		
	}
}
