package com.crm.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.entites.Billing;
import com.crm.repository.BillingRepository;


@Service
public class BillingServiceImpl implements BillingService {
	
	
	@Autowired
	private BillingRepository billingRepo;
	
	

	@Override
	public void saveBill(Billing bill) {
		billingRepo.save(bill);
		

	}



	@Override
	public List<Billing> getbilling() {
	List<Billing> bills = billingRepo.findAll();
		
		return bills;
	}

}
