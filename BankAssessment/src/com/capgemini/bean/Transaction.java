package com.capgemini.bean;

import com.capgemini.dao.DaoImpl;
import com.capgemini.dao.IDao;

public class Transaction extends Loan {
	
	
	IDao dao = new DaoImpl();
	Double amount;

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Transaction [amount=" + amount + "]";
	}

	public Double depositAmount(Double originalamount, Integer amount) {
		return (dao.depositAmount(originalamount,amount));
	}

	public Double withdrawAmount(Double originalamount, Integer amount) {
		return (dao.withdrawAmount(originalamount,amount));
	}

	public Loan payLoan(Loan loan,Double loanamount) {
		return(dao.payLoan(loan,loanamount));
	}

	public void showAccountDetails() {

	}

}
