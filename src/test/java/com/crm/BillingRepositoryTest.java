package com.crm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.crm.entites.Contact;
import com.crm.entites.Lead;
import com.crm.repository.BillingRepository;
import com.crm.repository.ContactRepository;


@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
@Rollback(false)
public class BillingRepositoryTest {

	
	@Autowired
	private BillingRepository billingRepo;
	
	@Test
	public void saveOneContact() {
		
	}
	
}
