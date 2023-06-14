package lab0;

public class Test {
    public static void main(String[] args) {
        char ch = 'A';
        System.out.println(StringTools.isDigit(ch) == false);
        System.out.println(StringTools.isLetter(ch) == true);
        System.out.println(StringTools.isLowerCase('a') == true);
        System.out.println(StringTools.isLowerCase('G') == false);
        System.out.println(StringTools.isUpperCase('x') == false);
        System.out.println(StringTools.isUpperCase('P') == true);

        String str = "7nb0k098goubgy";
        System.out.println(StringTools.hasUpperCase(str) == false);

        double[] numbers = {-1.23, -0.5, 123.2, 12.7, -100.8};
        System.out.println(ArrayTools.max(numbers) == 123.2);


    }
}
