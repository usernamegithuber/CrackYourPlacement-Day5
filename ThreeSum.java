package CrackYourPlacementDay5;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> triplet(int n, int[] arr) {
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            Set<Integer> hashset = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                // Calculate the 3rd element:
                int third = -(arr[i] + arr[j]);

                // Find the element in the set:
                if (hashset.contains(third)) {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
                    Collections.sort(temp);
                    set.add(temp);
                }
                hashset.add(arr[j]);
            }
        }

        // Store the set in the answer:
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }

    public static void main(String[] args) {
        ThreeSum ts = new ThreeSum();
        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = ts.triplet(arr.length, arr);
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}
