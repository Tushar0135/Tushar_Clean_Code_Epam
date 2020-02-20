package Intrest;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public abstract class Intrest {
    double principle;
    static double rate;
    double timePeriod;
    static PrintStream myout;
    public Intrest()
    {
        Intrest.myout= new PrintStream(new FileOutputStream(FileDescriptor.out));
    }
    static void setRate(double rate)
    {
        Intrest.rate=rate;
    }
    void setData(double principle,double rate,double timePeriod){}
    void displayResult(){}
}
