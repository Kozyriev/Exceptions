package org.example;

import java.sql.Time;

public class ExceptionsPractice {
    public static void main(String[] args) {
        pause(300);
        arithmeticException(11, 0);

        
    }

    private static void arithmeticException(int divident, int diveder) {
        try {
            int res = divident/diveder;
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.getClass());
        }finally {
            System.out.println("finnaly");
        }

    }

    private static void pause(int time) {

        try {
            Thread.sleep(300);
        }catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("finnaly");
        }


    }
}
