
/**
 * 
 */
public class CommissionEmployeeClient
{
    public static void main(String args[])
    {
        //tests Employee methods
        Employee poe = new Employee("Poe","death",10);
        System.out.println(poe);
        poe.setName("Edgar"); poe.setDepartment("ghost"); poe.setPay(10.5);
        System.out.println("Poe's new name: " + poe.getName());
        System.out.println("Poe's new department: " + poe.getDepartment());
        System.out.println("Poe's new pay: " + poe.getPay());
        System.out.println("Poe's weekly pay: " + poe.getWeeklyPay(2));
        
        //tests UnionEmployee methods
        UnionEmployee twain = new UnionEmployee("Twain","adventure",8.25,10);
        System.out.println(twain);
        twain.setDues(2); 
        System.out.println("Twain's new dues: " + twain.getDues());
        System.out.println("Twain's weekly pay: " + twain.getWeeklyPay(41));
        
        //tests CommissionEmployee methods
        CommissionEmployee bronte = new CommissionEmployee("Bronte","independence",20,5,10);
        System.out.println(bronte);
        bronte.setRate(4); bronte.setSales(9); 
        System.out.println("Bronte's new rate: " + bronte.getRate());
        System.out.println("Bronte's sales:" + bronte.getSales());
        System.out.println("Bronte's weekly pay: " + bronte.getWeeklyPay(40));
        
        
        
        
       
        
        
    }
}
