import java.lang.*;
import java.util.Scanner;
public class MethodsExercises {

/*Basic Arithmetic

Create four separate methods. Each will perform an arithmetic operation:Addition,Subtraction,Multiplication,Division*/
 /*Addition*/          public static void main(String args[])
{
    int first, second, add, subtract, multiply, modulo;
    float devide;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter Two Numbers : ");
    first = scanner.nextInt();
    second = scanner.nextInt();

    add = first + second;
    subtract = first - second;
    multiply = first * second;
    devide = (float) first / second;
    modulo = first % second;

    System.out.println("Sum = " + add);
    System.out.println("Difference = " + subtract);
    System.out.println("Multiplication = " + multiply);
    System.out.println("Division = " + devide);
    System.out.println("Modulo =" + modulo);

    /*Food for thought: What happens if we try to divide by zero? What should happen? If we try to divide zero by zero an error gets thrown in the console*/

    /*Create a method that validates that user input is in a certain range The method signature should look like this:*/
    public static int getInteger(int min, int max){
    System.out.print("Enter a number between 1 and 10: ");
    int userInput = getInteger(1, 10);}

    }
}
