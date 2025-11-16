package Exception;

import java.util.Scanner;
public class Payment {
	public static void main(String[] args) throws InsufficientBalanceException{
		customer cus = new customer("Divya","cdn1233",67778);
		
		
		int amount;
		String benName;
		String benAccountNo;
		int benAmount=4000;
		
//		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the benificiary Name");
			benName=scan.next();
			System.out.println("Enter the benAccountNo");
			benAccountNo=scan.next();
			customer ben = new customer(benName,benAccountNo,4000);
			System.out.println("Enter the amount to transfer");
			
			amount = scan.nextInt();
		int actualAmount=cus.getAmount();
		if(amount>actualAmount)
		{
			throw new InsufficientBalanceException("Insufficient Balance");
		}
		else {

			System.out.println("Before transaction Customers Balance : "+cus.getAmount());
			System.out.println("Before transactio Beneficiary Balance : "+ben.getAmount());
			ben.setAmount(ben.getAmount()+amount);
			cus.setAmount(cus.getAmount()-amount);
			System.out.println("After transaction Customers Balance : "+cus.getAmount());
			System.out.println("After transactio Beneficiary Balance : "+ben.getAmount());
		}
//		}
//		catch(Exception e) {
//			System.out.println("Exception : "+e);
//		}
	}
}

