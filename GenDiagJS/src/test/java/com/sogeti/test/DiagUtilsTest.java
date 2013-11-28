package com.sogeti.test;

import org.junit.Assert;
import org.junit.Test;

import com.sogeti.DiagUtils;


public class DiagUtilsTest {

	
	@Test
	public void getCoordonateXTest(){
		double result = DiagUtils.getCoordonateX(0, 235, 0);
		Assert.assertEquals("coord x  for angle 0 <> Ray",new Double(235), new Double(result),0.00000001d);
		
		double result2 = DiagUtils.getCoordonateX(0, 235, 90);
		Assert.assertEquals("coord x  for angle 90° <> 0",new Double(0), new Double(result2),0.00000001d);
		
		double result3 = DiagUtils.getCoordonateX(0, 235, 180);
		Assert.assertEquals("coord x  for angle 180 <> -Ray",new Double(-235), new Double(result3),0.00000001d);
		
		double result4 = DiagUtils.getCoordonateX(0, 235, 270);
		Assert.assertEquals("coord x  for angle 270° <> 0",new Double(0), new Double(result4),0.00000001d);
		
		double result5 = DiagUtils.getCoordonateX(350, 235, 270);
		Assert.assertEquals("coord x  for angle 270° <> 350",new Double(350), new Double(result5),0.00000001d);
		
		double result6 = DiagUtils.getCoordonateX(350, 235, 180);
		Assert.assertEquals("coord x  for angle 180° <> 350-Ray",new Double(115), new Double(result6),0.00000001d);
	}
	
	@Test
	public void getCoordonateYTest(){
		double result = DiagUtils.getCoordonateY(0, 235, 0);
		Assert.assertEquals("coord y  for angle 0 <> 0",new Double(0), new Double(result),0.00000001d);
		
		double result2 = DiagUtils.getCoordonateY(0, 235, 90);
		Assert.assertEquals("coord y  for angle 90° <> -Ray",new Double(-235), new Double(result2),0.00000001d);
		
		double result3 = DiagUtils.getCoordonateY(0, 235, 180);
		Assert.assertEquals("coord y  for angle 180 <> 0",new Double(0), new Double(result3),0.00000001d);
		
		double result4 = DiagUtils.getCoordonateY(0, 235, 270);
		Assert.assertEquals("coord y  for angle 270° <> Ray",new Double(235), new Double(result4),0.00000001d);
		
		double result5 = DiagUtils.getCoordonateY(350, 235, 270);
		Assert.assertEquals("coord y  for angle 270° <> 350+235",new Double(585), new Double(result5),0.00000001d);
		
		double result6 = DiagUtils.getCoordonateY(350, 235, 180);
		Assert.assertEquals("coord y  for angle 180° <> 350",new Double(350), new Double(result6),0.00000001d);
	}
}