package Nov6;

//non-sealed --reopens the hierarchy

//sealed-for security,type safety,design control,extend only permitted class
//non-sealed or final,sealed class can be extended but it needs to have permission
public non-sealed class HomeLoanProcessing extends Insuranceprocessing {
	public void HomeprocessInsurance() {
		processInsurance();
	}
	public static void main(String[] args) {
		HomeLoanProcessing h = new HomeLoanProcessing();
		h.HomeprocessInsurance();
	}
}
