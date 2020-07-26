package com.capgemini.dao;

import com.capgemini.bean.Account;
import com.capgemini.bean.Loan;

public class DaoImpl implements IDao{

	@Override
	public Account getDetails(String accountId, Account accounts[]) {
		for(Account temp:accounts) {
			if(temp.getaccountId().equals(accountId)) {
				System.out.println(temp.getaccountId());
				System.out.println(temp.getaccountName());
				System.out.println(temp.getAddress());
				System.out.println(temp.getDepositAmount());
				return temp;
			}
			
		}
		return null;
		
	}

	@Override
	public Loan getLoan(Integer loanId,Double loanAmount,String loanType) {
		System.out.println("inside daoimpl");
		Loan loan=new Loan();
		loan.setLoanId(loanId);
		loan.setLoanAmount(loanAmount);
		loan.setLoanType(loanType);
		System.out.println("exit daoimpl");
//		System.out.println(loan);
		return loan;
		
	}

	@Override
	public Loan showLoanDetails(Loan loan) {
		System.out.println(loan.getLoanId());
		System.out.println(loan.getLoanAmount());
		System.out.println(loan.getLoanType());
		return loan;
		
	}

	@Override
	public Double depositAmount(Double originalamount, Integer amount) {
		return originalamount+amount;
		
	}

	@Override
	public Double withdrawAmount(Double originalamount, Integer amount) {
		return originalamount-amount;
		
	}

	@Override
	public Loan payLoan(Loan loan,Double loanamount) {
		loan.setLoanAmount(loan.getLoanAmount()-loanamount);
		return loan;
		
	}

}
