package model;

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
    
    private void ConvertToFeet() {
    	this.inFeet = this.inCentimeter/30.48;
    }
    
    private void ConvertToMeter() {
    	this.inMeter = this.inCentimeter/100;
    }
    
    public double getinFeet() {
    	return this.inFeet;
    }
    
    public double getinMeter() {
    	return this.inMeter;
    }
   
}
