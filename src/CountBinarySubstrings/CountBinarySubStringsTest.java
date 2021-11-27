package CountBinarySubstrings;

public class CountBinarySubStringsTest {
    public static void main(String[] args){
        String s = "00110011";
        CountBinarySubstrings countBinarySubstrings = new CountBinarySubstrings();
        System.out.println(countBinarySubstrings.getCount(s) == 6);
    }
}
