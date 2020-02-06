package grades;

import java.util.ArrayList;
/*Create a Student class
//you will need to set the variable to change variables values.
    /*Create a class named Student. It should have private properties for the student's name, and grades. The grades property should be an ArrayList of integers.*/
public class Student {
    private String name;//If your variable is private you will need a getter
    private ArrayList<Integer> grades;


    /* The student class should have a constructor that sets name property, and initializes the grades property as an empty ArrayList. The Student class should have the following methods:*/

        // returns the student's name
        public Student(String name) {//this is your constructor

            this.name = name;
            this.grades = new ArrayList<>();//creating instance of new array list
        }

// returns the student's name
            public String name() {
                return name;
            }


            // adds the given grade to the grades property
            public void addGrade (int grade){
                grades.add(grade);
            }


            // returns the average of the students grades
            public double getGradeAverage () {
                double total = 0;//this is your bucket hence array you have to set it to 0 to start at the beginning of the grade array.
                for(Integer grade : grades){//enhanced for loop
                    total += grade;//here you are grabbing all the grades
                }
                return total/grades.size();//total divided by size(length) of the grades

            }

            public String getName() {
                return this.name;
            }


    public static void main(String[] args) {

            Student student = new Student("Faith");//Object instances of each student
            student.addGrade(90);
            student.addGrade(80);
            student.addGrade(70);
        System.out.println(student.getGradeAverage());

            Student student1 = new Student("Jim");//Object instances of each student
            student.addGrade(90);
            student.addGrade(80);
            student.addGrade(70);

            Student student2 = new Student("John");//Object instances of each student
            student.addGrade(90);
            student.addGrade(80);
            student.addGrade(70);
        System.out.println(student2.getGradeAverage());
            Student student3 = new Student("Jill");//Object instances of each student
            student.addGrade(90);
            student.addGrade(80);
            student.addGrade(70);

        System.out.println(student3.getGradeAverage());

    }




        }












