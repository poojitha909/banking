package com.tnsif.framework;

public interface BankFactory {
	public SavingAcc getNewSavingAcc(int accno,String accnm,float accbal,boolean isSalaried);
	public CurrentAcc getNewCurrentAcc(int accno,String accnm,float accbal,float creditlimit);
	

}
