package com.crm.Services;

import java.util.List;

import com.crm.entites.Billing;

public interface BillingService {
	
	public void saveBill(Billing bill);

	public List<Billing> getbilling();

}
