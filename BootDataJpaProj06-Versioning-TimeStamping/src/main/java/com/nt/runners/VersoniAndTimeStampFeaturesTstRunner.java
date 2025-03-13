package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.BankAccoount;
import com.nt.service.IBankAccountMgmtService;

@Component
public class VersoniAndTimeStampFeaturesTstRunner implements CommandLineRunner {

	@Autowired
	private IBankAccountMgmtService bankService;

	@Override
	public void run(String... args) throws Exception {

//		try {
//			BankAccoount account = new BankAccoount("Lahu", 210000.0, "HDFC", "Saving");
//			String msg=bankService.createAccount(account);
//			System.out.println(msg);
//		} catch (Exception e) {
//			e.printStackTrace();
//
//		}
		
		try {
			String msg=bankService.withdrawMony(152, 2000.0);
			System.out.println(msg);
			BankAccoount account=bankService.findBankAccountByAccno(152);
			System.out.println("Account Balance is Modified for "+account.getUpdateCount()+" times and opened on"+account.getOpenedOn()+" lastly operated on "+account.getLastupdatedOn());
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
