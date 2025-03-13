package com.nt.service;

import com.nt.entity.BankAccoount;

public interface IBankAccountMgmtService {

	public String createAccount(BankAccoount bank);
	public String withdrawMony(long acno,double amount);
	public String depositeMoney(long acno,double amount);
	public BankAccoount findBankAccountByAccno(long acno);
	
}
