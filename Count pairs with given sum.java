

class Solution {
    int countPairs(int arr[], int target) {
        int pair = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(map.containsKey(target - arr[i])){
                pair += map.get(target - arr[i]);
            }
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        return pair;
    }

}
