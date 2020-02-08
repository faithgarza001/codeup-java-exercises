public class Exceptions {


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
//      public class Exceptions {
//        public static void main(String args[]) {
//            try {
//                int a[] = new int[10];
//                //Array has only 10 elements
//                a[11] = 9;
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("ArrayIndexOutOfBounds");
    public static void main(String args[]) {


        int[][] data = {
                {3, 2, 5},
                {1, 4, 4, 8, 13},
                {9, 1, 0, 2},
                {0, 2, 6, 3, -1, -8}
        };
        System.out.println(getMinValue(data));


    }

    public static int getMaxValue(int[][] numbers) {
        int maxValue = numbers[0][0];
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                if (numbers[j][i] > maxValue) {
                    maxValue = numbers[j][i];
                }
            }
        }
        return maxValue;
    }

    public static int getMinValue(int[][] numbers) {
        int minValue = numbers[0][0];

        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                if (numbers[j][i] < minValue) {
                    minValue = numbers[j][i];

                }
            }
        }
        return minValue;
    }
}
















