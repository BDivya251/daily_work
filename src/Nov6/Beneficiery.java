package Nov6;

public record Beneficiery(String name,String acountno) {
	public boolean validate(String name) {
		if(name!=null && name.equals("james"))
{
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean equals(Account acc,Beneficiery bf) {
		if(acc.accountNo().equals(bf.acountno)) {
		return true;}
		else {
			return false;
		}
	}
}
