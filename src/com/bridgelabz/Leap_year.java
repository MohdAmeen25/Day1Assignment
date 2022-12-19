package com.bridgelabz;
import java.util.Scanner;
public class Leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter an Year - ");
        year = sc.nextInt();

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
//           year divisible by 4 and 400 =0
            System.out.println( year + " is a leap year");
        else
//           year divisible by 4 and 400 =0 and not divisiable by 100
            System.out.println( year + " is not a leap year");

    }
}
