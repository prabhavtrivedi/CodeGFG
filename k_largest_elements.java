class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= arr.length - k; i--) {
            list.add(arr[i]); 
        }
    return list;
 }
}
