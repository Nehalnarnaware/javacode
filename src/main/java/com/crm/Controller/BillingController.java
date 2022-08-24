package com.crm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crm.Services.BillingService;
import com.crm.entites.Billing;

@Controller
public class BillingController {
	
	@Autowired
	private BillingService billingService;
	
	
	@RequestMapping("/generatebill")
	public String generateBill(Billing bill, ModelMap model) {
		billingService.saveBill(bill);
		model.addAttribute("bill", bill);
		return "final_list_billing_info";	
		
	}
	@RequestMapping("/listAllbill")
	public String getBilling(ModelMap model) {
		List<Billing> bills = billingService.getbilling();
		model.addAttribute("bills", bills);
		return "result_bill";
		
	}
	

}
