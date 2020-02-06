package grades;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Here you are defining the hash map
        /*It should have keys that are strings that represent github usernames, and values that are Student objects. Create at least 4 student objects with at least 3 grades each, and add them to the map*/



        Student student = new Student("Jill");//Object instances of each student
        student.addGrade(90);
        student.addGrade(80);
        student.addGrade(70);

        Student student1 = new Student("Faith");//Object instances of each student
        student1.addGrade(90);
        student1.addGrade(80);
        student1.addGrade(70);

        Student student2 = new Student("Jane");//Object instances of each student
        student2.addGrade(90);
        student2.addGrade(80);
        student2.addGrade(70);

        Student student3 = new Student("Joe");//Object instances of each student
        student3.addGrade(90);
        student3.addGrade(80);
        student3.addGrade(70);

        HashMap<String, Student> students = new HashMap<>();
        //now you are putting data into the hash map must be at the bottom so that your Hash map can read the objects
        students.put("blackcat23",student);//key value pairs
        students.put("Faith", student1);
        students.put("Jane", student2);
        students.put("Joe", student3);

        System.out.println("Welcome!!\n Here are the  Github usernames of our students\n");
        students.forEach((key, value) -> System.out.println(key));//Java function with a forEach loop this is protocol for HashMap!!!Do not use this unless it's Hash

//        System.out.println(students);



        /*Print the list of GitHub usernames out to the console, and ask the user which student they would like to see more information about. The user should enter a GitHub username (i.e. one of the keys in your map). If the given input does not match up with a key in your map, tell the user that no users with that username were found. If the given username does exist, display information about that student, including their name and their grades*/
        String userInput = "";
        int userContinue = 1;
        //outer do gives information inner do tells what to do with data if it not correct.

      do {


          do {
              if (userInput != ""){
                  System.out.println("Sorry, no student found with the GitHub username of ");
              }
                System.out.println("What student would you like to see more information on?\n");
                userInput = scanner.next();

          } while (!students.containsKey(userInput));
          //function for displaying data after the while loop has processed(after userInput has been taken in

          System.out.println(students.get(userInput).name() + "\n" + students.get(userInput).getGradeAverage());


          System.out.println("Do you want to continue? 1:yes or 2:no");
          userContinue = scanner.nextInt();
          userInput = "";


      }while (userContinue == 1);

}



}
