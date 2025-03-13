package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.BankAccoount;
import com.nt.repository.IBankAccountRepository;

@Service
public class BankAccountMgmtService implements IBankAccountMgmtService {

	@Autowired
	private IBankAccountRepository bankRepo;

	@Override
	public String createAccount(BankAccoount account) {
		long acno = bankRepo.save(account).getAcno();
		return "Bank Account is Opened with account number::" + acno;
	}

	@Override
	public String withdrawMony(long acno, double amount) {
		// Load the Account
		Optional<BankAccoount> opt = bankRepo.findById(acno);
		if (opt.isPresent()) {
			// get the object
			BankAccoount account = opt.get();
			// update the object
			account.setBalance(account.getBalance() - amount);
			bankRepo.save(account);

			return "Money is Withdrwan from the bankAccount";
		} else {
			return acno + "Bank Account is Not Found..!";
		}
	}

	@Override
	public String depositeMoney(long acno, double amount) {
		// Load the Account
		Optional<BankAccoount> opt = bankRepo.findById(acno);
		if (opt.isPresent()) {
			// get the object
			BankAccoount account = opt.get();
			// update the object
			account.setBalance(account.getBalance() + amount);
			bankRepo.save(account);

			return "Money is Deposited int to the bankAccount";
		} else {
			return acno + "Bank Account is Not Found..!";
		}
	}

	@Override
	public BankAccoount findBankAccountByAccno(long acno) {

		// Load Object
		BankAccoount account = bankRepo.findById(acno) .orElseThrow(() -> new IllegalArgumentException("Invalid BankAccount"));
		return account;
	}

}
