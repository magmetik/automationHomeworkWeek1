package week1;

import java.util.Scanner;

public class WeeklySalaryCalculator {

    public static void main (String[] args){

        System.out.println("Please enter base salary");
        Scanner scanner = new Scanner(System.in);
        int baseSalary = scanner.nextInt();
        double weekdaySalary = 0;
        double weekendSalary = 0;
        double salary = 0;
        int bonusSalary = 500;

        if(baseSalary < 1000){
            System.out.println("Please enter at least 1000 euros for base salary");
        }
        else if(baseSalary >= 1000){
            System.out.println("Please enter total working hours on weekday");
            int totalWorkingHoursOnWeekday = scanner.nextInt();
            System.out.println("Please enter total working hours on weekend");
            int totalWorkingHoursOnWeekend =  scanner.nextInt();
            scanner.close();
            int workingHours = totalWorkingHoursOnWeekday + totalWorkingHoursOnWeekend;
            int priceForOneHour = baseSalary / 40;

            if(workingHours < 40){
                salary = baseSalary - (40-workingHours)*priceForOneHour;
                System.out.println(salary);
            }
            if(totalWorkingHoursOnWeekday > 40) {
                weekdaySalary = (totalWorkingHoursOnWeekday - 40) * priceForOneHour * 1.5;
            }
            if (totalWorkingHoursOnWeekend > 40) {
                weekendSalary = (totalWorkingHoursOnWeekend - 40) * priceForOneHour * 2;
            }
            if (totalWorkingHoursOnWeekday >= 40 && totalWorkingHoursOnWeekend > 10){
                salary = salary + bonusSalary;
            }

            if(totalWorkingHoursOnWeekday >=40 || totalWorkingHoursOnWeekend >= 40){
                salary = salary + baseSalary;
            }

            salary = salary + weekdaySalary + weekendSalary;

        }

        System.out.println("Your weekly salary is " + salary + " euros");

    }
}
