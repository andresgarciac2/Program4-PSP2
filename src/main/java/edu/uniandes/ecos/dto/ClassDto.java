package edu.uniandes.ecos.dto;

/**
 * @author andresgarcias4n
 * @since 17/03/2017
 * @version 0.0.1
 */
public class ClassDto {

	/**
	 * Variables de paquete
	 */
	
	String className;
	int loc;
	int methods;
	double logDivMethod;
	double lnLogDivMethod;
	
	
	/**
	 * 
	 * constructor
	 * 
	 * @param className
	 * @param loc
	 * @param methods
	 */
	public ClassDto(String className, int loc, int methods) {
		super();
		this.className = className;
		this.loc = loc;
		this.methods = methods;
		this.logDivMethod = loc/methods;
		this.lnLogDivMethod = Math.log(loc/methods);
	}
	/**
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}
	/**
	 * @param className the className to set
	 */
	public void setClassName(String className) {
		this.className = className;
	}
	/**
	 * @return the loc
	 */
	public int getLoc() {
		return loc;
	}
	/**
	 * @param loc the loc to set
	 */
	public void setLoc(int loc) {
		this.loc = loc;
	}
	/**
	 * @return the methods
	 */
	public int getMethods() {
		return methods;
	}
	/**
	 * @param methods the methods to set
	 */
	public void setMethods(int methods) {
		this.methods = methods;
	}
	/**
	 * @return the logDivMethod
	 */
	public double getLogDivMethod() {
		return logDivMethod;
	}
	/**
	 * @param logDivMethod the logDivMethod to set
	 */
	public void setLogDivMethod(double logDivMethod) {
		this.logDivMethod = logDivMethod;
	}
	/**
	 * @return the lnLogDivMethod
	 */
	public double getLnLogDivMethod() {
		return lnLogDivMethod;
	}
	/**
	 * @param lnLogDivMethod the lnLogDivMethod to set
	 */
	public void setLnLogDivMethod(double lnLogDivMethod) {
		this.lnLogDivMethod = lnLogDivMethod;
	}
	
	
	
}
