package com.tnsif.main;

import com.tnsif.application.MMBankFactory;
import com.tnsif.application.MMCurrentAcc;
import com.tnsif.application.MMSavingAcc;

public class Result {
	public static void main(String[] args) {
		MMBankFactory bank = new MMBankFactory();
		
		//saving
		MMSavingAcc sa = (MMSavingAcc)bank.getNewSavingAccount(1,"pooji",1000.0f,true);
		sa.withdraw(sa.getAccbal());
		
		//current
		MMCurrentAcc cu = (MMCurrentAcc)bank.getNewCurrentAccount(11,"pooji",1000.0f,200.0f);
		cu.withdraw(cu.getAccbal());
	}

}
