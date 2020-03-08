package com.epam.structural;

//Component Design Pattern

public class Client 
{
    public static void main(String[] args) 
    {
        // Creating a component tree
        Component component = new CompositeAccount();
 
        // Adding all accounts of a customer to component
        component.add(new DepositAccount("DA001", 200));
        component.add(new DepositAccount("DA002", 100));
        component.add(new SavingsAccount("SA001", 250));
 
        // getting composite balance for the customer
        float totalBalance = component.getBalance();
        System.out.println("Total Balance : " + totalBalance);
         
        AccountStatement mergedStatement = component.getStatement();
        //System.out.println("Merged Statement : " + mergedStatement);
    }
}
 