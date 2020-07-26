package com.capgemini.dao;

import com.capgemini.bean.Account;
import com.capgemini.bean.Loan;

public interface IDao {
	
	Account getDetails(String accountId, Account accounts[]);
	Loan getLoan(Integer loanId,Double loanAmount,String loanType);
	Loan showLoanDetails(Loan loan);
	Double depositAmount(Double originalamount, Integer amount);
	Double withdrawAmount(Double originalamount, Integer amount);
	Loan payLoan(Loan loan,Double loanamount);

}
