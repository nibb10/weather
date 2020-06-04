#pragma once

["java:package:com.zeroc.demos.IceStorm.clock"]

module Weather{

struct Measurement
	{	
    	string tower; // tower id
    	float windSpeed; // knots
    	short windDirection; // degrees
    	float temperature; // degrees Celsius
	}
 
interface Monitor
	{
    	void report(Measurement m);
	}

}