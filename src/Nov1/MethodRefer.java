package Nov1;

import java.util.*;

public class MethodRefer {
	public static void print(String name) {
		System.out.println(name);
	}
	public static void main(String[] args) {
		List<String> names = Arrays.asList("11","22","33","44");
		names.forEach(MethodRefer::print);
		logger l = new logger();
		names.forEach(l::print);
		names.sort(String::compareToIgnoreCase);
		names.forEach(l::print);
	}
}

class logger{
	public void print(String name) {
		System.out.println(name);
	}
}