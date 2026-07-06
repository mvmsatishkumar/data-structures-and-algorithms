class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> st = new Stack();

        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")){
                int b = st.pop();
                int a = st.pop();
                switch(tokens[i]){
                    case "+" : st.push(a+b);
                    break;
                    case "-" : st.push(a-b);
                    break;
                    case "*" : st.push(a*b);
                    break;
                    case "/" : st.push(a/b);
                    break;
                }
            } else {
                int n = Integer.parseInt(tokens[i]);
                st.push(n);
            }
        }

        return st.pop();
        
    }
}