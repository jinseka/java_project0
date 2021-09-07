package com.mega.mvc13;

public class AirDTO {
	private String ticketno;
	private String ticketprice;
	private String ticketst;
	private String ticketsp;
	private String stdate;
	private String spdate;
	private String shuttle;
	private String people;
	
	
	
	public String getTicketno() {
		return ticketno;
	}
	public void setTicketno(String ticketno) {
		this.ticketno = ticketno;
	}
	public String getTicketprice() {
		return ticketprice;
	}
	public void setTicketprice(String ticketprice) {
		this.ticketprice = ticketprice;
	}
	public String getTicketst() {
		return ticketst;
	}
	public void setTicketst(String ticketst) {
		this.ticketst = ticketst;
	}
	public String getTicketsp() {
		return ticketsp;
	}
	public void setTicketsp(String ticketsp) {
		this.ticketsp = ticketsp;
	}
	public String getStdate() {
		return stdate;
	}
	public void setStdate(String stdate) {
		this.stdate = stdate;
	}
	public String getSpdate() {
		return spdate;
	}
	public void setSpdate(String spdate) {
		this.spdate = spdate;
	}
	public String getShuttle() {
		return shuttle;
	}
	public void setShuttle(String shuttle) {
		this.shuttle = shuttle;
	}
	public String getPeople() {
		return people;
	}
	public void setPeople(String people) {
		this.people = people;
	}
	@Override
	public String toString() {
		return "AirDTO [ticketno=" + ticketno + ", ticketprice=" + ticketprice + ", ticketst=" + ticketst
				+ ", ticketsp=" + ticketsp + ", stdate=" + stdate + ", spdate=" + spdate + ", shuttle=" + shuttle
				+ ", people=" + people + ", getTicketno()=" + getTicketno() + ", getTicketprice()=" + getTicketprice()
				+ ", getTicketst()=" + getTicketst() + ", getTicketsp()=" + getTicketsp() + ", getStdate()="
				+ getStdate() + ", getSpdate()=" + getSpdate() + ", getShuttle()=" + getShuttle() + ", getPeople()="
				+ getPeople() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
	
	

}	