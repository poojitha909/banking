package com.tnsif.application;

import com.tnsif.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {

	public MMSavingAcc(int accno, String accnm, float accbal, boolean isSalaried) {
		super(accno, accnm, accbal, isSalaried);
	}
	public void withdraw(float accbal) {
		System.out.println("Dear User, your account balance:"+getAccbal());
	}
	@Override
	public String toString() {
		return "MMSavingAcc [isSalaried()=" + isSalaried() + ", toString()=" + super.toString() + ", getAccno()="
				+ getAccno() + ", getAccnm()=" + getAccnm() + ", getAccbal()=" + getAccbal() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
