package com.pf.demo;

public class Test {

	public static void main(String[] args) {
		Test.mainBranch();
		Branch1Test b1 = new Branch1Test();
		b1.testBranch1();
	}
	
	public static void mainBranch() {
		System.out.println("主分支添加...");
	}
}
