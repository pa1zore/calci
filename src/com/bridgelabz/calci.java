package com.bridgelabz;

import java.util.Scanner;

public class calci {
    public static void main(String[] args) {
        System.out.println("welcome to calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two number  for addition"); //printing message on console to
        int num1=sc.nextInt();//reading number from console
        int num2=sc.nextInt();//reading second number from console
        //performing addition here
        int sum=num1+num2;
        System.out.println("addition of two numbers is "+sum);
        //performing substraction
        int sub=num1-num2;
        System.out.println("substraction of two numbers is "sub);
    }
}
