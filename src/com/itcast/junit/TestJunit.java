package com.itcast.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestJunit {
	@Test
   public void testJunit(){
	   System.out.println("≤‚ ‘junit!");
   }
	@Before
	public void testBefore(){
		System.out.println("≤‚ ‘before!");
	}
	@After
	public void testAfter(){
		System.out.println("≤‚ ‘after£°");
	}
}
