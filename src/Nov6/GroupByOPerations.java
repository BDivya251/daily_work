package Nov6;

import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupByOPerations {
	public static void main(String[] args) {
		var nameList = Arrays.asList("James","Jony","Rohan","Roy");
		
		nameList.stream().map(name->name.toLowerCase()).forEach(System.out::println);
		Map<Character,List<String>> filtermap=nameList.stream().collect(Collectors.groupingBy(s->s.charAt(0)));
		
		Set<Character> keySet = filtermap.keySet();
		
		
		
		keySet.forEach(s->{
			System.out.println("Value of s "+s);
		});
		
		Iterator it = keySet.iterator();
		while(it.hasNext()) {
			char a = (char) it.next();
			System.out.println(filtermap.get(a));
		}
		
		var keySet1 = filtermap.keySet();
		keySet1.forEach(s->{
			System.out.println("Value of s "+s);
		});
		
		Stream<Integer> nums = Stream.of(12,13,14,15);
		double a = nums.collect(Collectors.averagingInt(s->s*s));
		
		System.out.println(a);
	}
}
