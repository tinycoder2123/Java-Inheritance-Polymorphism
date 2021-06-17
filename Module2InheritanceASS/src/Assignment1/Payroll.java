/************************************************
 * PayrollDriver.java
 * This drives Employee and its subclasses to calculate
 * a payroll.
 *************************************************/
package Assignment1;
import java.util.*;
public class Payroll 
{
   public static void main(String arg[]) 
   {
       Scanner input = new Scanner(System.in);
       System.out.println("Please Enter the number of Employees: ");
       int numOfEmployees = input.nextInt();
       for (int employeeCount = 0; employeeCount < numOfEmployees; employeeCount++) 
       {
           System.out.println("PROFILE FOR EMPLOYEE #" + (employeeCount + 1));
           System.out.println("type Hourly(1), Salaried(2), Salaried plus Commission(3)");
           System.out.print("Enter 1, 2, or 3 ==> ");
           int employeeType = input.nextInt();
           switch (employeeType) {
           case 1:
               Hourly hourlyEmployee = new Hourly();
               System.out.println(hourlyEmployee);
               break;
           case 2:
               Salaried salariedEmployee = new Salaried();
               System.out.println(salariedEmployee);
               break;
           case 3:
               SalariedPlusCommission salariedPlusCommissionEmployee = new SalariedPlusCommission();
               System.out.println(salariedPlusCommissionEmployee);
               break;
           default:
               System.out.println("JUNK VALUE TRY 1 or 2 or 3");
               break;
           }
       }
   }
}