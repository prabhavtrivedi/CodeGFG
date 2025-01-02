https://www.geeksforgeeks.org/problems/subarrays-with-sum-k/1
// User function Template for Java
class Solution {
    public int countSubarrays(int arr[], int k) {
        // code here
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        
        int sum=0;
        
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum==k){
                count++;
            }
            
            if(map.containsKey(sum-k)){
                count=count+map.get(sum-k);
                
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
            
        }
        return count;
    }
}
