package tools;

public class Methods {



   public class Test {
        public int i = 0;
        Integer builder;


        // constructor of class which counts
        //the number of the objects of the class.
        Test() {
            i++;


        }

        // static method is used to access static members of the class
        // and for getting total no of objects
        // of the same class created so far
        //this is an inner class it cannot have static declarations
        public int get() {


            // statements to be executed....
            return i;
        }

        // Instance method calling object directly
        // that is created inside another class 'GFG'.
        // Can also be called by object directly created in the same class
        // and from another method defined in the same class
        // and return integer value as return type is int.
        public int m1() {
            System.out.println("Inside the method m1 by object of GFG class");

            // calling m2() method within the same class.
            this.m2();

            // statements to be executed if any
            return 1;
        }

        // It doesn't return anything as
        // return type is 'void'.
        public void m2() {

            System.out.println("In method m2 came from method m1");
        }

        public String toString() {
            String result = this.builder.toString();
            if (result.endsWith("\n")) {
                result = result.substring(0, result.length() - 1);
            }
            return result;
        }


        public String main(String[] args) {

            // Creating an instance of the class
            Methods.Test obj = new Methods.Test();
            // Calling the m1() method by the object created in above s             //tep.
            int i = obj.m1();
            System.out.println("Control returned after method m1 :" + i);

            // Call m2() method
            // obj.m2();

            int no_of_objects = Methods.Test.get();

            System.out.print("No of instances created till now : ");
            System.out.println(no_of_objects);
            System.out.println("Oooh I'm an Integerrrr");
            return null;
        }


            //This is the beginning of your Java Crash Course
            //We will start with the basics.
            //Currently owned by Oracle and contains a huge developer community. Java is platform Independent language write once run on a number of different platforms can    //fit needs of a of  virtually any types of application.


            //this is the beginning of your exponent code
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(); // Accept integer n
//        int m = sc.nextInt(); // Accept integer m
//        int ans = (int) Math.pow(n, m); // Calculates n ^ m
//        System.out.println(ans);} // prints answers
            //This is the beginning to your max method
//        System.out.println(max(5,1));
            //this is the beginning of calling your total method
//        System.out.println(total(2,6));


//
//    public static int total(int x, int y) {
//        return x += y;
//    }
//    //In here you are using method overloading which entails overload to method that is tailored to input
//    public static double total(double x, double y){
//        return x += y;
//    }
//
//
//    //In the first method we say if a is equal to b return a plus b if not return max value of integer.
//    public static int max(int c, int d) {
//        if (c == d)
//            return c + d;
//        else {
//            return Integer.max(c, d);
//        }

//In the next few method we will cover adding of arrays and averaging arrays

//public static int add(int [],)


        }
}



