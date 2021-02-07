package addTask;

public class Calculator {

    public static double add(double x, double y) {
        return x*y;
    }

    public static double div (double x, double y) {
        double result;
        try {
            return x/y;

        } catch (ArithmeticException e) {
            System.out.println("zero division error");
            return -1;
        }
    }


    public static double sum(double x, double y){
        return x + y;
    }

    public static double sub (double x, double y){
        return x - y;
    }
}
