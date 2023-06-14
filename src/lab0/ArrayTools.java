package lab0;

public class ArrayTools {
    public static double max(double[] numbers) {
        double max = numbers[0];
        for (double number : numbers) {
            if(number > max) {
                max = number;
            }
        }
        return max;
    }
}
