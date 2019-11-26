package com.ramesh.examples.java.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ramesh.examples.java.model.Contact;
import com.ramesh.examples.java.util.ContactBusiness;

@Controller
public class MyContactController {
	@RequestMapping("/list_contact")
	public String getListContact(Model model) {
		 ContactBusiness business = new ContactBusiness();
	     List<Contact> contactList = business.getContactList();
	         
	     model.addAttribute("contacts", contactList);       
	         	
	        return "contact";
	}
	
}
