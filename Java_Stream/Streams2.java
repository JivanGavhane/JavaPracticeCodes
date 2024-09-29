package Java_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("Jivan");
		names.add("Akanksha");
		names.add("Chakuli");
		
		//map function use for manipulation inn streams
		
		//1.print name with have last letter as 'a' and  convert it into uppercase
		names.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//2. Convert Array to list select all name start with letter "A" and sort it and convert to Upper case
		List<String> name = Arrays.asList("Ashwini","Chakuli");
		name.stream().filter(s->s.startsWith("A")).map(s->s.toUpperCase()).sorted().forEach(s->System.out.println(s));
		
		//3.Merge 2 different list
		Stream<String> new_Stream=Stream.concat(names.stream(), name.stream());
		new_Stream.forEach(s->System.out.println(s));
		
		//3.equals operation
		//boolean flag = new_Stream.anyMatch(s->s.equalsIgnoreCase("Jivan"));
		//System.out.println(flag);
		
		//4.chose specific using collector and store in another list
		List<String> colleges = Stream.of("Sinhgad","DY Patil","JSPM","Sinhgad").filter(s->s.endsWith("d")).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(colleges.get(1));
		
		//5.remove duplicate numbers and sort it and pick only one number
		List<Integer> numbers = Arrays.asList(2,4,5,2,1,7,6,8,9);
		numbers.stream().sorted().distinct().forEach(s->System.out.println(s));
		
	}

}
