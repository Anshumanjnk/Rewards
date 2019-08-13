package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Rewards {


    public static int calculateReward(int a)
    {
        if(a<100 && a>=50)
            return (a-50);
        else
        {
            return (2 * (a-100) + 50);
        }
    }

    public static void main(String args[])
    {
        try {
            File f = new File("inp.txt");
            Scanner sc = new Scanner(f);
            ArrayList<Customer> cust=new ArrayList<Customer>();

            String name=sc.nextLine();

            Customer c=new Customer(0, 0,0 ,name);
            sc.nextLine();
            while(sc.hasNextLine()){
                int i=0;
                String line = sc.nextLine();
                String[] details = line.split(" ");

                    String date = details[0];
                    int price = Integer.parseInt(details[1]);
                    if(date.matches("May(.*)"))
                    {
                        c.month1 += calculateReward(price);
                    }
                    else if(date.matches("June(.*)"))
                    {
                        c.month2 +=calculateReward(price);
                    }
                    else
                    {
                        c.month3 +=calculateReward(price);
                    }
            }
           c.displayResult(c);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
