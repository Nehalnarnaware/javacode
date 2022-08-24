package com.crm.Services;

import java.util.List;

import com.crm.entites.Lead;

public interface LeadService {
 
	public void saveLead(Lead lead);
	
	public List<Lead> getAllLeads();

	public Lead findLeadById(long id);

	public void deleteLeadById(long id);
}
