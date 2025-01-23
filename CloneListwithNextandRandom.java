class Solution {
    void insertcopy(Node head){
        Node temp=head;
        while(temp!=null){
            Node nextEl=temp.next;
            Node copy=new Node(temp.data);
            copy.next=nextEl;
            temp.next=copy;
            temp=nextEl;
        }
    }
    void connectRandom(Node head){
        Node temp=head;
        while(temp!=null){
            Node copyNode=temp.next;
            if(temp.random!=null){
                copyNode.random=temp.random.next;
            }
            else{
                copyNode.random=null;
            }
            temp=temp.next.next;
        }
    }
    Node getCopylist(Node head){
        Node temp=head;
        Node dummyNode=new Node(-1);
        Node res=dummyNode;
        while(temp!=null){
            res.next=temp.next;
            res=res.next;
            temp.next=temp.next.next;
            temp=temp.next;
        }
        return dummyNode.next;
    }
    public Node cloneLinkedList(Node head) {
        // code here
        if(head==null){
            return null;
        }
        insertcopy(head);
        connectRandom(head);
        return getCopylist(head);
    }
}

