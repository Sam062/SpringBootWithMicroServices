package base.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import base.Calculater;

public class TestCalculater {
	public static Calculater c=null;
	@BeforeClass
	public static void  init() {
		c=new Calculater();
	}
	
	@Test
	public void testCal() {
		int sum=c.add(10, 20);
		assertEquals(30, sum);
	}
	
	@Test
	public void testMul() {
		int mul=c.mul(10, 10);
		assertEquals(100, mul);
	}
	@AfterClass
	public static void destroy() {
		c=null;
	}

}
