package com.manirdev;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        double tax = 0.0;
        if (this.salary > 1000){
            tax = this.salary * 0.03;
            return tax;
        }
        return 0.0;
    }

    public double bonus(){
        int weekWorkHours = 40;
        double bonus = 0.0;
        if (this.workHours > weekWorkHours){
            int extraWorkHours = this.workHours - weekWorkHours;
            bonus = extraWorkHours * 30;
            return bonus;
        }
        return 0.0;
    }

    public double raiseSalary(){
        int year = 2021;
        int experienceYears = year - this.hireYear;
        double raisedSalary = 0.0;
        if (experienceYears < 10){
            raisedSalary =  this.salary * 0.05;
            return raisedSalary;
        }
        if (experienceYears < 20){
            raisedSalary = this.salary * 0.10;
            return raisedSalary;
        }
        else {
            raisedSalary = this.salary * 0.15;
            return raisedSalary;
        }
    }
    public double setSalaryAfterTaxandBonus(){
        return this.salary + bonus() - tax();
    }

    public double totalSalary(){
        return this.salary + raiseSalary();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "\nname='" + name + '\'' +
                "\nsalary= " + salary +
                "\nworkHours= " + workHours +
                "\nhireYear= " + hireYear +", " +
                "\nTax= " + tax() +
                "\nBonus= " + bonus() +
                "\nRaised Salary = " + raiseSalary() +
                "\nSalary after tax and bonus = " + setSalaryAfterTaxandBonus() +
                "\nTotal Salary = " + totalSalary() + "\n"+
                '}';
    }
}
