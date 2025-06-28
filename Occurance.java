public class Occurance {
    public static int first = -1;
    public static int last = -1;

    // This method finds the first and last occurrence of a character in a string using recursion.

    public static void findOccur (String str, int idx, char ele) {
        if (idx == str.length()) {
            System.out.println("First Occurrence: " + first);
            System.out.println("Last Occurrence: " + last);
            return;
        }

        char currentChar = str.charAt(idx);
        if (currentChar == ele) {
            if (first == -1) {
                first = idx; // First occurrence
            }else {
                last = idx; // Last occurrence
            }
        }
        findOccur(str, idx+1, ele);
    }
    public static void main (String [] args) {
        String str = "abaacdaefaah";
        char ele = 'a';
        findOccur(str, 0, ele);
    }
}
