import java.lang.*;
import java.util.Scanner;
import java.util.stream.IntStream;
public class MethodsExercises {

    /*Basic Arithmetic

    Create four separate methods. Each will perform an arithmetic operation:Addition,Subtraction,Multiplication,Division*/
    /*Addition*/
    public static void main(String args[]) {
      System.out.println(stuff());
       System.out.print(getInteger());
        System.out.print(factorial(6));
    }


    //    public static int stuff(int first, int second, int add, int subtract, int multiply, int modulo, float int devide) {
    public static int stuff() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Two Numbers : ");
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        int add = first + second;
        int subtract = first - second;
        int multiply = first * second;
        int devide = first / second;
        int modulo = first % second;
        System.out.println("Sum = " + add);
        System.out.println("Difference = " + subtract);
        System.out.println("Multiplication = " + multiply);
        System.out.println("Division = " + devide);
        System.out.println("Modulo = " + modulo);
        System.out.println(multiply(4,4));

        return 0;

    }


    /*Food for thought: What happens if we try to divide by zero? What should happen? If we try to divide zero by zero an error gets thrown in the console*/

    /*Create a method that validates that user input is in a certain range The method signature should look like this:*/

    //
//    System.out.println("-- range --");
//    IntStream intStream = IntStream.range(1, 11);
//    intStream.forEach(System.out::println);
    public static int getInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();
        int max = 10;
        int min = 1;
        if (userInput > max || userInput < min) {
            System.out.print("Please enter a valid number.\n");
            return getInteger();
        }
        System.out.print("You picked: ");
        return userInput;
    }


    public static double multiply(double a, double b) {
        return a * b;
    }



    /*Calculate the factorial of a number.

Prompt the user to enter an integer from 1 to 10.
Display the factorial of the number entered by the user.
Ask if the user wants to continue.
Use a for loop to calculate the factorial.
Assume that the user will enter an integer, but verify it’s between 1 and 10.
Use the long type to store the factorial.
Continue only if the user agrees to.
A factorial is a number multiplied by each of the numbers before it.
Factorials are denoted by the exclamation point (n!). Ex:*/
    public static long factorial(int n) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();
        long product = 1;
        for (int i = 2; i < n; i++) {
            product *= i;

        }
        System.out.printf("Product is %d", product);
        return product;
    }

        /*Create an application that simulates dice rolling.

Ask the user to enter the number of sides for a pair of dice.
Prompt the user to roll the dice.
"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
Use static methods to implement the method(s) that generate the random numbers.
Use the .random method of the java.lang.Math class to generate random numbers*/









    }



































