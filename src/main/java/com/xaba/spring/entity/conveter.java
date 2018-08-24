package com.xaba.spring.entity;

public class conveter {

	
	private int id;
	private double userInput;
	private double resultConv;
	private String options;
	
	
	public conveter() {
		// TODO Auto-generated constructor stub
	}

	
	public double computeCalc(String methodA/*from*/,String methodB/*to*/,double value)
	{
		methodA=methodA.toUpperCase();//from
		methodB=methodB.toUpperCase();//to
		
		switch(methodA)
		{
		case "MILE":
			if(methodB.equalsIgnoreCase("KILOMETER"))//return kilometers
			{
				return this.convertMileToKilometers(value);
			}
			else if(methodB.equalsIgnoreCase("CENTIMETER"))//to centimeter
			{
				return this.convMileToCentimeter(value);
			}
			break;
			
		case "KILOMETER":
					if(methodB.equalsIgnoreCase("MILE"))//to miles
					{
						return this.convertKilometersToMiles(value);
					}
					else if(methodB.equalsIgnoreCase("CENTIMETER"))
					{
						return this.convertKilometerToCentimeter(value);
					}
					
					break;
					
		case"CENTIMETER":
					if(methodB.equalsIgnoreCase("MILE"))
					{
						return this.convCentimeterToMile(value);
					}
					else if(methodB.equalsIgnoreCase("KILOMETER"))
					{
						return this.convertCentimeterToKilometer(value);
					}
			
				break;
		}
		
		return -1;
	}
	
	public conveter(double userInput) {
		super();
		this.userInput = userInput;
	}


	//mile kilo
	public double convertMileToKilometers(double mile)//return kilo meters
	{
		
		 return mile* 1.60934;
	}
	
	public double convertKilometersToMiles(double Kilometers)//return miles
	{
		double miles = Kilometers * 0.621;
		
		return miles;
	}
	
	
	//kilometers-centimeters
	public double convertKilometerToCentimeter(double kilometer)// the centimeters
	{
		double centimeters = kilometer * 100000;
		return centimeters;
	}
	
	
	public double convertCentimeterToKilometer(double centimeter)//get kilometer
	{
		double kilometer=centimeter*0.00001; 
		return kilometer; 
	}
	
	//mile& centimeters
	public  double convMileToCentimeter(double mile)
	{
		double centimeter=mile * 160934.4;
		
		return centimeter;
	}
	
	public  double convCentimeterToMile(double centimeter)
	{
		double mile=centimeter *6.2137E-6;
		
		return mile;
	}
	
	//
	public String getUnit(String method)
	{
		String results="";
		method=method.toUpperCase();
		
		switch(method)
		{
		case"CENTIMETER":
			results= " cm.";
			break;
			
		case"KILOMETER":
			
			results= " km.";
			break;
			
		case"MILE":
			results=" mi.";
			break;
			
		}
		
		return results;
	}
	
	
	
	public String getOptions() {
		return options;
	}



	public void setOptions(String options) {
		this.options = options;
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getUserInput() {
		return userInput;
	}


	public void setUserInput(double userInput) {
		this.userInput = userInput;
	}


	public double getResultConv() {
		return resultConv;
	}


	public void setResultConv(double resultConv) {
		this.resultConv = resultConv;
	}


	public conveter(double userInput, double resultConv) {
		super();
		this.userInput = userInput;
		this.resultConv = resultConv;
	}


	@Override
	public String toString() {
		return "conveter [id=" + id + ", userInput=" + userInput + ", resultConv=" + resultConv + ", options=" + options
				+ "]";
	}
	
	

}
