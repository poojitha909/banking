package com.tnsif.framework;

public abstract class SavingAcc extends BankAcc{
	private boolean isSalaried;
	private static final int minbal = 200;
	public SavingAcc(int accno, String accnm, float accbal, boolean isSalaried) {
		super(accno, accnm, accbal);
		this.isSalaried = isSalaried;
	}
	public boolean isSalaried() {
		return isSalaried;
	}
	public void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}
	public static int getMinbal() {
		return minbal;
	}
	public void withdraw(float accbal) {
		
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + "]";
	}
	
	

}
