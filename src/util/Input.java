package util;
import java.lang.*;
import java.util.Scanner;


public class Input {
    private Scanner scanner, // = new Scanner(System.in);

    //Instance of input and are substantiation of scanner
    public Input() {
        this.scanner = new Scanner(System.in);
    }


    public String getString() {

        return null;

    }

    public boolean yesNo() {


        return false;
    }

    public int getInt(int min, int max) {

        int answer;
        do{
            System.out.println("Enter a number between 1 and 10");
            answer = this.scanner.nextInt();
        } while (answer < min || answer > max);
            return answer;


    }

    public int getInt() {
        int answer;
        System.out.println("Enter a number: ");
        answer = this.scanner.nextInt();
        return answer;

    }

    public double getDouble(double min, double max) {





    }

    public double getDouble() {


        return 0;
    }
}



