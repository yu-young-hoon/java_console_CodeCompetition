package com.yh.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yh.designpattern.Singleton;

public class TestSingleton {
	@Test
	public void TestSingleton() throws Exception {
		Singleton.getInstance().setData(3);
		
		assertEquals(3, Singleton.getInstance().getData());
	}
}
