// You are given an positive integer n. You have to find the value of (1n +2n + 3n + 4n ) mod 5. 
// Note : Value of n may be very large of order 10^15. 

import java.util.*;

class ModExpFunc {
    static int fnMod(int n) {
        return (n % 4 != 0) ? 0 : 4;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(fnMod(n));
        }
        sc.close();
    }
}