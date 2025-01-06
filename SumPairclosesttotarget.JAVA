
class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int d = Integer.MAX_VALUE;
        int i=0;
        int n = arr.length;
        int j = n-1;

        Arrays.sort(arr);

        ArrayList<Integer> solution = new ArrayList<>();

        while(i < j){
            int sum = arr[i] + arr[j];
            int key = Math.abs(sum-target);
            if(key < d){
                d = key;
                first = arr[i];
                second = arr[j];
            }
            if(sum < target)
                i++;
            else
                j--;
        }

        if(first >= 0 && second >= 0){
            solution.add(first);
            solution.add(second);
        }

        return solution;
    }
}
