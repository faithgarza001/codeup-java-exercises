public class Pushup {

    public static void main(String[] args) {
        //Assessment app = new Assessment("harry", "potter", true);
        System.out.println(square(4));
        System.out.println(sum(4, 5));
        System.out.println(sum(4.5, 5.5));
        int[] x = {1, 2};
        System.out.println(average(x));

    }

//Math in Java

    public static int square(int x) {

        return (int) Math.pow(x, 2);

    }

    public static int sum(int x, int y) {

        return x + y;
    }

    public static double sum(double x, double y) {

        return x + y;

    }


    public static double average(int[] x) {

        int sum = 0;

        double average;

        for (int number : x) {

            sum += number;
        }

        average = (double) sum / x.length;

        return average;
    }






}









