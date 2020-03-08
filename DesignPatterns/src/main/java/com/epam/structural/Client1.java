package com.epam.structural;

//Proxy Design Pattern 

public class Client1 {
	    public static void main(String[] args) 
	    {
	        RealObject proxy = new RealObjectProxy();
	        proxy.doSomething();
	    }
	}

