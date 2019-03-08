
/**
 * Write a description of class UnionEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UnionEmployee extends Employee
{
    private double dues;
    
    public UnionEmployee(String n, String d, double p, double du)
    {
        super(n,d,p);
        dues = du;
    }
    
    public void setDues(double du)
    {
        dues = du;
    }
    public double getDues()
    {
        return dues;
    }
    
    public double getWeeklyPay(int h)
    {
        double weekly = 0;
        if(h>40)
        {
            weekly = weekly + super.getWeeklyPay(40);
            weekly = weekly + (super.getWeeklyPay((h-40)) *1.5);
        }
        else
            weekly = weekly + super.getWeeklyPay(h);
        return weekly - dues;
    }
    
    public String toString()
    {
        return super.toString() + " Dues: " + dues;
    }
}
