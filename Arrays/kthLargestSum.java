import java.util.*;

class GfG {

    // Function to calculate Kth largest element
    // in contiguous subarray sum
    public static int kthLargest(int[] arr, int k) {
        int n = arr.length;

        // to store all subarray sums
        ArrayList<Integer> sums = new ArrayList<>();

        // Generate all subarrays
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                sums.add(sum);
            }
        }

        // Sort in decreasing order
        Collections.sort(sums, Collections.reverseOrder());

        // return the Kth largest sum
        return sums.get(k - 1);
    }

    public static void main(String[] args) {
        int[] arr = {20, -5, -1};
        int k = 3;
        System.out.println(kthLargest(arr, k));
    }
}
