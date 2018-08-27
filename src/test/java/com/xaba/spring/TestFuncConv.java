package com.xaba.spring;

import static org.junit.Assert.*;

import org.junit.Test;

import com.xaba.spring.entity.conveter;

public class TestFuncConv {

	private conveter conFunc;
	@Test
	public void convertCenti2Kilometer() {
		conFunc= new conveter();
		double result =conFunc.convertCentimeterToKilometer(4000);
		assertEquals("4000 cm equals 0.04 km. ", 0.04,result,0);
	}
	
	@Test
	public void convertCenti2Mile() {
		conFunc= new conveter();
		double result =conFunc.convCentimeterToMile(4000);
		assertEquals("4000 cm equals 0.02485485 mile. ", 0.0248548,result,0);
	}

}
