import java.lang.*;
import java.util.Scanner;


public class HighLow {
    public static void main(String args[]) {
        game();

    }

        public static void game () {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Would you like to play a game?");
            String userInput = scanner.next();
            String name = scanner.next();
            if(userInput.equalsIgnoreCase("yes")) {
                System.out.print("What is your name?");
//                String name = scanner.next();//In here this is a local scope, in other words it is within the if statement only.
                System.out.println("Hello, " + name + " Pleased to meet you!");

            }else{
                System.out.print("Sorry you don't want to play, come back sometime" + name);
            }




        }

    }



















