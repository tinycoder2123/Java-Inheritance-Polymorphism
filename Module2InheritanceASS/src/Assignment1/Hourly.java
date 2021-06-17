/**************************************************************
* Hourly.java
* Your Name Here
* This class handles payroll processing for an hourly employee.
**************************************************************/
package Assignment1;
import java.util.*;
public class Hourly extends Employee 
{
private int hourlyPay;
private int hoursWorkedPastWeek;
   public Hourly() 
   {
       Scanner input = new Scanner(System.in);
       System.out.println("Please Enter Hourly Pay of the Employee: ");
       this.hourlyPay = input.nextInt();
       System.out.println("Please Enter Hours Worked Past Week by the Employee: ");
       this.hoursWorkedPastWeek = input.nextInt();
   }
@Override
public double getEarnings() 
{
    int weeklyIncome = hourlyPay * hoursWorkedPastWeek;
    if (hoursWorkedPastWeek > 40) {
        return weeklyIncome * 1.5;
    }
    return weeklyIncome;
}
}