import java.util.HashSet;

public class UniqueSub {
    public static void printSubSeq (String str, int idx, String newStr, HashSet<String> set ){
        if (idx == str.length()){
            if (set.contains(newStr)){
                return;
            }else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }

        char currentChar = str.charAt(idx);
        // to be
        printSubSeq(str, idx+1, newStr+currentChar,set);

        // not to be
        printSubSeq(str, idx+1, newStr, set);
    }
    public static void main (String [] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        printSubSeq(str, 0,"",set);
    }
}
