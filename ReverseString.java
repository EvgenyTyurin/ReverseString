/**
 * Reverse string, you smart guy!
 */

public class ReverseString {

    public static void main(String[] args) {
        String str = "А роза упала на лапу Азора";
        // String to array of chars
        char[] charArray = str.toCharArray();
        // Cycle to half of char array and swap with another half
        for(int idx = 0; idx < charArray.length / 2; idx++) {
            char buf = charArray[idx];
            charArray[idx] = charArray[charArray.length - idx - 1];
            charArray[charArray.length - idx - 1] = buf;
        }
        // Char array to string
        str = String.valueOf(charArray);
        System.out.println(str);
    }
}
