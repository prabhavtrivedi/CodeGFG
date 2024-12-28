
class Solution {
public List<List<Integer>> findTriplets(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            Map<Integer, List<Integer>> mpp = new HashMap<>();
            int sum = arr[i];
            for (int j = i + 1; j < n; j++) {
                int op = sum + arr[j];
                if (mpp.containsKey(-op)) {
                    for (int ind : mpp.get(-op)) {
                        ans.add(Arrays.asList(i, ind, j));
                    }
                }
                mpp.putIfAbsent(arr[j], new ArrayList<>());
                mpp.get(arr[j]).add(j);
            }
        }

        return ans;
    }
} 
