package com.tnsif.application;

import com.tnsif.framework.BankFactory;
import com.tnsif.framework.CurrentAcc;
import com.tnsif.framework.SavingAcc;

public class MMBankFactory implements BankFactory {
	
	public SavingAcc getNewSavingAccount(int accno,String accnm,float accbal,boolean isSalaried) {
		SavingAcc  savingacc = new MMSavingAcc(accno,accnm,accbal,isSalaried);
		return savingacc;
	}
	
	public CurrentAcc getNewCurrentAccount(int accno,String accnm,float accbal,float creditfinal) {
		CurrentAcc  currentacc = new MMCurrentAcc(accno,accnm,accbal,creditfinal);
		return currentacc;
	}

	@Override
	public String toString() {
		return "MMBankFactory [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
