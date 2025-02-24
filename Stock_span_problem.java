
class Solution {
    // Function to calculate the span of stock's price for all n days.
    public ArrayList<Integer> calculateSpan(int[] arr) {
        Stack<Integer> s = new Stack<>();
        ArrayList<Integer> span = new ArrayList<>();
        
        // write code here
        for(int i=0;i<arr.length;i++) {
            int currprice = arr[i];
            
            while(!s.isEmpty() && arr[s.peek()] <= currprice){
                s.pop();
            }
            if(s.isEmpty()){
                span.add(i+1);
            }else{
                int prevHigh = s.peek();
                span.add(i-prevHigh);
            }
            s.push(i);
        }
        return span;
    }
}
