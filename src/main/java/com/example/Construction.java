package com.example;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Construction {
    private int type;
    private double harea;
    private int typeCost;
    private double totalCost;
    static int getCostPerSqFeet(int typee)
    {
        int cost=0;
        switch(typee)
        {
            case 1:cost=1200;
                break;
            case 2:cost=1500;
                break;
            case 3:cost=1800;
                break;
            case 4:cost=2500;
                break;
            default:cost=0;
                break;
        }
        return cost;
    }
    public void setData(int typee,double area)
    {
        this.type=typee;
        this.harea=area;
    }

    public void calculateTotalCost() {
        this.typeCost=Construction.getCostPerSqFeet(type);
        this.totalCost=this.typeCost*harea;
    }
    public void displayResult()
    {
        PrintStream myout=new PrintStream(new FileOutputStream(FileDescriptor.out));
        myout.print("Total Cost of Construction : "+this.totalCost);
        myout.println();
        myout.close();
    }
}
