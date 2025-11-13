package Genetrics;
import java.util.*;
//type inferers are generics
public class Project1 {
		public static void main(String[] args) {
//			Box<Almond> a= new Box<>(3);
//			Box<cashew> c=new Box<>(3);
//			a.add(new Almond("California Almond"));
//			a.add(new Almond("California Almond"));
//			a.add(new Almond("NZ almond"));
//			System.out.println(a.get(2));
//			c.add(new cashew("Australia cashew"));
//			c.add(new cashew("Indian cashew"));
////			c.add("Hello world"); without <>(generics) this is not wrong else wrong 
//			System.out.println(c.get(2));
			
			swap1(12,13);
//			int[] ar= {1,2,3,4,5};
			List<Integer> ar = new ArrayList<>();
			ar.add(1);
			ar.add(2);
			ar.add(3);
//			char[] ar1= {'A','B','C','D'};
			List<Character> ar1= new ArrayList<>();
			ar1.add('A');
			ar1.add('B');
			ar1.add('C');
			PrintList(ar);
//			PrintList(ar1);
		}
		public static <T extends Number> void swap1(T i,T j) {
			T temp;
			temp=i;
			i=j;
			j=temp;
			System.out.println("After swapping i "+i+" j:"+j);
		}
		//want to swap only int and number extends Number means all sub classes of Number can be used
		// in generics super has to be followed by ? is wildcard entry ? super (lower)T extends(upper) -bounded generics
		//compiler will erase all the generics and then forwarded to JVM
		//for runtime-exceptions generics can not be used because the type will be deleated then forwared to JVM
		public static <T extends Number> void PrintList(List<T> list) {
			//static <T extends Number> or List<? super Number>-lower bound or List<? extends Number> //upper boud
			for(T a:list) {
				System.out.println(a);
			}
		}
}
class swap{
	
}
class Almond{
	String name;
	public Almond(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return name;
	}
}
class cashew{
	String name;
	public cashew(String name) {
		this.name=name;
	}
	@Override
	public String toString() {
		return name;
	}
}
class Box<T>
{ //T -is recommended(T-type) E-Element
	T[] almonds;
	int index;
	public Box(int size) {
		almonds=(T[])new Object[size];
	}
	public void add(T a) {
		almonds[index]=a;
		index+=1;
	}
	public T get(int a) {
		return almonds[a];
	}
}
