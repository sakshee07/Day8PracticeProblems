package com.bridgelabz.day8;


public class EmployeeWageComputation {


static int WagePerHour = 20;
static int WorkingHour = 8;
static int WorkingDays = 20;
private static final int IsPartTime = 0;
private static final int MonthWorkingDays = 0;
static final int IsFullTime = 1;
static int empRatePerHour =20;
static int empHrs = 8;
static int empWage = 0;



public static void PresenceOfEmployee() {
double empCheck = Math.floor(Math.random()*10)%2;
		
		if (empCheck == IsFullTime) {
		System.out.println("Employee is present");
		} else {
			System.out.println("Employee us not present");

   }
}
//   for dailywage
public static void DailyWage() {


	double empCheck = Math.floor(Math.random()*10)%2;
	
	if (empCheck == IsFullTime)
		empHrs = 8;
	else
		empHrs = 0;
	empWage = empHrs* empRatePerHour;


	System.out.println("Employee Daily Wage is :" + empWage);
}
	
// for monthly 
public void MonthlyWage() {
	

	int WagePerHour = 20;
	int WorkingHour = 8;
	int WorkingDays = 20;

	int MonthlyWage = WorkingHour*WorkingDays*WagePerHour;
	
	System.out.println("Employee Monthly wage is : " + MonthlyWage);
}

/// part time or full time by switch case
public void Condition() {
	  int WorkingHour = 8;
			int empcheck = (int)((Math.random())*10)%3;
			switch (empcheck)
			{
				case IsFullTime:
				WorkingHour = 8;
				System.out.println("Employee is Present-full time");
				break;
				case IsPartTime:
				WorkingHour = 4;
				System.out.println("Employee is Present-part time");
				break;
				default:
				WorkingHour = 0;
				System.out.println("Employee is Absent");
				break;
			}
			int empwage = WorkingHour * WagePerHour * MonthWorkingDays;
			System.out.println("Employee Wage : "+empwage);
		
}


public static void main(String[ ] args) {
	EmployeeWageComputation employee = new EmployeeWageComputation();
	employee.PresenceOfEmployee();
	employee.DailyWage();
	employee.MonthlyWage();
	employee.Condition();
	
	
}
}
	
		
