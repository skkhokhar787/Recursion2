public class TowerOfHanoi {
    public static void hanoi (int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + src + " to " + dest);
            return;
        }

        hanoi(n-1, src, dest, helper);
        System.out.println("Move disk " + n + " from " + src + " to " + dest);
        hanoi(n-1, helper, src, dest);
    }
    public static void main (String [] args){
        int n = 3; // Number of disks
        hanoi(n, "S", "H", "D");
    }
}
