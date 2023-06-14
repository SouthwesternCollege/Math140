package lab0;

public class StringTools {
    public static boolean isDigit(char ch) {
        return '0' <= ch && ch <= '9';
    }
    public static boolean isLetter(char ch) {
        return isLowerCase(ch) || isUpperCase(ch);
    }
    public static boolean isLowerCase(char ch) {
        return 'a' <= ch && ch <= 'z';
    }
    public static boolean isUpperCase(char ch) {
        return 'A' <= ch && ch <= 'Z';
    }

    public static boolean hasUpperCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            if(isUpperCase(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }

}
