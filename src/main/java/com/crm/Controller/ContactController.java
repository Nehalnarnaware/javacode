package com.crm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.Services.ContactService;
import com.crm.Services.LeadService;
import com.crm.entites.Contact;
import com.crm.entites.Lead;

@Controller
public class ContactController {
	
	
	@Autowired
	private ContactService contactService;
	
	
	@Autowired
	private LeadService leadService;
	
	
	
	@RequestMapping("/ConvertToconvert")
	public String ConvertToconvert(@RequestParam("id") long id , ModelMap model) {
		Lead lead = leadService.findLeadById(id);
		
		
		Contact contact =new Contact();
		
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setLeadSource(lead.getLeadSource());
		contact.setMobile(lead.getMobile());
		
		contactService.saveContact(contact);
		
		leadService.deleteLeadById(id);
		
		List<Contact> contacts = contactService.getallcontact();
		model.addAttribute("contacts", contacts);
		return "contacts_result";
		
	}
	@RequestMapping("/listContacts")
	public String listContacts(ModelMap model) {
		List<Contact> contacts = contactService.getallcontact();
		model.addAttribute("contacts", contacts);
		return "contacts_result";
		
	}
	@RequestMapping("/getContactById")
	public String getContactById(@RequestParam("id") long id , ModelMap model) {
		
		Contact contact = contactService.findContactById(id);
	  
		model.addAttribute("contact", contact);
		
		return "contact_info";
		
	}
	@RequestMapping("/getByIdforbilling")
	public String getByIdforbilling(@RequestParam("id") long id , ModelMap model) {
		Contact contact = contactService.findContactById(id);
		  
		model.addAttribute("contact", contact);
		
		return "billing_info";
		
	}
	
}
