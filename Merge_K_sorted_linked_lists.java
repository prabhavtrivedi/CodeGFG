class Solution {
    // Function to merge K sorted linked list.
  Node mergeKLists(List<Node> arr) {
        // Add your code here.
        List<Node> list=new ArrayList<>();
        for(Node node:arr){
            Node curr=node;
            while(curr!=null){
                list.add(curr);
                curr=curr.next;
            }
        }
        Collections.sort(list,(a,b)->a.data-b.data);
        for(int i=1;i<list.size();i++){
            list.get(i-1).next=list.get(i);
        }
        return list.get(0);
    }
}
