package com.chandana.dev.dao.impl;

import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.chandana.dev.action.SearchCustomerAction;
import com.chandana.dev.dao.CustomerDao;
import com.chandana.dev.domain.Customer;

/**
 * 
 * @author Chandana Napagoda
 *
 */

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	private static final Logger log = Logger
			.getLogger(SearchCustomerAction.class.getName());

	public void addCustomer(Customer customer) {

		customer.setCreatedDate(new Date());
		getHibernateTemplate().save(customer);

	}

	@SuppressWarnings("unchecked")
	public List<Customer> findAllCustomer() {

		return getHibernateTemplate().find("from Customer");

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> searchCustomer(String customerName) {
		log.severe("from Customer c WHERE c.name LIKE " + customerName);
		return getHibernateTemplate()
				.find("from Customer c WHERE c.name LIKE ?",
						"%" + customerName + "%");
	}
}