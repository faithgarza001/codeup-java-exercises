import java.lang.*;
import java.util.Scanner;//gives access to the code library and allows the data to be put in from the keyboard and should be near the top of the file.
import java.lang.reflect.Array;
import java.util.ArrayList;

public class HighLow {

//For the sake of time I'm going to leave everything in main.Will work tomorrow on methods.
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);/*“Scanner keyboard = new Scanner(System.in);” creates a
        Scanner object that takes System.in as a parameter setting the variable of keyboard with the keyboard variable now we can use the other methods that are available in the scanner class.*/

        String Go, Blast, Test, Pantry, Eat;//Here a string of array (String []) which lies within the parameters.
        int playerHP = 300;
        int alienPoints = 400;
        System.out.println(" Welcome to the Europa ADVENTURE");//This is simply a print that is a string
        System.out.println("  ");//A line between lines printed when code is run.
        System.out.println("There are couple of things you need to know first your health is set at " + playerHP + " your nemesis alien bug is set at " + alienPoints);//String plus int variables concat.
        System.out.println("  ");//A line between lines printed when code is run.
        System.out.println(" You have been exploring around a few days now you are in a the cave hanging from a zipLine, Would you like to go 'further up' or 'down'? ");
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
            if(Test.equalsIgnoreCase("yes"))


                System.out.println("Enter javaScript function called addition(x, y): returns the sum ");
                String var1 = keyboard.next();

                System.out.println("Enter second word: ");
//                String var2 = Scanner.nextLine();

//                if (same (var1, var2))
//                    System.out.println("Yes");
//                else
//                    System.out.println("No");
//            }

//            public static boolean same (String var1, String var2){
//                if (var1 == var2)
//                    return true;
//                else
//                    return false;
//            }

                System.out.println("After killing off some of the bugs, you have used the battery life and need to wait for it to recharge. Would you like to eat some of the food, 'Yes' or 'No'?");
                System.out.print(">  ");
                Eat = keyboard.next();

                if (Eat.equalsIgnoreCase("Yes")) {
                    System.out.println("  ");
                    System.out.println("You live!");
                } else if (Eat.equalsIgnoreCase("No")) {
                    System.out.println("  ");
                    System.out.println("You die of starvation!");
                }
            } else if (Blast.equalsIgnoreCase("pantry")) {
                System.out.println("There is a killer inside. Do you want to 'fight' them, or 'run away'?");
                System.out.print(">  ");
                Pantry = keyboard.next();

                if (Pantry.equalsIgnoreCase("fight")) {
                    System.out.println("  ");
                    System.out.println("You're weak and die");
                } else if (Pantry.equalsIgnoreCase("run away")) {
                    System.out.println("  ");
                    System.out.println("You died because your too slow & can't run");
                }
            }
        }

    }
}
























