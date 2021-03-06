package com.epam.creational;

//Abstract Factory Pattern

public class CarFactory {
	
	private CarFactory() {
		
	  }
	 
	  public static Car buildCar(CarType type)
	  {
	    Car car = null;
	    Location location = Location.ASIA; 	    
	    switch(location)
	    {
	      case USA:
	        car = USACarFactory.buildCar(type);
	        break;
	      case ASIA:
	        car = AsiaCarFactory.buildCar(type);
	        break;
	      default:
	        car = DefaultCarFactory.buildCar(type);
	    }
	  return car;
	  }
	}

