/***********************************************************
* SalariedPlusCommission.java
* Your Name Here
* This class handles payroll processing for an employee that
* works on sales commission and also receives a base salary.
***********************************************************/
package Assignment1;
import java.util.*;
public class SalariedPlusCommission extends Salaried 
{
private int salesDuringPastWeek;
private double commissionRate;
   public SalariedPlusCommission() 
   {
       Scanner input = new Scanner(System.in);
       System.out.println("Please Enter Sales During Past Week of Salaried Employee: ");
       this.salesDuringPastWeek = input.nextInt();
       System.out.println("Please Enter Commission Rate of Salaried Employee: ");
       this.commissionRate = input.nextDouble();
   }
@Override
   public double getEarnings() 
{
       return super.getEarnings() + salesDuringPastWeek * commissionRate;
   }
}