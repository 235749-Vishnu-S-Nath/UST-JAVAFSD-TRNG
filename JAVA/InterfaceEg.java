package com.ust;

interface Vehicle{
	public abstract String getColour();
	public abstract String getEngineType();
	public static final int x=4;
}

abstract public class InterfaceEg implements Vehicle {
	public String getColour()
	{
		return "Green";
	}
/**	public String getEngineType() {
		return "Manual";
	}
	*/
}
