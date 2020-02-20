package Intrest;

public class App {
    static {
        SI si=new SI();
        si.setData(1000, 10, 2);
        si.calculateSI();
        si.displayResult();
        CI ci=new CI();
        ci.setData(10000, 10, 2);
        ci.calculateCI();
        ci.displayResult();
    }
    public static void main( String[] args )
    {
        //Declared but not used
    }
}
