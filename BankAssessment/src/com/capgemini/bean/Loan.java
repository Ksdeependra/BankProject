package com.capgemini.bean;

import com.capgemini.dao.DaoImpl;
import com.capgemini.dao.IDao;

public class Loan extends Account{
	

	IDao dao=new DaoImpl();
	
	Integer loanId;
	Double loanAmount;
	String loanType;

	public Integer getLoanId() {
		return loanId;
	}

	public void setLoanId(Integer loanId) {
		this.loanId = loanId;
	}

	public Double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public Loan getLoan(Integer loanId,Double loanAmount,String loanType) {
		System.out.println("loan class");
		return(dao.getLoan(loanId,loanAmount,loanType));
	}

	public Loan showLoanDetails(Loan loan) {
		return(dao.showLoanDetails(loan));
	}

	@Override
	public String toString() {
		return "Loan [loanId=" + loanId + ", loanAmount=" + loanAmount + ", loanType=" + loanType + "]";
	}
	

}
