package com.project.dragoncave;

import java.util.Scanner;


public class DragonCave {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String playerName = sc.nextLine();
        System.out.println("Hello " + playerName + "!");

        System.out.println( playerName + "," + "you are in a land full of dragons. In front of you, you see two caves.");
        System.out.println("In one cave, the dragon is friendly and will share his treasure with you.");
        System.out.println("The other dragon is greedy and hungry and will eat you on sight.");

        Scanner pc = new Scanner(System.in);
        System.out.println("Enter your choice.");
        int playerChoice = pc.nextInt();
        System.out.println("You have chosen " + playerChoice);
        String dragonName;
        dragonName = "Eugene";

        if(playerChoice == 1){

            System.out.println("You approach the cave... ");
            System.out.println("It is dark and spooky...");
            System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
            System.out.println("Gobbles you down in one bite!");
        }
        else if(playerChoice == 2){
            System.out.println("You approach the cave...");
            System.out.println("It is dark and spooky...");
            System.out.println("A large dragon jumps out from the shadows! He opens his jaws and...");
            System.out.println("Hi " + playerName + "," + " I am " + dragonName +".");
            System.out.println("Please come in and help yourself to some of my treasure.");
    }

    }
}
