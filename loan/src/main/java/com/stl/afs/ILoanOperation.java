package com.stl.afs;

public interface ILoanOperation {
	
	void save(int accountNo, int transactionamount);
	

	void update(int accountNo, int transactionamount);
	
}
