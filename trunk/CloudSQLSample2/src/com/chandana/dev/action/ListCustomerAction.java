package com.chandana.dev.action;

import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import org.springframework.web.struts.ActionSupport;

import com.chandana.dev.domain.Customer;
import com.chandana.dev.manager.CustomerManager;

/**
 * 
 * @author Chandana Napagoda
 *
 */

public class ListCustomerAction extends ActionSupport {
	

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
	

		CustomerManager customerBo = (CustomerManager) getWebApplicationContext()
				.getBean("customerBo");

		DynaActionForm dynaCustomerListForm = (DynaActionForm) form;

		List<Customer> list = customerBo.findAllCustomer();

		dynaCustomerListForm.set("customerList", list);
		request.setAttribute("customerList", list);

		return mapping.findForward("success");

	}

}