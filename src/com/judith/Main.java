package com.judith;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
	    System.out.println("****************************************************************");
        System.out.println("************************* NUMBER GUESSING **********************");
        System.out.println("****************************************************************");

        System.out.print("Please enter your name here: ");
        String name = scanner.nextLine();

        int generated = rand.nextInt(100); // 0 - 99
        generated = generated + 1;               // 1 - 100

        for(int i = 0; i < 7; i++){
            int tries = i + 1;
            System.out.println("Try number(" + tries + "/7) - Guess the generated number: ");
            int guess = scanner.nextInt();

            if (generated == guess) {
                System.out.println(name + " Has won!");
                break;
            }
            else if(guess > generated) {
                System.out.println("You Have failed! Please try again a lower number...");
            }
            else {
                System.out.println("You Have failed! Please try again a higher number...");
            }
        }
    }
}
