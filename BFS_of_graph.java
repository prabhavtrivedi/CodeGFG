class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int n = adj.size();
        ArrayList<Integer> res = new ArrayList<>();
        boolean[] vis = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        
        q.add(0);
        vis[0] = true;
        
        while (!q.isEmpty()) {
            int node = q.poll();
            res.add(node);
            
            for (int it : adj.get(node)) {
                if (!vis[it]) {
                    q.add(it);
                    vis[it] = true;
                }
            }
        }
        return res;
    }
}
