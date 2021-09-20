/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Patrick Brookshire
 */

import java.util.Scanner;

public class Solution15 {

    public static void main(String[] agrs) {

        Scanner input = new Scanner(System.in);
        String password = " abc$123";
        String attempt;

        System.out.println("What is the password?");
        attempt = input.next();

        if(attempt.equals("abc$123")){

            System.out.println("Welcome!");

        }
        else{

            System.out.println("I don't know you.");

        }
    }
}
