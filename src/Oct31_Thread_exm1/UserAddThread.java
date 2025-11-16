package Oct31_Thread_exm1;

public class UserAddThread extends Thread {
String ac;
int amount;
BankProcess bp;
UserAddThread(BankProcess bp,String ac,int amount){
	this.ac=ac;
	this.amount=amount;
	this.bp=bp;
}
@Override
public void run() {
//	BankProcess bp = new BankProcess();
	for(int i=0;i<1;i++) {
	bp.addAmount(ac, amount);}
}
}
