import java.util.Stack;
class Solution {
    public static int eval(int n1, int n2, String op){
        return switch(op){
            case "+"->n1+n2;
            case "-"->n1-n2;
            case "*"->n1*n2;
            case "/"->n1/n2;
            default->throw new IllegalArgumentException("Unknown operator: " +op);
        };
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        HashSet<String> operators = new HashSet<>(Set.of("+","-","*","/"));
        for(String x:tokens){
            if(!operators.contains(x)){
                stack.push(Integer.parseInt(x));
            }else{
                int n2 = stack.pop();
                int n1 = stack.pop();
                stack.push(eval(n1,n2,x));
            }
        }
        return stack.peek();
    }
}