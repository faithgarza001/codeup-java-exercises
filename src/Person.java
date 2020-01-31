

/*The class should have a constructor that accepts a String value and sets the person's name to the passed string.*/

public class Person {
  //This is an instance property because it's private
   private String name;
    String language;
    String ethnicity;
    int age;

        public Person(String name){
            this.setName(name);
        }
        /*Create a main method on the class that creates a new Person object and tests the above methods.*/


    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.printf("Hello, my name is %s\n", this.name);
    }

    public static void main(String[] args) {
        Person a = new Person("Elmo");
        a.sayHello();






    }
}




