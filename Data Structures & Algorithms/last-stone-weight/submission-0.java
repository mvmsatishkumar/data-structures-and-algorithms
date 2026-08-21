class Solution {
    public int lastStoneWeight(int[] stones) {
        
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : stones) {
            pq.offer(num);
        }

        while (pq.size() > 1) {

            int n1 = pq.poll();
            int n2 = pq.poll();

            if (n1 == n2) {
                continue;
            }
            pq.offer(n1 - n2);
        }

        return pq.isEmpty() ? 0 : pq.peek();
    }
}