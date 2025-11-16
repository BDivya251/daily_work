package Exception;


public class customer {
	private String name;
	private String accountno;
	private int amount;
	customer(String name,String accountno,int amount){
		this.setName(name);
		this.setAccountno(accountno);
		this.setAmount(amount);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountno() {
		return accountno;
	}
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
