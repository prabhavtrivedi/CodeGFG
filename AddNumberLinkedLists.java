class Solution {
    static Node addTwoLists(Node num1, Node num2) {
        int carry=0;
        Node ahead=null,ans=null;
        Node n1=reverseList(num1);
        Node n2=reverseList(num2);
        while(n1!=null || n2!=null || carry!=0){
            int s=0;
            if(n1!=null){    
                s+=n1.data;
                n1=n1.next;
            }
            if(n2!=null){
                s+=n2.data;
                n2=n2.next;
            }
            s+=carry;
            carry= s/10;
            Node sum=new Node(s % 10);
            if(ahead==null){
                ahead=sum;
                ans=sum;
            }
            else{
                ans.next=sum;
                ans=ans.next;
            }
        }
        ahead= reverseList(ahead);
        while(ahead!=null && ahead.data==0){
            ahead=ahead.next;
        }
        return ahead;
    }
    static Node reverseList(Node head){
        Node curr=head,prev=null,next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
