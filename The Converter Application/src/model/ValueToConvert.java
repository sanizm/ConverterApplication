package model;

/**
 * This is the class that is responsible for the conversion of the value given by the user
 * it has 4 methods that help in converting the values in feet and meter respectively.
 * @class ValueToConvert
 *
 */

public class ValueToConvert {
	
	private double inFeet;
	private double inMeter;
	private double inCentimeter;

    public ValueToConvert(double inCentimeter) {
    	this.inCentimeter = inCentimeter;
    	this.inFeet = 0;
    	this.inMeter = 0;
    	ConvertToFeet();
    	ConvertToMeter();
    }
    
    /**
     * This is a helper method that is used to convert the value in centimeter to feet
     */
    
    private void ConvertToFeet() {
    	this.inFeet = this.inCentimeter/30.48;
    }
    
    /**
     * this is  a helper method that is used to convert the value in centimeter to meter.
     */
    
    private void ConvertToMeter() {
    	this.inMeter = this.inCentimeter/100;
    }
    
    /**
     * this is the getter method for returning the feet value
     * @return double inFeet
     */
    
    public double getinFeet() {
    	return this.inFeet;
    }
    
    /**
     * this is the getter method for returning the Meter value
     * @return double inMeter
     */
    
    public double getinMeter() {
    	return this.inMeter;
    }
   
}
