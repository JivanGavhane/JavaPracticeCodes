package java_basic2;

import java.util.HashSet;

public class Find_DuplicateElement_InArray_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[] = {"Java","Python","C#","Java","Ruby"};
		
		//Approach 1 - Using Logic
		/*
		boolean flag = false;
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Found Duplicate Element "+a[i]);
					flag = true;
				}
				
			}
		}
		if(flag == false)
		{
			System.out.println("Does not found the duplicate element");
		}
		
		*/
		
		//Using HashSet data structure
		
		HashSet <String> langs = new HashSet();
		
		boolean flag=false;
		for(String l:a) {
			if(langs.add(l)==false)
			{
				System.out.println("Found the duplicate Element: "+l);
				flag=true;
			}
		}
		
		if(flag==false)
		{
			System.out.println("Did not found the duplicate elements");
		}
	}

}
