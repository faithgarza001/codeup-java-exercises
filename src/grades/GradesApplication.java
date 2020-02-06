package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
//Here you are defining the hash map
        /*It should have keys that are strings that represent github usernames, and values that are Student objects. Create at least 4 student objects with at least 3 grades each, and add them to the map*/
        HashMap<String, String> students = new HashMap<>();
        //now you are putting data into the hash map
        students.put("Jill", "blackcat23");//key value pairs
        students.put("Faith", "Fey123");
        students.put("Jane", "Jannette001");
        students.put("Joe", "Joseph68");


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


        System.out.println(students);
    }
}
