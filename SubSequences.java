public class SubSequences {
    public static void printSubSeq (String str, int idx, String newStr){
        if (idx == str.length()){
            System.out.println(newStr);
            return;
        }

        char currentChar = str.charAt(idx);
        // to be
        printSubSeq(str, idx+1, newStr+currentChar);

        // not to be
        printSubSeq(str, idx+1, newStr);
    }
    public static void main (String [] args) {
        String str = "abc";
        printSubSeq(str, 0,"");
    }
}
