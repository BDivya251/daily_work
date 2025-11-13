package Nov6;

public class TextBasedProcessing {
	public static void main(String[] args) {
		
		String details="mdsm "+"mkdskmk"+"dksmkdmsmdnms";
		String detailstext="String comparison is the process of c"
				+ ""
				+ "omparing two strings to determine if they are e"
				+ "qual, or to find their lexicographical order";
		String msg="""
				
				name %s, age %d!""".formatted("divya",20);
		System.out.println(msg);
		String json="""
				{
				name:james,
				accounno:2328232,
				accountname:wejfwke,
				}
				""";
		
		String json1="""
				{
				name:%s,
				accounno:%d,
				accountname:%s,
				}
				""".formatted("divya",176318,"jewiufwhj");
		
		System.out.println(json1);
		TextBasedProcessing  tbp = new TextBasedProcessing();
		int a=tbp.getaccountDetails();
		System.out.println(a);
	}
	public int  getaccountDetails() {
		String name="bhavya";
		int b=0;
		int balance= switch(name) {
		case "rohan"->200;
		case "james","joy","kevin"->10000;
		case "bhavya"->{
			System.out.println("inside bhavya class");
			yield 10000; //yeild only exits the switch expression and provides a value back to it,where as return would exit the entire method
		}
		
		default->20;
		};
		return balance;
	}

}
