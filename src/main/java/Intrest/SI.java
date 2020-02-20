package Intrest;

public class SI extends Intrest{
    private double si;
    public SI() {
        super();
        si=0.0;
    }
    @Override
    public void setData(double principle,double rate,double timePeriod)
    {
        this.principle=principle;
        this.timePeriod=timePeriod;
        SI.setRate(rate);
    }
    public void calculateSI()
    {
        si=principle*rate*timePeriod/100;
    }
    @Override
    public void displayResult() {
        SI.myout.print("Simple Interest : ");
        SI.myout.print(this.si);
        SI.myout.print("\n");
    }
}
