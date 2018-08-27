/*
 * Author: morena
 */

package com.xaba.spring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xaba.spring.entity.conveter;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccentureMaRestfulSpringApplicationTests {

	private conveter convFunction;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void Mile2Kilometer()
	{
		convFunction= new conveter();
		double trueResult_Kilometer=convFunction.convertMileToKilometers(100);
		
		assertEquals("mile:100 equals 160.934 kilometers",160.934, trueResult_Kilometer,0);
	}


}
