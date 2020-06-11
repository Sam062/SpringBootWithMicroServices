package base.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import base.Calculater;

public class TestCalculater {
	@Test
	public void testCal() {
		
		Calculater c=new Calculater();
		int sum=c.add(10, 20);
		assertEquals(30, sum);
	}

}
