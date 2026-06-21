class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] visited = new boolean[n];
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(source);
        visited[source] = true;

        List<Integer>[] graph = new List[n];
        for (int i = 0; i < n; i++)
            graph[i] = new ArrayList<>();

        for (int[] e : edges) {
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }

        while (!stack.isEmpty()) {
            int cur = stack.pop();
            if (cur == destination)
                return true;

            for (int count : graph[cur]) {
                if (visited[count] == false) {
                    visited[count] = true;
                    stack.push(count);
                }
            }
        }

        return false;

    }
}