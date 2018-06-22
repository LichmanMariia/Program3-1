package org.itstep;

import static org.junit.Assert.*;

import org.junit.Test;

public class ModelTest {

	@Test
	public void testInputWordByScaner1() {
	
		Model model = new Model();
		String word = "Mariia";
		String result = model.inputWordByScaner1(word);
		assertEquals("Mariia", result);
		
	}

	@Test
	public void testInputWordByScaner11() {
	
		Model model = new Model();
		String word = "Mariia";
		String result = model.inputWordByScaner1(word);
		assertNotNull(result);
		
	}

	@Test
	public void testInputWordByScaner12() {
	
		Model model = new Model();
		String word = "Marina";
		String result = model.inputWordByScaner1(word);
		assertNull(result);
		
	}
	
	
	@Test
	public void testInputWordByScaner2() {
		
		Model model = new Model();
		int number = 3;
		int result = model.inputWordByScaner2(number);
		assertEquals(3, result);
		
	}
	
	@Test
	public void testInputWordByScaner21() {
		
		Model model = new Model();
		int number = 3;
		int result = model.inputWordByScaner2(number);
		assertNotNull(result);
		
	}
	
	@Test
	public void testInputWordByScaner23() { //      
		
		Model model = new Model();
		int number = 2;
		int result = model.inputWordByScaner2(number);
		assertEquals(0, result);
		
	}

	@Test
	public void testInputWordByScaner24() { //      
		
		Model model = new Model();
		int number = 4;
		int result = model.inputWordByScaner2(number);
		assertEquals(0, result);
		
	}
		@Test
	public void testWriteSentence() {
		
		Model model = new Model();
		String word = "Mariia";
		int number = 3;
		String result = model.writeSentence(word, number);
		assertEquals("Mariia " + 3, result);
	}

}