

/*The class should have a constructor that accepts a String value and sets the person's name to the passed string.*/

public class Person {


    public static void main(String[] args) {
        System.out.println(square(5));
        System.out.println(sum(5,2));
        System.out.println(sum(5.2,1.1));
        System.out.println(average(new int[]{2, 1}));
    }




    public static int square(int x){
        return x * x ;

    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static double sum(double a, double b){
        return a + b;
    }

    public static double average(int[] array){
        int sum = 0;
        for(int i : array)sum += i;
        return((double)sum)/array.length;
    }
}
  //This is an instance property because it's private
//   private String name;
//    String language;
//    String ethnicity;
//    int age;
//
//        public Person(String name){
//            this.setName(name);
//        }
//        /*Create a main method on the class that creates a new Person object and tests the above methods.*/
//
//
//    public String getName(){
//        return this.name;
//    }
//
//    public void setName(String name){
//        this.name = name;
//    }
//
//    public void sayHello(){
//        System.out.printf("Hello, my name is %s\n", this.name);
//    }
//
//    public static void main(String[] args) {
//        Person a = new Person("Elmo");
//        a.sayHello();
//
//
//
//
//
//
//    }





