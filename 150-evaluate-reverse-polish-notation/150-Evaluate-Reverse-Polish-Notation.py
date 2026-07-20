class Solution:
    def evalRPN(self, tokens):
        def eval(num1, num2, op):
            match op:
                case "+":
                    return num1 + num2
                case "-":
                    return num1 - num2
                case "*":
                    return num1 * num2
                case "/":
                    return int(num1/num2)
        
        stack = []
        num1 = 0
        num2 = 0
        for i in tokens:
            if i not in {"+","-","*","/"}:
                stack.append(int(i))
            else:
                num2 = stack.pop()
                num1 = stack.pop()
                stack.append(eval(num1,num2,i))

        return stack[-1]
