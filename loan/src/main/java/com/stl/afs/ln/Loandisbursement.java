package com.stl.afs.ln;

import java.util.Date;

public class Loandisbursement {
	
	String accountNo;
	
	int disbursementAmount;
	
	Date dibursmentDate;
	
	

	public Loandisbursement() {
		super();
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getDisbursementAmount() {
		return disbursementAmount;
	}

	public void setDisbursementAmount(int disbursementAmount) {
		this.disbursementAmount = disbursementAmount;
	}

	public Date getDibursmentDate() {
		return dibursmentDate;
	}

	public void setDibursmentDate(Date dibursmentDate) {
		this.dibursmentDate = dibursmentDate;
	}
	
	
	

}
