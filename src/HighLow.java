import java.lang.*;
import java.util.Scanner;//gives access to the code library and allows the data to be put in from the keyboard and should be near the top of the file.
import java.lang.reflect.Array;
import java.util.ArrayList;



public class HighLow {

    //For the sake of time I'm going to leave everything in main.Will work tomorrow on methods.
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);/*“Scanner keyboard = new Scanner(System.in);” creates a
        Scanner object that takes System.in as a parameter setting the variable of keyboard with the keyboard variable now we can use the other methods that are available in the scanner class.*/

        String Go, Blast, Test, Answer, Pantry, Eat;//Here a string of array (String []) which lies within the parameters.
        int playerHP = 300;
        int alienPoints = 400;
        System.out.println(" Welcome to the Europa ADVENTURE");//This is simply a print that is a string
        System.out.println("  ");//A line between lines printed when code is run.
        System.out.println("There are couple of things you need to know first your health is set at " + playerHP + " your nemesis alien bug is set at " + alienPoints + ".");//String plus int variables concat.
        System.out.println("  ");//A line between lines printed when code is run.
        System.out.println(" You have been exploring around Europa a few days now, you are in a cave hanging from a zipLine, Would you like to go 'further up' or 'down'? ");
        System.out.print("> ");
        Go = keyboard.next();
        //the code above is assigning the String Go from the array
        if (Go.equalsIgnoreCase("down")) {//here go equals down see 'down' equalsIgnoreCase

            System.out.println("There are alien bugs everywhere. They are headed to the main server, you may try to kill them off with 'blaster' or look in the 'secret chest'. ");
            System.out.print(">  ");
            Blast = keyboard.next();
            if (Blast.equalsIgnoreCase("blaster")) {
                System.out.print(" Please enter a javascript function that adds numbers x and y and returns the sum can you perform attack 'yes' or 'no'.");
                Test = keyboard.next();
                if (Test.equalsIgnoreCase("yes"))


                    System.out.print("Enter a javascript function named addition takes in x, y, and returns the sum: do this also for multiplication, division, subtraction, cubed. Start with addition\n");

                    Scanner sc = new Scanner(System.in);
                    String domain = sc.nextLine();

                    domain = domain.trim().toLowerCase();

                    switch (domain) {

                        case "function addition(x, y){ return x + y}":
                            System.out.println("You have knocked some of the life out of those bugs alien life is now," + (alienPoints - 100) + "\nNext type a multiply function to kill off more of the bugs");
                            break;
                    }
                    Scanner sd = new Scanner(System.in);
                    String multiply = sd.nextLine();

                    multiply = multiply.trim().toLowerCase();

                    switch (multiply) {
//                        int alienPoints = 300;

                        case "function multiply(x, y){return x * y}":
                            System.out.print("Success, you have taken out a good amount of the alien bugs life is now at " + 200 + " great job!");

                    }
                 }
            }
        }
    }






























