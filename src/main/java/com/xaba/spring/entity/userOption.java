package com.xaba.spring.entity;

public class userOption {

	private String selectedConvFrom;
	private String selectedConvTo;
	private double userInput;
	
	
	
	
	@Override
	public String toString() {
		return "userOption [selectedConvFrom=" + selectedConvFrom + ", selectedConvTo=" + selectedConvTo
				+ ", userInput=" + userInput + "]";
	}
	public String getSelectedConvTo() {
		return selectedConvTo;
	}
	public void setSelectedConvTo(String selectedConvTo) {
		this.selectedConvTo = selectedConvTo;
	}
	public double getUserInput() {
		return userInput;
	}
	public void setUserInput(double userInput) {
		this.userInput = userInput;
	}
	
	
	
	
	public String getSelectedConvFrom() {
		return selectedConvFrom;
	}
	public void setSelectedConvFrom(String selectedConvFrom) {
		this.selectedConvFrom = selectedConvFrom;
	}
	
	
	

}
