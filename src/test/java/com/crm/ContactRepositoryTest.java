package com.crm;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.crm.entites.Contact;
import com.crm.entites.Lead;
import com.crm.repository.ContactRepository;


@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
@Rollback(false)
public class ContactRepositoryTest {

	
	@Autowired
	private ContactRepository contactRepo;
	
	@Test
	public void saveOneContact() {
		Contact c = new Contact("mike","M","mike@gmail.com","online","7507355460");
		contactRepo.save(c);
	}
	
}
