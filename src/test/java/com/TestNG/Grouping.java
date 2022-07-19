package com.TestNG;

import org.testng.annotations.Test;

public class Grouping {

	@Test(groups = "Sports")
	private void Chess() {
		System.out.println("Chess");
	}
	@Test(groups = "Sports")
	private void carrom() {
		System.out.println("Carrom");
	}
	@Test(groups = "Sports")
	private void cricket() {
		System.out.println("Cricket");
	}
	@Test(groups = "Sports")
	private void volleyBall() {
		System.out.println("volleyBall");
	}
	@Test(groups = "Social")
	private void Whatsapp() {
		System.out.println("Whatsapp");
	}
	@Test(groups = "Social")
	private void TikTok() {
		System.out.println("TikTok");
	}
	@Test(groups = "Social")
	private void Instagram() {
		System.out.println("Instagram");
	}
	@Test(groups = "Social")
	private void FaceBook() {
		System.out.println("FaceBook");
	}
	@Test(groups = "Greatest Books")
	private void Book1() {
		System.out.println("In Search of Lost Time by Marcel Proust");
	}
	@Test(groups = "Greatest Books")
	private void Book2() {
		System.out.println("Ulysses by James Joyce");
	}
	@Test(groups = "Greatest Books")
	private void Book3() {
		System.out.println("Don Quixote by Miguel de Cervantes");
	}
	@Test(groups = "Greatest Books")
	private void Book4() {
		System.out.println("War and Peace by Leo Tolstoy");
	}
	@Test(groups = "Courses")
	private void Degree1() {
		System.out.println("BCA");
	}
	@Test(groups = "Courses")
	private void Degree2() {
		System.out.println("BSC.Cs");
	}
	@Test(groups = "Courses")
	private void Degree3() {
		System.out.println("BIO-Tecch");
	}
	@Test(groups = "Courses")
	private void Degree4() {
		System.out.println("BBA");
	}
	
	
}
