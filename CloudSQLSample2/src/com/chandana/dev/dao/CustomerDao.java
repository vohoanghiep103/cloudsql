package com.chandana.dev.dao;

import java.util.List;

import com.chandana.dev.domain.Customer;

/**
 * 
 * @author Chandana Napagoda
 *
 */

public interface CustomerDao {

	void addCustomer(Customer customer);

	List<Customer> findAllCustomer();

	List<Customer> searchCustomer(String customerName);

}