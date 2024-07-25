package com.tnsif.framework;

public abstract class BankAcc {
	private int accno;
	private String accnm;
	private float accbal;
	public BankAcc(int accno, String accnm, float accbal) {
		super();
		this.accno = accno;
		this.accnm = accnm;
		this.accbal = accbal;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getAccnm() {
		return accnm;
	}
	public void setAccnm(String accnm) {
		this.accnm = accnm;
	}
	public float getAccbal() {
		return accbal;
	}
	public void setAccbal(float accbal) {
		this.accbal = accbal;
	}
	abstract public void withdraw(float accbal);
	
	abstract public void deposit(float accbal);
	@Override
	public String toString() {
		return "BankAcc [accno=" + accno + ", accnm=" + accnm + ", accbal=" + accbal + ", getAccno()=" + getAccno()
				+ ", getAccnm()=" + getAccnm() + ", getAccbal()=" + getAccbal() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
