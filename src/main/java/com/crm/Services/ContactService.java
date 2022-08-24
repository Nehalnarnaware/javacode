package com.crm.Services;



import java.util.List;

import com.crm.entites.Contact;


public interface ContactService {
 
	public void saveContact(Contact contact);

	public List<Contact> getallcontact();

	public Contact findContactById(long id);

	
	//public List<Lead> getAllLeads();

	//public Lead findLeadById(long id);
}
