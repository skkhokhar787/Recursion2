public class ReverseStr {
    public static void printRev (String str, int idx) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printRev(str, idx - 1);
    }
    public static  void main (String [] args) {
     String str = "abc";
        printRev(str, str.length() - 1);
        System.out.println(); // For a new line after printing the reversed string

    }
}
