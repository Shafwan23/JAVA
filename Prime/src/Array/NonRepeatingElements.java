package Array;

import java.util.HashMap;

public class NonRepeatingElements {
    public static void solve(int[] arr, int N) {
        HashMap<Integer, Integer> store = new HashMap<>();
        for (int num : arr) {
            store.put(num, store.getOrDefault(num, 0) + 1);
        }
        for (int key : store.keySet()) {
            if (store.get(key) == 1) {
                System.out.print(key + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3};
        int N = 6;
        solve(arr, N);
    }
}
