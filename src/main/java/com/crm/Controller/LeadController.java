package com.crm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.Services.LeadService;
import com.crm.entites.Lead;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	@RequestMapping("/viewleadpage")
	public String viewLeadspage() {
		return "save_lead";
	
	}
	@RequestMapping("/savelead")
	public String saveLead(Lead lead, ModelMap model) {
		leadService.saveLead(lead);
		model.addAttribute("lead", lead);
		return "lead_Info";	
	}
	@RequestMapping("/listAll")
	public String getLeads (ModelMap model) {
		List<Lead> leads = leadService.getAllLeads();
		model.addAttribute("leads", leads);
		return "lead_result";	
	}
	@RequestMapping("/getLeadById")
	public String getLeadById(@RequestParam("id") long id , ModelMap model) {
		Lead lead = leadService.findLeadById(id);
		model.addAttribute("lead", lead);
		return "lead_Info";	
		
		
		
	}
	
	

}
