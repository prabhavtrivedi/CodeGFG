class Solution {
    public int longestSubarray(int[] arr, int k) {
        
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        int maxLength = 0;
        int prefixSum = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            
            if (prefixSum == k) {
                maxLength = i + 1;
            }

            
            if (prefixSumMap.containsKey(prefixSum - k)) {
                maxLength = Math.max(maxLength, i - prefixSumMap.get(prefixSum - k));
            }

          
            if (!prefixSumMap.containsKey(prefixSum)) {
                prefixSumMap.put(prefixSum, i);
            }
        }

        return maxLength;
    }
}

