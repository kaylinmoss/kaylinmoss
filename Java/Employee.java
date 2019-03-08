
/**
 * 
 */
public class Employee
{
    private String name, department;
    private double pay;
    
    public Employee(String n, String d, double p)
    {
        name = n; department = d; pay = p;
    }
    
    //setters
    public void setName(String n)
    {
        name = n;
    }
    public void setDepartment(String d)
    {
        department = d;
    }
    public void setPay(double p)
    {
        pay = p;
    }
    
    //getters
    public String getName()
    {
        return name;
    }
    public String getDepartment()
    {
        return department;
    }
    public double getPay()
    {
        return pay;
    }
    public double getWeeklyPay(int h)
    {
        double weekly = 0;
        if(h<40)
            weekly = h *pay;
        else
            weekly = 40 * pay;
        return weekly;
    }
    
    public String toString()
    {
        return "\nName: " + name + " Department: " + department + " Pay: " + pay;
    }
    
}
