import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

class GfG {
    static List<List<Integer>> distinctPairs(int[] arr, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    int first = Math.min(arr[i], arr[j]);
                    int second = Math.max(arr[i], arr[j]);
                    List<Integer> cur = new ArrayList<>
                      					(Arrays.asList(first, second));
                    
                    if (!res.contains(cur))
                        res.add(cur);
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int target = 6;
        List<List<Integer>> res = distinctPairs(arr, target);

        for (List<Integer> pair : res)
            System.out.println(pair.get(0) + " " + pair.get(1));
    }
}
