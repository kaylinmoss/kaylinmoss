public class EmployeeTester
{
    public static void main(String[]args)
    {
        UnionEmployee sam = new UnionEmployee("Sam", "IT", 35.00, 10.00);
        System.out.println(sam);
        System.out.println();
        System.out.println("Weekly pay: $" + sam.getWeeklyPay(35));
        System.out.println("Weekly pay with overtime: $" + sam.getWeeklyPay(48));
        System.out.println();
        
        CommissionEmployee tina = new CommissionEmployee("Tina", "Sales", 14.00, .03, 7500);
        System.out.println(tina);
        System.out.println();
        System.out.println("Weekly pay: $" + tina.getWeeklyPay(32));
        System.out.println("Weekly pay: $" + tina.getWeeklyPay(44));
        
       
    }
}
