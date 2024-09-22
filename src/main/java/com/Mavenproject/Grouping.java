package com.Mavenproject;

import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

public class Grouping {

	@Test(groups = "VEG")

	private void curdRice() {
		System.out.println("CurdRice");
	}

	@Test(groups = "VEG")
	private void poori() {
		System.out.println("Poori");

	}

	@Test(groups = "NONVEG")
	private void briyani() {
		System.out.println("Briyani");
	}

	@Test(groups = "NONVEG")
	private void chicken65() {
		System.out.println("Chichen65");
	}

	@Test(groups = "NONVEG")
	private void fish() {
		System.out.println("Fish");

	}

	@Test(groups = "EC")
	private void mobile() {
		System.out.println("Mobile");
	}

	@Test(groups = "EC")
	private void laptop() {
		System.out.println("Laptop");
	}

	@Test(groups = "EC")
	private void watch() {
		System.out.println("Watch");

	}

}
