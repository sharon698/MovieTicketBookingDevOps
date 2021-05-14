package com.controller;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.model.*;
import com.service.*;
import com.service.TicketService;

//Create a controller class called TicketController


//Change Class name
@Controller
public class TicketController {


	//-----------------------Change below service method name as per problem statement for property Injection using getter method for loose coupling --------------

	//TicketService should be autowired inside the TicketController.
	
	@Autowired
	private TicketService service;
	//private LoginService service;
	
	
	/*
	 A method in the TicketController known as buildState 
	 should have a annotation called ModelAttribute with the name “circleList” , 
	 which should populate the circle types (King and Queen). 
	 This should be then used to autopopulate the circle types in the showPage.jsp       
	 */
	
	
	@ModelAttribute("circleList")
	public Map<String,String> buildState() {
		Map<String,String> circle = new HashMap<String,String>();
		circle.put("King", "King");
		circle.put("Queen", "Queen");
		return circle;
	}
	
	/*
	 Initially, the user should be routed via the TicketController’s /showPage request to showpage.jsp 
	 that allows user 
	 to choose the Circle Type 
	 and enter the Movie Name and the total number of Tickets.

	
	 
	 */
	
	@RequestMapping(value = "/showPage", method = RequestMethod.GET)
	public String showPage(@ModelAttribute("ticket") Ticket ticket) {
		//model.addAttribute("ticket", new Ticket());
		return "showpage";
	}
	
	//Redirect the user to result.jsp page with a message "Your total cost is Rs.<totalCost>/- "
	
	@RequestMapping(value = "/calculateCost", method = RequestMethod.POST)
	public String calculateTotalCost(@ModelAttribute("ticket") Ticket ticket,BindingResult result,ModelMap model) {
		double totalTicketCost = service.calculateTotalCost(ticket);
		if (!result.hasErrors()){
			model.addAttribute("totalticketcost", totalTicketCost);
			return "result";
		}
		return null;
	}

	
}
