package grades;

import java.util.ArrayList;
/*Create a Student class

    /*Create a class named Student. It should have private properties for the student's name, and grades. The grades property should be an ArrayList of integers.*/
public class Student {
    private String name;
    private ArrayList<Integer> grades;


    /* The student class should have a constructor that sets name property, and initializes the grades property as an empty ArrayList. The Student class should have the following methods:*/

        // returns the student's name
        public Student(String name) {

            ArrayList<String> students = new ArrayList<>();
            students.add("Jack");
            students.add("Jill");
            students.add("Jane");
            students.add("Joe");
            students.add("Jimmy");
            students.add("John");
            students.add("Justin");
            students.add("Jasmine");

            return "stuff";

        }


        // adds the given grade to the grades property
        public static Integer addGrade ( int grade){

            ArrayList<Integer> grades = new ArrayList<>();
            grades.add(100);
            grades.add(95);
            grades.add(90);
            grades.add(85);
            grades.add(80);
            grades.add(75);
            grades.add(70);
            grades.add(65);

            return 0;

        }


        // returns the average of the students grades
        public double getGradeAverage () {
            return 0;
        }
//    public static void main(String[] args) {
//
//
////        System.out.println(getName());
////        System.out.println(addGrade(99));
//
//    }


    }










