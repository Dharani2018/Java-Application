package com.dp.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.dp.service.Service;

public class ServiceTest {
	
	@Test
	public void test1() {
		Service s = new Service();
		int result = s.add(10, 90);
		assertEquals(100, result, "OK");
		
	}

}
