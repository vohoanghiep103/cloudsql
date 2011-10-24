package com.chandana.dev.manager.impl;

import java.util.List;

import com.chandana.dev.dao.CustomerDao;
import com.chandana.dev.domain.Customer;

import com.chandana.dev.manager.CustomerManager;

/**
 * 
 * @author Chandana Napagoda
 *
 */

public class CustomerManagerImpl implements CustomerManager {

	CustomerDao customerDao;

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	public void addCustomer(Customer customer) {

		customerDao.addCustomer(customer);

	}

	public List<Customer> findAllCustomer() {

		return customerDao.findAllCustomer();
	}

	@Override
	public List<Customer> searchCustomer(String customerName) {
		return customerDao.searchCustomer(customerName);
	}

}