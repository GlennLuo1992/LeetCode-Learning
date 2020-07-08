package practise2020;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class _10_anagramMappings {
    public static int[] anagramMappings(int[] A, int[] B) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            map.put(A[i],i);
        }
        int[] result = new int[A.length];
        for (int i = 0; i < B.length; i++) {
            map.replace(B[i],i);
        }
        for (int i = 0; i < A.length; i++) {
            result[i] = map.get(A[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A = new int[]{12,28,46,32,50};
        int[] B = new int[]{50,12,32,46,28};
        anagramMappings(A,B);
    }
}
