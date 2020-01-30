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
}

//public static int










