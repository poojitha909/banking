package com.tnsif.framework;

public abstract class CurrentAcc extends BankAcc {
	private float creditfinal;

	public CurrentAcc(int accno, String accnm, float accbal, float creditfinal) {
		super(accno, accnm, accbal);
		this.creditfinal = creditfinal;
	}

	public float getCreditfinal() {
		return creditfinal;
	}

	public void setCreditfinal(float creditfinal) {
		this.creditfinal = creditfinal;
		
	}
	@Override
	public void deposit(float accbal) {
		
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditfinal=" + creditfinal + "]";
	}
	

}
