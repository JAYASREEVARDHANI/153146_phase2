package com.cg.mypaymentapp.repo;

import java.util.List;

import com.cg.mypaymentapp.beans.Customer;
import com.cg.mypaymentapp.beans.Transactions;
import com.cg.mypaymentapp.exceptions.InvalidInputException;

public interface WalletRepo {

	public boolean save(Customer customer) throws InvalidInputException;

	public Customer findOne(String mobileNo) throws InvalidInputException;

	public void update(Customer customer);
	
	public void addTransaction(String mobileNo, Transactions t);
	
	public List<Transactions> getTransaction(String mobileNo);
}
