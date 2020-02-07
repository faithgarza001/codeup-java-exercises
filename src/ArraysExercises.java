import java.util.ArrayList;

public class ArraysExercises {

    String name;
    String language;
    String origin;
/*Create an array that holds 3 person objects*/
    public static void main(String[] args) {
/*Assign a new instance of the person class to each element.*/
        String [] peoples = {"Jim", "Jones", "Jill", "Jane"};
        /*Iterate through the array and print out the name of each person in the array*/
        for (String people : peoples) {
            System.out.println(people);//this for loop will print all  the names of the array perhaps we can go back and create an enhance for loop*/
            System.out.println();

        }
        //System.out.print(peoples.length);//this only prints out the length of the array
    ArraysExercises Faith = new ArraysExercises();
            Faith.name = "Faith";
            Faith.language = "JavaScript";
            Faith.origin = "San Antonio";
            System.out.print(Faith.fullReport());
    }
/*Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array*/
    public String fullReport() {
        String stuff = "";
        stuff += "My name is " + this.name;
        stuff += " I started learning " + this.language + " I live in " + this.origin;
        return stuff;
    }

        ArrayList myArray = new ArrayList<String>();

    public static void setMyArray(ArrayList myArray) {

        myArray.add("Stuff");
    }


}







