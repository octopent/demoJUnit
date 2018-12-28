package com.mindtree.demo_junit;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;


public class TestCalculator {
	Calculator c = null;
	
	@Mock
	CalculatorService service; /*= mock(CalculatorService.class);*/
	
	//annotation way to create object without new; other wise upper one
	@Rule public MockitoRule rule = MockitoJUnit.rule();
	
//	dummy-object
//	CalculatorService service =new CalculatorService() {
//		public int add(int i, int j) {
//			return i+j;
//		}
//	};
	
	@Before
	public void setUp() {
		c = new Calculator(service);
	}
	
	
	@Test
	public void testAdd() {
		when(service.add(2, 3)).thenReturn(5);
		assertEquals(10, c.perform(2, 3));
		verify(service).add(2, 3);
	}	
	
	@After
	public void releaseRsrcs() {
		
	}
}
