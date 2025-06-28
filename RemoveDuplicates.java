public class RemoveDuplicates {
    public static boolean [] map = new boolean[26];
    public static void removeDup (String str, int idx, String newStr) {
        // Base case: if we reach the end of the string
        if (idx == str.length()){
            System.out.println(newStr); // Print the new string without duplicates
            return;
        }
        char currentChar = str.charAt(idx);
        // Check if the character is already present in the map
        if (map[currentChar - 'a']){
            removeDup(str, idx+1, newStr);
        }else {
            newStr += currentChar; // Add the character to the new string
            map[currentChar - 'a'] = true; // Mark the character as seen
            removeDup(str, idx+1, newStr);
        }

    }
    public static void main (String [] args) {
        String str = "abbccda";
        removeDup(str, 0, ""); // Start the recursion with an empty new string
    }
}
