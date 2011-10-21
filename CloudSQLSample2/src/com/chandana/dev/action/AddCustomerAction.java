package com.chandana.dev.action;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.web.struts.ActionSupport;

import com.chandana.dev.domain.Customer;
import com.chandana.dev.form.CustomerForm;
import com.chandana.dev.manager.CustomerManager;

/**
 * 
 * @author Chandana Napagoda
 *
 */

public class AddCustomerAction extends ActionSupport {

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {		
		CustomerManager customerBo = (CustomerManager) getWebApplicationContext()	.getBean("customerBo");
		CustomerForm customerForm = (CustomerForm) form;
		Customer customer = new Customer();
		BeanUtils.copyProperties(customer, customerForm);
		customerBo.addCustomer(customer);
		return mapping.findForward("success");

	}

}