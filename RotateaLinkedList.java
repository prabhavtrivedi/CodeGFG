class Solution {
    public Node rotate(Node head, int k) {
        int count = 0 ;
        Node temp = head;
        
        while(temp != null){
            count++;
            temp = temp.next;
        }
        
        k %= count;
        
        if(k == 0)
            return head;

        Node temp2 = head;
        Node prev = null;
        
        while(k > 0){
            k--;
            prev = temp2;
            temp2 = temp2.next;
        }
        
        Node newHead = temp2; 
        prev.next =  null; //Cutting upto kth node
        while(temp2 .next != null)
            temp2 = temp2.next;
            
        temp2.next = head; //Adding head at the last of the linkedlist
        
        return newHead;
    }
}
