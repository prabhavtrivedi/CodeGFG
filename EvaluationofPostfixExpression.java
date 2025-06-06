class Solution {
    public int evaluate(String[] arr) {
        if(arr==null||arr.length==0)
        return 0;
        ArrayDeque<Integer> st = new ArrayDeque<>();
        for(String s:arr)
        {
            if(isNumeric(s))
            st.push(Integer.parseInt(s));
            else
            {
                if(st.size()<2)
                throw new RuntimeException("Insufficient operands");
                
                int first = st.pop();
                int second = st.pop();
                int temp =0 ;
                if(s.equals("+"))
                {
                    temp = second+first;
                }
                else if(s.equals("-"))
                {
                    temp = second-first;
                }
                else if(s.equals("*"))
                {
                    temp = second*first;
                }
                else if(s.equals("/"))
                {
                    temp = second/first;
                }
                st.push(temp);
            }
        }
        return st.peek();
        //return (st.size()==1)?st.peek():(throw new RuntimeException("Wrong expression"));
    }
    private boolean isNumeric(String s)
    {
        try
        {
            Integer.parseInt(s);
            return true;
        }
        catch(NumberFormatException e)
        {
            return false;
        }
    }
}
