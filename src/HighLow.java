import java.lang.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class HighLow {
   Integer playerPoints;
   Integer bugPoints;
   String responsePlayer;
   String responseBug;






    public static void main(String[] args) {
        //Ask if the user is ready to start. If they type in "yes", start the game
         playerPoints = 200;
         bugPoints = 300;
        if(playerPoints > bugPoints && (playerPoints - bugPoints) >= 2) {
            return bugPoints;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name?\n");

        String name = scanner.next();//In here this is a local scope, in other words it is within the if statement only.

        System.out.println("Hello, " + name + " Pleased to meet you!");

        System.out.printf("Would you like to play a game?\n");

        String userInput = scanner.next();


        if (userInput.equalsIgnoreCase("yes")) {

            System.out.print("Your Weapon is a function blaster with 2 bullet types code and hack");
            System.out.println("You are at the planet of the code");
            System.out.println("What do you want to do?");
            System.out.println("a: Talk to the computer");
            System.out.println("b: Attack the computer");
            System.out.println(": Leave");
            String youDecide = scanner.next();


        }
    }
}























