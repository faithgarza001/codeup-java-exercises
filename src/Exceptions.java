//public class Exceptions {


    //Here this will throw a nullPointer exception fix this with a try/ catch
//    public static void main(String[] args) {
        //Here this will throw a nullPointer exception fix this with a try/ catch and you haven't initialized the variable.
//        String s;
//        System.out.println(s);
//        try{String str = null;
//
//            System.out.println(str.length());
////if the exception occurs catch it and print the following
//
//        }catch (NullPointerException e){
//            System.out.println("I am catching the null pointer exception Exception...");
//        }
      public class Exceptions {
        public static void main(String args[]) {
            try {
                int a[] = new int[10];
                //Array has only 10 elements
                a[11] = 9;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBounds");
            }
        }
    }












