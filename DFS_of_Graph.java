class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> result = new ArrayList<>();
        int V = adj.size();
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        
        while(!stack.isEmpty()) {
            int u = stack.pop();
            if(!visited[u]) {
                visited[u] = true;
                result.add(u);
                
                for(int i = adj.get(u).size() - 1; i >= 0; i--) {
                    int v = adj.get(u).get(i);
                    if(!visited[v]) {
                        stack.push(v);
                    }
                }
            }
        }
        
        return result;
    }
}
