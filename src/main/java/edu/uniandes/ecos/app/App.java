package edu.uniandes.ecos.app;

import static spark.Spark.get;
import static spark.SparkBase.port;
import static spark.SparkBase.staticFileLocation;


import java.util.ArrayList;
import java.util.List;

import edu.uniandes.ecos.calculator.RangeCalculator;
import edu.uniandes.ecos.dto.ClassDto;
import edu.uniandes.ecos.formater.DataFormater;
import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

/**
 * @author andresgarcias4n
 * @since 17/03/2017
 * @version 0.0.1
 */
public class App 
{
    /**
     * Main, metodo principal
     * 
     * @param args
     */
    public static void main( String[] args )
    {
    	port(Integer.valueOf(System.getenv("PORT")));
        staticFileLocation("/public");

        
        //Entrada principal
        get("/", (req, res) -> {	

            return new ModelAndView(null, "index.ftl");

        }, new FreeMarkerEngine());
        
        //Obtener resultados con datos de entrada por url
        get("/results/:inputFile", (req, res) -> {	
          	DataFormater dataFormater = new DataFormater(req.params(":inputFile"));
            return new ModelAndView(RangeCalculator.calculateResults(dataFormater.getClasses()), "program_results.ftl");

        }, new FreeMarkerEngine());
    
        //Obtener resultados del test 1
        get("/resultsTest1", (req, res) -> {
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

              return new ModelAndView(RangeCalculator.calculateResults(list), "program_results.ftl");

          }, new FreeMarkerEngine());
        
        //Obtener resultados del test 2
        get("/resultsTest2", (req, res) -> {
            	List<ClassDto> list = new ArrayList<ClassDto>();
            	list.add(new ClassDto("each_char" ,7 ,1));
            	list.add(new ClassDto("string_read" ,12 ,1));
            	list.add(new ClassDto("single_character", 10, 1));
            	list.add(new ClassDto("each_line", 12 ,1));
            	list.add(new ClassDto("single_char", 10, 1));
            	list.add(new ClassDto("string_builder" ,12 ,1));
            	list.add(new ClassDto("string_manager", 12, 1));
            	list.add(new ClassDto("list_clump" ,12 ,1));
            	list.add(new ClassDto("list_clip" ,12, 1));
            	list.add(new ClassDto("string_decrementer", 8, 1));
            	list.add(new ClassDto("Char" ,8, 1));
            	list.add(new ClassDto("Character" ,8 ,1));
            	list.add(new ClassDto("Converter", 20 ,1));
            	list.add(new ClassDto("Converter", 14 ,1));
            	list.add(new ClassDto("Converter", 18 ,1));
            	list.add(new ClassDto("Converter", 12 ,1));

              return new ModelAndView(RangeCalculator.calculateResults(list), "program_results.ftl");

          }, new FreeMarkerEngine());
    }
}
