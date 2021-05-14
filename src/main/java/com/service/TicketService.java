package com.service;

import org.springframework.stereotype.Service;

import com.model.*;

@Service
public class TicketService { //Change Service Class name as per Problem Statement
	
	
	/*
	 Create a TicketService which has a method called calculateTotalCost 
	 that takes Ticket as its argument and returns double. 
	 
	 This method should calculate the total ticket cost with the circle type chosed 
	 and the total number of tickets. 
	 Per ticket cost for the circle type is shown in the below table

           

			CircleType Cost/Ticket

               Queen       250
               King        150

 
	 */
	
	//Change model classname as per Problem Statement
	public double calculateTotalCost(Ticket ticket) {
		double totalTicketCost = 0.0;
		double perTicketCost = 0.0;
		if(ticket.getCircleType().equals("Queen")){
			perTicketCost = 250;
		}
		else if(ticket.getCircleType().equals("King")) {
			perTicketCost = 150;
		}
		totalTicketCost = ticket.getNoOfTickets()*perTicketCost;
		
		return totalTicketCost;
	}

}