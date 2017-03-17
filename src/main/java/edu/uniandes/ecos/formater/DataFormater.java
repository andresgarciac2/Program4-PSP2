package edu.uniandes.ecos.formater;

import java.util.ArrayList;
import java.util.List;

import edu.uniandes.ecos.dto.ClassDto;

/**
 * @author andresgarcias4n
 * @since 17/03/2017
 * @version 0.0.1
 */
public class DataFormater {

	List<ClassDto> classes;
	
	/**
	 * Constructor
	 * 
	 * @param inputData
	 */
	public DataFormater(String inputData){
		classes = new ArrayList<ClassDto>();
		String[] parts = inputData.split(" ");
		for(String p : parts){
			String[] classParts = p.split(",");
			ClassDto classDto = new ClassDto(classParts[0],Integer.parseInt(classParts[1]),Integer.parseInt(classParts[2]));
			classes.add(classDto);
		}
	}

	/**
	 * @return the classes
	 */
	public List<ClassDto> getClasses() {
		return classes;
	}
	
	
}
