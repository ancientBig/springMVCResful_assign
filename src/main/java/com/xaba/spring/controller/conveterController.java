package com.xaba.spring.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xaba.spring.entity.conveter;
import com.xaba.spring.entity.userOption;



@Controller
public class conveterController {

	@RequestMapping(value = "/" ,method = RequestMethod.GET)
	public String viewIndex(Map<String, Object> model) {
		userOption userMenu = new userOption();	
		
		model.put("convertMain", userMenu);
		
		List<String> fromList = new ArrayList<>();
		fromList.add("mile");
		fromList.add("kilometer");
		fromList.add("centimeter");
		model.put("fromDistanceList", fromList);
		
		List<String> toList = new ArrayList<>();
		toList.add("mile");
		toList.add("kilometer");
		toList.add("centimeter");
		model.put("toDistanceList", toList);
		
		return "index";
	}
	
	
	
	@RequestMapping(method = RequestMethod.POST)
	public String processRegistration(@ModelAttribute("convertMain") userOption userDetails, 
			Map<String, Object> model) {
		
		// implement your own registration logic here...
		
		conveter myConverter = new conveter(userDetails.getUserInput());
		
		 double resultMileToKilo =myConverter.convertMileToKilometers(myConverter.getUserInput());
		System.out.println("user input: " +userDetails.getUserInput());
		System.out.println("convert from : " + userDetails.getSelectedConvFrom());
		System.out.println("convert to : " + userDetails.getSelectedConvTo());
		//System.out.println("mile: "+myConverter.getUserInput()+"  to kilometers : "+resultMileToKilo);

		if(userDetails.getSelectedConvFrom().equalsIgnoreCase(userDetails.getSelectedConvTo()))
		{
			return "errorPage";
		}
		
		//compute
		double result=myConverter.computeCalc(userDetails.getSelectedConvFrom(), userDetails.getSelectedConvTo(), userDetails.getUserInput());
		String unitlength=myConverter.getUnit(userDetails.getSelectedConvTo());
		
		
		System.out.println("results: "+result);
		model.put("resultsvalue", result+unitlength);
		return "results";
		
		
	}
	
	
	
	
	
	

}
