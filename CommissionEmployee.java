
/**
 * Write a description of class CommissionEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CommissionEmployee extends Employee
{
    private double rate, sales;
    
    public CommissionEmployee(String n, String d, double p, double r,double s)
    {
        super(n,d,p); rate = r; sales = s;
    }
    
    //setters
    public void setRate(double r)
    {
        rate = r;
    }
    public void setSales(double s)
    {
        sales = s;
    }
    
    //getters
    public double getRate()
    {
        return rate;
    }
    public double getSales()
    {
        return sales;
    }
     public double getWeeklyPay(int h)
    {
        double weekly = 0;
        if(h<40)
            weekly = (h * this.getPay()) + (rate * sales);
        else
            weekly = (40 * this.getPay()) + (rate * sales);
        return weekly;
    }
    
    public String toString()
    {
        return super.toString() + " Rate: " + rate + " Sales: " + sales;
    }
}
