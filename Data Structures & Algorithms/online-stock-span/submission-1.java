class StockSpanner {

    // {price, span}
    Deque<int[]> stack = new ArrayDeque<>();

    public int next(int price) {
        int span = 1; // today's contribution

        // Merge spans of all smaller/equal prices
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }

        stack.push(new int[]{price, span});
        return span;
    }
}