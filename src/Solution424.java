import java.util.Stack;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-12 14:49
 **/
public class Solution424 {
    /**
     * @param tokens: The Reverse Polish Notation
     * @return: the value
     */
    public int evalRPN(String[] tokens) {
        // write your code here
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            int value = 0;
            if (s.length() == 1) {
                char c = s.charAt(0);
                if (c > '9' || c < '0') {
                    int a = stack.pop();
                    int b = stack.pop();
                    switch (c) {
                        case '+':
                            stack.push(a + b);
                            break;
                        case '-':
                            stack.push(a - b);
                            break;
                        case '*':
                            stack.push(a * b);
                            break;
                        case '/':
                            stack.push(a / b);
                            break;
                        default:
                            break;
                    }
                    continue;

                } else {
                    value = c - '0';
                }
            } else {
                value = Integer.valueOf(s);
            }
            stack.push(value);
        }
        return stack.pop();
    }
}
