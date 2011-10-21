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

public class SearchCustomerAction extends ActionSupport {
	

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		

		CustomerManager customerBo = (CustomerManager) getWebApplicationContext().getBean("customerBo");

		List<Customer> list = customerBo.searchCustomer(request.getParameter("name"));		

		request.setAttribute("customerList", list);
		request.getSession().setAttribute("customerList", list);
		DynaActionForm dynaCustomerListForm = (DynaActionForm) form;
		dynaCustomerListForm.set("customerList", list);

		return mapping.findForward("success");

	}

}