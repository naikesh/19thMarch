package Generalization;

public class Axis implements RBI {

	@Override
	public void savingacc() {
		System.out.println("Axis saving acc interest rate is 7.6%");
		
	}

	@Override
	public void FD() {
	     System.out.println("Axis FD account interest rate is 11%");
		
	}

	@Override
	public void loan() {
		System.out.println("Axis loan account interest rate is 11.11%");
		
	}
	
	public void cashdepositemachine() {
		System.out.println("axis CDM machine");
	}

}
