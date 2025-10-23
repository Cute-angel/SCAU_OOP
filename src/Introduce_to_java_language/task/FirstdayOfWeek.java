package Introduce_to_java_language.task;

import utls.CourseTask;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstdayOfWeek implements CourseTask {
    int year;
    int first_week;
    boolean isLeap;
    int[] month_day;

    public FirstdayOfWeek(Scanner sc) {
        try {
            this.year = sc.nextInt();
            this.isLeap = isleapYear(year);
            this.first_week = sc.nextInt();
            this.month_day = new int[]{31, isLeap ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            if (first_week < 0 || first_week > 6 || year < 0) {
                System.out.println("不正确的输入");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers for year and first week day.");
            throw e;
        }

    }
    boolean isleapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    @Override
    public void solve(){
        System.out.print(first_week + " ");
        for( int i  = 0; i <11 ; i++){
            this.first_week = (this.month_day[i] + this.first_week) % 7;
            System.out.print(this.first_week + " ");
        }
    }
}
