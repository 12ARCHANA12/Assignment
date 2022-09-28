package com.src;
import java.util.Scanner;

public class Assignment {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter first number");
	int num1=sc.nextInt();
	
	System.out.println("Enter the second number");
	int num2=sc.nextInt();
	
// adding and assigning value
	num1 += num2;
	System.out.println("num1="+num1);
	//subtracting and assigning value
num2 -= num1;
System.out.println("num2="+num2);


//multiplying and assigning value
    num2 *= num1;
System.out.println("num2="+num2);

//Dividing and assigning value
num2 /= num1;
System.out.println("num2="+num2);

//modulation and assigning value
num2 %= num1;
System.out.println("num2="+num1);



}


}