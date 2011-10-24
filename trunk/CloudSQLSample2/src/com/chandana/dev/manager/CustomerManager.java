package com.chandana.dev.manager;

import java.util.List;

import com.chandana.dev.domain.Customer;

/**
 * 
 * @author Chandana Napagoda
 *
 */

public interface CustomerManager{
 
	void addCustomer(Customer customer);
	
	List<Customer> findAllCustomer();
	
	List<Customer> searchCustomer(String customerName);
 
}