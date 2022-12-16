package com.nit.hk.threading;

public class Test02 {
	public static void main(String[] args) {
		System.out.println("main start");
		Thread th = new Thread();
		th.start();
		System.out.println("main end");
	}
}
