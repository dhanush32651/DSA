import java.util.*;
class Solution {
    public long pickGifts(int[] gifts, int k) {
        int n = gifts.length;
        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            pq.add(gifts[i]);
        }
        for (int j = 0; j < k; j++) {
            int temp1 = pq.poll();
            int root = (int) Math.sqrt(temp1);
            pq.add(root);
        }
        long sum = 0;
        while (!pq.isEmpty()) {
            sum = sum + pq.poll();
        }
        return sum;
    }
}
