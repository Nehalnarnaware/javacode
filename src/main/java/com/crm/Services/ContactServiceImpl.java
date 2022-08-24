package com.crm.Services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.entites.Contact;

import com.crm.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {
	
	
	
	@Autowired
	private ContactRepository contactRepo;
	
	

	@Override
	public void saveContact(Contact contact) {
		contactRepo.save(contact);
	}

	@Override
	public List<Contact> getallcontact() {
		List<Contact> contacts = contactRepo.findAll();
		return contacts;
	}


	@Override
	public Contact findContactById(long id) {
		
		Optional<Contact> findById = contactRepo.findById(id);
		
		Contact contact = findById.get();
		return contact;
	}


}
