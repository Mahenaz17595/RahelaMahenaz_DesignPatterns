package com.epam.structural;

//Proxy Design Pattern 

public class RealObjectProxy extends RealObjectImpl 
{
    @Override
    public void doSomething() 
    {
        //Perform additional logic and security
        //Even we can block the operation execution
        System.out.println("Delegating work on real object");
        super.doSomething();
    }
}