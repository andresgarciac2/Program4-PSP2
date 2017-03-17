package edu.uniandes.ecos.calculator;

import java.util.List;
import java.util.Map;

import edu.uniandes.ecos.dto.ClassDto;

/**
 * @author andresgarcias4n
 * @since 17/03/2017
 * @version 0.0.1
 */
public class RangeCalculator {

	public static Map<String,String> calculateResults(List<ClassDto> classes){
		
		double avg = 0;
		double var = 0;
		double sumLn = 0;
		double sumLnMinusAvgSqr = 0;
		double deviation = 0;
		for(ClassDto cl : classes)sumLn += cl.getLnLogDivMethod();
		for(ClassDto cl : classes)sumLnMinusAvgSqr += Math.pow(cl.getLnLogDivMethod() - avg, 2);
		
		avg = sumLn/classes.size();
		var = sumLnMinusAvgSqr/(classes.size()-1);
		
		System.out.println(avg);
		System.out.println(var);
		
		return null;
	}
	
	
}
