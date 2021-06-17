/*************************************************************
* Salaried.java
* Dean & Dean
* This class handles payroll processing for salaried employee.
*************************************************************/
package Assignment1;
import java.util.*;

public class Salaried extends Employee 
{
private int weeklySalary;
   public Salaried() 
   {
       Scanner input = new Scanner(System.in);
       System.out.println("Please Enter Salary of the Salaried Employee: ");
       this.weeklySalary = input.nextInt();
   }
@Override
   public double getEarnings() 
{
       return weeklySalary;
   }
}

