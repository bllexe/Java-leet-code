package easy;

public class LastWordLength {


    public static void main(String[] args) {
       
        String s="luffy is still joyboy   ";
        int result=lastWordLength(s);
        System.out.println(result);
    }

    private static int lastWordLength(String s) {
       
        String [] splitWords=s.split(" ");
        return splitWords[splitWords.length-1].length();
    } 
}
