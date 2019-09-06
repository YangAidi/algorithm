import java.util.Stack;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-06 15:36
 *
 * MLE了
 *
 *
 **/
public class Solution1089 {
    /**
     * @param s: the given string
     * @return: whether this string is valid
     */
    public boolean checkValidString(String s) {
        // Write your code here
        return dfs(s, 0,new Stack<Character>());
    }

//    private Stack<Character> stack = new Stack<>();

    private boolean dfs(String s, int i,Stack<Character> stack) {
        if (i >= s.length()) {
            return stack.isEmpty();
        }

        char c = s.charAt(i);

        switch (c) {
            case '(':
                stack.push('(');
                return dfs(s, i + 1,stack);
            case ')':
                if (stack.isEmpty() || stack.peek() != '(') {
                    return false;
                }
                stack.pop();
                return dfs(s, i + 1,stack);
            case '*':
                if (stack.isEmpty()) {
                    Stack<Character> s2 = new Stack<>();
                    s2.addAll(stack);
                    s2.push('(');
                    boolean b1 = dfs(s, i + 1,s2);
                    boolean b2 = dfs(s, i + 1,stack);
                    return b1 || b2;
                } else {
                    Stack<Character> s2 = new Stack<>();
                    s2.addAll(stack);
                    Stack<Character> s3 = new Stack<>();
                    s3.addAll(stack);
                    boolean b1 = dfs(s, i + 1,s2);
                    stack.pop();
                    boolean b2 = dfs(s, i + 1,stack);
                    s3.push('(');
                    boolean b3 = dfs(s,i+1,s3);
                    return b1 || b2 || b3;
                }
            default:
                break;
        }
        return stack.isEmpty();
    }
}
