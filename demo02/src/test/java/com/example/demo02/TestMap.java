package com.example.demo02;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TestMap {
	@Test
	public void testMap(){
		Map<String,String> map =new HashMap<>();
		map.put("name","gsy");
		map.put("sex","");
		System.out.println(map.get("name")+":"+map.get("sex"));
	}
}
