/*
Loop Basics

While

a. Completed Create an integer variable i with a value of 5.
Create a while loop that runs so long as i is less than or equal to 15
Each loop iteration, output the current value of i, then increment i by one.
Your output should look like this:

5 6 7 8 9 10 11 12 13 14 15
*/
class WhileLoopExample {
    public static void main(String args[]) {
        int i = 5;
        do {
            System.out.println(i);
            i++;
        }
        while (i <= 15);

/*Do While

 Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.*/

                            int u = 2;
                    do {

                        System.out.println(u);
                        u++;
                    }
                    while (u <= 100);


/*Completed Alter your loop to count backwards by 5's from 100 to -10.*/
        int p;

        for ( p=100; p>=0; p=p-5 )                       // x = x - 5 is same as x -=5
            System.out.println(p);


/*Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal*/
        int num = 2;
        int z = 0; // loop variable initialization
        do {
            int value = num * z;
            System.out.println(num + " * " + z + " = " + value);
            z++;
        } while ( z <= 100 ); // condition check for exit



    }
}