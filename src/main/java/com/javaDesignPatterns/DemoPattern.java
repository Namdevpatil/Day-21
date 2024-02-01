package com.javaDesignPatterns;

public class DemoPattern 
{
	//private member
	private static DemoPattern demoPattern = new DemoPattern("com.mysql.cj.jdbc.Driver");
	
	
	//private constructor
	private DemoPattern(String driver)
	{
		
	}
	
	//static factory method
	public static DemoPattern getDemoPattern()
	{
		return demoPattern;
	}	
	
}
