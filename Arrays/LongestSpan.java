class GfG {
    static int equalSumSpan(int[] a1, int[] a2) {
        int n = a1.length;
        int maxLen = 0;
        
        // Check all possible subarrays
        for (int i = 0; i < n; i++) {
            int prefixSum1 = 0, prefixSum2 = 0;
            
            for (int j = i; j < n; j++) {
                
                // Calculate sum for current subarray
                prefixSum1 += a1[j];
                prefixSum2 += a2[j];
                
                // If sums are equal, update maxLen
                if (prefixSum1 == prefixSum2) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        
        return maxLen;
    }

    public static void main(String[] args) {
        int[] a1 = {0, 1, 0, 0, 0, 0};
        int[] a2 = {1, 0, 1, 0, 0, 1};
        System.out.println(equalSumSpan(a1, a2));
    }
}
