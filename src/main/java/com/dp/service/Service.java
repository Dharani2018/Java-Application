package com.dp.service;

public class Service {
	
	public int add(int x, int y) {
		return x+y;
	}

	public static void main(String[] args) {
		Service s = new Service();
		System.out.println(s.add(15, 20));
	}
}
