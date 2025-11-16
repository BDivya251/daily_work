package Oct31_Thread_exm1;

import java.util.Optional;

interface Greet{
	void sayHello(String name);
}
interface Calculation{
	int add(int a,int b);
}
interface sayHello{
	void sayH();
}
public class LambdaExp {
	String name="Hello";
public static void main(String[] args) {
	Greet greet=(name)->{
		System.out.println("Hello "+name);
	};
	greet.sayHello("Divya");
	Calculation co1=(i,j)->{return i+j;};
	System.out.println(co1.add(2,3));
//	LambdaExp ex = new LambdaExp();
//	ex.print(co1);
//	System.out.println(ex.getName().toUpperCase()); //null pointer exception-becz it returns null
//	sayHello s = ()->System.out.println("Hello from lambda");
//	s.sayH();
	Optional<String> name = Optional.ofNullable(null);
	System.out.println(name.isPresent());
	name.ifPresent(n->System.out.println("Hello "+name));
//	Optional<String> email = Optional.ofNullable("divya@gmail.com");
//	System.out.println(email);
//	email.ifPresent(n->System.out.println("Email : "+email));
}
public void print(Calculation a) {
	System.out.println(a.add(3,4));
}
public String getName() {
	return name;
}
}