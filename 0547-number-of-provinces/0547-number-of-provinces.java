class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int count = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        for (int a = 0; a < isConnected.length; a++) {
            if (visited[a])
                continue;

            deque.push(a);
            visited[a] = true;
            count += 1;
            while (!deque.isEmpty()) {
                int cur = deque.pop();
                for (int a1 = 0; a1 < isConnected[cur].length; a1++) {
                    if (visited[a1] == false && isConnected[cur][a1] == 1) {
                        visited[a1] = true;
                        deque.push(a1);
                    }
                }
            }
        }

        return count;
    }
}