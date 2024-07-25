package com.tnsif.application;

import com.tnsif.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{

	public MMCurrentAcc(int accno, String accnm, float accbal, float creditfinal) {
		super(accno, accnm, accbal, creditfinal);
	}
	public void withdraw(float accbal) {
		System.out.println("Dear User,your account balance:"+getAccbal()+"credit limit"+getCreditfinal());
	}
	@Override
	public String toString() {
		return "MMCurrentAcc [getCreditfinal()=" + getCreditfinal() + ", toString()=" + super.toString()
				+ ", getAccno()=" + getAccno() + ", getAccnm()=" + getAccnm() + ", getAccbal()=" + getAccbal()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}
