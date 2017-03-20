package edu.uniandes.ecos.calculator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.uniandes.ecos.dto.ClassDto;

/**
 * @author andresgarcias4n
 * @since 17/03/2017
 * @version 0.0.1
 */
public class RangeCalculator {

	/**
	 * Calcula los rangos para los datos ingresados
	 * 
	 * @param classes
	 * @return
	 */
	public static Map<String,String> calculateResults(List<ClassDto> classes){
		
		Map<String,String> results = new HashMap<String,String>();
		double avg = 0;
		double var = 0;
		double sumLn = 0;
		double sumLnMinusAvgSqr = 0;
		double deviation = 0;
		double ranges[] = new double[5];
		for(ClassDto cl : classes)sumLn += cl.getLnLogDivMethod();
		avg = sumLn/classes.size();
		for(ClassDto cl : classes)sumLnMinusAvgSqr += Math.pow(cl.getLnLogDivMethod() - avg, 2);
		var = sumLnMinusAvgSqr/(classes.size()-1);
		deviation = Math.sqrt(var);
		
		ranges[0] = Math.exp(avg - (2*deviation));
		ranges[1] = Math.exp(avg - (deviation));
		ranges[2] = Math.exp(avg);
		ranges[3] = Math.exp(avg + (deviation));
		ranges[4] = Math.exp(avg + (2*deviation));
		
		results.put("VS", String.valueOf(ranges[0]));
		results.put("S", String.valueOf(ranges[1]));
		results.put("M", String.valueOf(ranges[2]));
		results.put("L", String.valueOf(ranges[3]));
		results.put("VL", String.valueOf(ranges[4]));
		
		return results;
	}
}
