public class MoveToEnd {
    public static void moveAllX (String str, int idx, String newStr,int count){

        // Base case: if we reach the end of the string
        if (idx == str.length()){
            for (int i = 0; i < count; i++){
                newStr += 'x'; // Append 'x' characters at the end
            }
            System.out.println(newStr);
            return;
        }

        char currentChar = str.charAt(idx);
        if (currentChar != 'x'){
            newStr += currentChar; // Add non-'x' character to new string
        }else {
            count++;
        }
        moveAllX(str, idx+1, newStr, count);
    }
    public static void main (String [] args) {
        String str = "axbcxxd";
        moveAllX(str, 0, "",0);

    }
}
