package edu.uniandes.ecos.formater;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DataFormaterTest {

	@Test
	public void DataFormaterTestSize(){
		DataFormater formater = new DataFormater("Class1,5,5 Class2,3,5 Class5,8,9");
		assertTrue(formater.getClasses().size() == 3);
	}
	
	@Test
	public void DataFormaterTestNotNull(){
		DataFormater formater = new DataFormater("Class1,5,5 Class2,3,5 Class5,8,9");
		assertTrue(formater.getClasses() != null);
	}
	
}
