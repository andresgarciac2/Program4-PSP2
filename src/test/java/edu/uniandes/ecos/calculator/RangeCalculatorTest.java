package edu.uniandes.ecos.calculator;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import edu.uniandes.ecos.dto.ClassDto;

public class RangeCalculatorTest {
	
	RangeCalculator rangeCalculator = new RangeCalculator();
	
	@Test
	public void calculateRangeCalculatorTest1() {	 
		Map<String,String> results = rangeCalculator.calculateResults(getClassesTest1());

		assertTrue(results.get("VS").equals("4.309819041171236"));
		assertTrue(results.get("S").equals("8.353055620740305"));
		assertTrue(results.get("M").equals("16.18943569013969"));
		assertTrue(results.get("L").equals("31.377479076565734"));
		assertTrue(results.get("VL").equals("60.81411434247622"));
		
	}
	
	@Test
	public void calculateRangeCalculatorTest2() {	 
		Map<String,String> results = rangeCalculator.calculateResults(getClassesTest2());

		assertTrue(results.get("VS").equals("6.3375179612117245"));
		assertTrue(results.get("S").equals("8.43928111212605"));
		assertTrue(results.get("M").equals("11.23806924499352"));
		assertTrue(results.get("L").equals("14.965042481379408"));
		assertTrue(results.get("VL").equals("19.92802247318948"));		
	}
	
	public List<ClassDto> getClassesTest1(){
    	List<ClassDto> list = new ArrayList<ClassDto>();
    	list.add(new ClassDto("each_char" ,18 ,3));
    	list.add(new ClassDto("string_read" ,18 ,3));
    	list.add(new ClassDto("single_character", 25, 3));
    	list.add(new ClassDto("each_line", 31 ,3));
    	list.add(new ClassDto("single_char", 37, 3));
    	list.add(new ClassDto("string_builder" ,82 ,5));
    	list.add(new ClassDto("string_manager", 82, 4));
    	list.add(new ClassDto("list_clump" ,87 ,4));
    	list.add(new ClassDto("list_clip" ,89, 4));
    	list.add(new ClassDto("string_decrementer", 230, 10));
    	list.add(new ClassDto("Char" ,85, 3));
    	list.add(new ClassDto("Character" ,87 ,3));
    	list.add(new ClassDto("Converter", 558 ,10));
    	return list;
	}
	
	public List<ClassDto> getClassesTest2(){
    	List<ClassDto> list = new ArrayList<ClassDto>();
    	list.add(new ClassDto("" ,7 ,1));
    	list.add(new ClassDto("" ,12 ,1));
    	list.add(new ClassDto("", 10, 1));
    	list.add(new ClassDto("", 12 ,1));
    	list.add(new ClassDto("", 10, 1));
    	list.add(new ClassDto("" ,12 ,1));
    	list.add(new ClassDto("", 12, 1));
    	list.add(new ClassDto("" ,12 ,1));
    	list.add(new ClassDto("" ,12, 1));
    	list.add(new ClassDto("", 8, 1));
    	list.add(new ClassDto("" ,8, 1));
    	list.add(new ClassDto("" ,8 ,1));
    	list.add(new ClassDto("", 20 ,1));
    	list.add(new ClassDto("", 14 ,1));
    	list.add(new ClassDto("", 18 ,1));
    	list.add(new ClassDto("", 12 ,1));
    	return list;
	}
}
