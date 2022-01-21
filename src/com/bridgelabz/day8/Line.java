package com.bridgelabz.day8;

import java.util.Scanner;



public class Line {

	public static int x1,x2,y1,y2,x3,x4,y3,y4;
	static double Length1,Length2;

	
	public void lengthvalue() {
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter thr value of Co Ordinate");
	System.out.println("Enter the value of (x1,y1)= ");
	          x1 = sc.nextInt();
	          y1 = sc.nextInt();
	System.out.println("Enter the value of (x2,y2)= ");
			 x2 = sc.nextInt();
			 y2 = sc.nextInt();

	System.out.println("Enter the values of (x3,y3)= ");
		    x3 = sc.nextInt();
		    y3 = sc.nextInt();
	System.out.println("Enter the value of (x4,y4)= ");
		    x4= sc.nextInt();
		    y4 = sc.nextInt();
	}
						
public void LengthCalculation() {			
	Double Length1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    System.out.println("Length of line1 "+"( "+x1+","+y1+"),"+"("+x2+","+y2+")" + Length1);
		

	Double Length2 = Math.sqrt((x4-x3)*(x4-x3) + (y4-y3)*(y4-y3));
    System.out.println("Length of line2 "+"( "+x3+","+y3+"),"+"("+x4+","+y4+")" + Length2);
}


public static void IfEqual() {
	if(Length1 == Length2) {
		System.out.println("Lines are equal");
	} else   { 
		System.out.println("Line 1 is not equal to line 2");
		
	}
}
public static void CheckRelation() {
	
	if(Length1 == Length2) {
		System.out.println("Lines are equal");
	} else if (Length1 > Length2) { 
		System.out.println("Line 1 is greater than line 2");
	}else {
		System.out.println("Line 1 is smaller than line 2");
	}
}

public static void main(String[] args) {
		Line input = new Line();
		input.lengthvalue();
		input.LengthCalculation();
		input.IfEqual();
		input.CheckRelation();
		
}
}


