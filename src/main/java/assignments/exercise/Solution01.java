package assignments.exercise;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Deaja Murphy
 */


/*
 * Create String to store Name
 * Print Statement asking for name
 * Take user input into String name
 * Print final output with the name of the User
 */
import java.util.Scanner;
public class Solution01 {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.println("What's your name? ");

        String name = userIn.nextLine();
        System.out.println("Hello, " +name +", nice to meet you!");
    }
}