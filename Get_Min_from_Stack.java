class Solution {
    int minEle;
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    
    int peek() {
        if(stack1.isEmpty()) return -1;
        return stack1.peek();
    }
	
    int getMin() {
        if(stack2.isEmpty()) return -1;
        return stack2.peek();
    }
    
    int pop() {
        if(stack1.isEmpty()) return -1;
        int popped = stack1.pop();
        if(popped == stack2.peek())
            stack2.pop();
        return popped;
    }

    void push(int x) {
        stack1.push(x);
        if(stack2.isEmpty()) stack2.push(x);
        else if(x <= stack2.peek())
            stack2.push(x);
    }	
}
