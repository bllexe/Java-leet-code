package easy;

public class FindIndex {

    public static void main(String[] args) {
       String haystack="araba";
       String needle ="ba";

       int result=strStr(haystack,needle);
       System.out.println(result);

    }

    private static int strStr(String haystack, String needle) {
    
        return haystack.indexOf(needle);
    }
}
