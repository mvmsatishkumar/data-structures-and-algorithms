class Solution {
    public int calPoints(String[] operations) {
        
        int sum = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < operations.length; i++) {
            
            if (operations[i].equals("+")) {
                int num1 = stack.pop();
                int num2 = stack.peek();
                stack.push(num1);
                stack.push(num1 + num2);
            } else if (operations[i].equals("D")) {
                stack.push(2 * stack.peek());
            } else if (operations[i].equals("C")) stack.pop();
            else {
                stack.push(Integer.parseInt(operations[i]));
            }
        }

        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }
}