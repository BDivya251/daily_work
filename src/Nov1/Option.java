package Nov1;

import java.util.Optional;

public class Option {
	public static void main(String[] args) {
		Optional<String> op=Optional.empty();
//		System.out.println(op.get());
		Optional<String> op1 = Optional.of("");
		System.out.println(op1.get());
		Optional<String> op2 = Optional.ofNullable("divya");
		String name=op2.orElse("Default");
		String name2=op2.orElseGet(()->"hello"); //supplier that returns the value to be returned
		
		System.out.println(name);
		System.out.println(op2.isEmpty());
		System.out.print(op1.isPresent());
		op2.ifPresent(name1->System.out.println(name1.toUpperCase()));
		
		
	}

}
