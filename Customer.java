package com.example;

public class Customer {
    int month1, month2, month3;
    String name;
    int total;

    public Customer(int month1, int month2, int month3, String name) {
        this.month1 = month1;
        this.month2 = month2;
        this.month3 = month3;
        this.name = name;
    }

    public void displayResult(Customer cust)
    {
        System.out.println(cust.month1+" "+cust.month2+" "+cust.month3);
    }


}
