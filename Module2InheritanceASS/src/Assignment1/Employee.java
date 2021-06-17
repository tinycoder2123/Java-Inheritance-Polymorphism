/*************************************************************
* Employee.java
* Your Name Here
* This class handles payroll processing for an employee.
*************************************************************/
package Assignment1;
import java.util.*;
public abstract class Employee 
{
   private String name;
   private String socialSecurityNumber;
   private int birthdayMonth;
   private int birthdayWeek;
   public Employee() 
   {
      Scanner stdIn = new Scanner(System.in);
       System.out.println("Please Enter Name of the Employee: ");
       this.name = stdIn.nextLine();
       System.out.println("Please Enter Social Security of the Employee: ");
       this.socialSecurityNumber = stdIn.nextLine();
       System.out.println("Please Enter Birthday Month of the Employee(1 - 12): ");
       this.birthdayMonth = stdIn.nextInt();
       System.out.println("Please Enter Birthday Week of the Employee(1 - 4): ");
       this.birthdayWeek = stdIn.nextInt();
   }
@Override
 public String toString() 
{
     return "PAYCHECK REPORT: \n" + "employee: " + name + "\n"
             + "social security number: " + socialSecurityNumber + "\n"
             + "paycheck: " + (getEarnings() + getBonus()) + "\n";
 }
public abstract double getEarnings();
 public int getBonus() {
     Calendar cal = Calendar.getInstance();
     Date date = new Date();
     cal.setTime(date);
     int getCurrentMonth = cal.get(Calendar.MONTH);
     // As per assumption
     getCurrentMonth = 10;
     int getCurrentWeek = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);
     // As per assumption
     getCurrentWeek = 2;
     if (getCurrentMonth == birthdayMonth && getCurrentWeek == birthdayWeek)
         return 100;
     return 0;
 }
}

