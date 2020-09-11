package codility;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {

    public static int solution(int[] A) {
        // write your code in Java SE 8

        Set<Integer> set = new HashSet<>();

        for (int a : A) {
            set.add(a);
        }

        for(int i=1; i< 1000000; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int A[] = { 1, 3, 6, 4, 1, 2};
//        int A[] = {-100, -1};
//        int A[] = {-99999, 99999};
//        int A[] = {-1, -3};
        System.out.println("result : " +solution(A));
    }
}
