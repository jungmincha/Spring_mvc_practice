package edu.bit.ex.calculator;

import static org.junit.Assert.*; 

import org.junit.Test;


public class CalculatorTest {

	Calculator cal = new Calculator();
	
	@Test  //junit�� ������ �� �ִ� ���� ǥ��
	public void testCalculator() {

	assertNotNull(cal);

	}
	
	@Test
public void testsub() {
		
		Calculator cal = new Calculator();
	
			int result = cal.sub(10, 20);
	
			assertEquals(-10, result);
		

	}

}
