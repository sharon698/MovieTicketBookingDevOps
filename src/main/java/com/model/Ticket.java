package com.model;

//Create a class called Ticket with three attributes movieName, circleType, noOfTickets. Generate necessary getters and setters .



//Give Class Name
public class Ticket{

	//Include attribute name
	private String movieName;
	private int noOfTickets;
	private String circleType;
	
	//Include getter and setter 
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	public String getCircleType() {
		return circleType;
	}
	public void setCircleType(String circleType) {
		this.circleType = circleType;
	}
	
	
	
	
	
}