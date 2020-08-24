package com.harish.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.harish.springdemo.dao.CustomerDAO;
import com.harish.springdemo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerDAO customerDAO;

	@RequestMapping("/list")
	public String listCustomers(Model model) {
		List<Customer> customers = customerDAO.getCustomers();

		model.addAttribute("customers", customers);

		return "list-customers";
	}
}
