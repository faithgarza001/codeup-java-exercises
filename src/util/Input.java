package util;
import java.lang.*;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Input {
    private Scanner scanner;

    //Instance of input and are substantiation of scanner
    public Input() {
        this.scanner = new Scanner(System.in);
    }


    public String getString() {
        String answer;
        System.out.println("Enter a string: ");
        answer = this.scanner.next();
        return answer;

    }

    public boolean yesNo() {
        String answer;
        System.out.println("What is your answer? (yes/no)");
        answer = this.scanner.next();
        return answer.toLowerCase().startsWith("y");
    }
    /*Your getInt and getDouble methods should make sure that the value returned from the method is actually an int or a double. Do this by using the following methods*/

    public int getInt(int min, int max) {

        int answer;
        do {
            System.out.println("Enter a number between 1 and 10");
            answer = this.scanner.nextInt();
        } while (answer < min || answer > max);
        return answer;


    }
  /*  Because there’s no way to convert the text FOOBAR into a number, trying to run this program will result in the following output:*/




    public static int GetAnInteger() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        sc = Scanner.nextInt();
        int i = 0;
        System.out.println("You entered ");

        while (true) {
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                sc.next();
                System.out.print("That’s not "
                        + "an integer. Try again: ");


            }

        }

    }
}






    //First find the exception error
    //try/catch code

//    public double getDouble(double min, double max) {
//        try {
//            double answer;
//            System.out.println("Enter a double");
//            answer = this.scanner.nextDouble();
//            return answer;
//        } catch (NullPointerException exception) {
//            return 0;
//        }
//
//        }
//
//
//    }


//    public double getDouble() {
//
//        return 0;
//
//    }




