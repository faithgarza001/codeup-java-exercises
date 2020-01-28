import java.util.Scanner;


public class ConsoleExercises {
    public static void main(String[] args) {


        double pi = 3.14159;
        System.out.printf("\nThe value of pi is approximately %f.\n\n", pi);

        /*Prompt a user to enter a integer and store that value in an int variable using the nextInt method.*/

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter an integer");
        int n;
        n = s1.nextInt();


        System.out.println("The entered integer is" + n);




        /*Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline What happens if you enter less than 3 words?  What happens if you enter more than 3 words?*/
       Scanner scan = new Scanner(System.in);
System.out.println("Enter your three favorite words:");
String first = scan.next();
String second = scan.next();
String third = scan.next();
System.out.printf("\n Your three favorite words are: \"%s\", \"%s\", and \"%s\".\n", first, second, third);
//        System.out.println("Please Enter your three favorite words");
//        String str = "";
//        System.out.println(str.split("\\s+").length);
//      int wordCount;
//        {
//            wordCount = 1;
//            for (int i = 0; i < str.length(); i++) {
//                if (str.charAt(i) != ' ' ||
//                        i >= str.length() - 1 || str.charAt(i + 1) == ' ') {
//                } else {
//
//                }
//                {
//                    wordCount++;
//                }
//            }
//        }
//        System.out.println(wordCount);


//int i = Integer.parseInt(**string**);

        /*Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user do you capture all of the words?*/

//        System.out.println("Please Enter a sentence");
//            scanner.useDelimiter("\n");
//            String sentence = scanner.next();





        /*Rewrite the above example using the nextLine method.*/






/*Calculate the perimeter and area of Codeup's classrooms.

Prompt the user to enter values of length and width of a classroom at Codeup.

Use the nextLine method to get user input and [parse](https://docs.oracle.com/javase/7/docs/api/java/lang/Integer.html#parseInt(java.lang.String) the resulting string to a numeric type.

Assume that the rooms are perfect rectangles.
Assume that the user will enter valid numeric data for length and width.*/






/*Display the area and perimeter of that classroom.

The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.*/
        /* Look into catch try methods */

/*Some Examples of my Own

The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.*/






    }
}
