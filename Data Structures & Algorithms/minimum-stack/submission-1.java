class MinStack {
    int[] stack;
    int idx;
    public MinStack() {
        stack = new int[30002 * 2];
        idx = -1;
    }

    public void push(int val) {
        if (idx == -1) {
            stack[++idx] = val;
            stack[++idx] = val;
        } else {
            int prevMin = stack[idx - 1];
            stack[++idx] = Math.min(val, prevMin);
            stack[++idx] = val;
        }
    }

    public void pop() {
        idx -= 2;
    }

    public int top() {
        return stack[idx];
    }

    public int getMin() {
        return stack[idx - 1];
    }
}
