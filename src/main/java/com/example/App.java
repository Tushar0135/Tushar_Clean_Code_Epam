package com.example;

import java.util.Scanner;
public class App 
{
    static {
    int type;
    double area;

    Scanner scan=new Scanner(System.in);
    System.out.format("%s","Enter value For Construction type : \n");
    System.out.format("%s","1-Standard Type\n");
    System.out.format("%s","2-Above Standard Type\n");
    System.out.format("%s","3-High Standard Type\n");
    System.out.format("%s","41-High Standard Type + Automation \n");
    type=scan.nextInt();
    System.out.format("%s","Enter Area of House\n");
    area=scan.nextDouble();
    scan.close();

    Construction c=new Construction();
    c.setData(type, area);
    c.calculateTotalCost();
    c.displayResult();
}
    public static void main(String[] args) {

    }

}
