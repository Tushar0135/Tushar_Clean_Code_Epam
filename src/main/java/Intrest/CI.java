package Intrest;

public class CI extends Intrest {
    private double ci;
    public CI() {
        super();
        ci=0.0;
    }
    @Override
    public void setData(double principle,double rate,double timePeriod)
    {
        this.principle=principle;
        this.timePeriod=timePeriod;
        CI.setRate(rate);
    }
    public void calculateCI()
    {
        double amount=principle*Math.pow((1+rate/100),timePeriod);
        ci=amount-principle;
    }
    @Override
    public void displayResult() {
        CI.myout.print("Compound Interest : ");
        CI.myout.print(this.ci);
        CI.myout.print("\n");
    }
}
