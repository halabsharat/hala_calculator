package hala_calc;

import static org.junit.Assert.*;

import org.junit.Test;

import hala_calc.calculate;

public class calculateTest {

	@Test
	public void Addtest() {
		assertEquals("error in add()",3,calculate.add(1,2));
		assertEquals("error in add()",-3,calculate.add(-1,-2));
		assertEquals("error in add()",9,calculate.add(9,0));
		
	}
	
	public void Addtestfail() {
		assertEquals("error in add()",0,calculate.add(1,2));
	}

}