package com.stl.afs;

public class LoanOperationService implements ILoanOperation {

	int writeoffamount;

	public void save(int accountNo, int transactionamount) {
		int sum = 0;
		int dibursementamount = 10, repaymentamount = 10;
		writeoffamount = 5;
		sum = transactionamount + dibursementamount + repaymentamount
				+ writeoffamount;

	}

	public void update(int accountNo, int transactionamount) {
		int sum = 0;
		int totalAmount = 10, operationamount = 10;

		sum = transactionamount + totalAmount + operationamount
				+ writeoffamount;
		sum = calculate(sum);
	}

	private int calculate(int loaninterest) {
		return loaninterest = loaninterest + 10;
	}

}
