import java.util.Stack;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-15 12:37
 **/
public class Solution193B {
    public int longestValidParentheses(String s) {

        if (s == null) {
            return 0;
        }

        Stack<Integer> stack = new Stack<>();
        int maxLen = 0;
        int accumulatedLen = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                if (stack.isEmpty()) {
                    // 如果栈为空，没有左括号可以匹配
                    // accumulatedLen存储的是()()(这种情况，已经全部弹出了栈
                    accumulatedLen = 0;
                } else {
                    //从最近的'('作为起点
                    int matchedPos = stack.pop();
                    //计算两括号间的长度
                    int matchedLen;
                    int d = i - matchedPos + 1;

                    //如果栈为空，没有左括号可以匹配
                    if (stack.isEmpty()) {
                        accumulatedLen += d;
                        //更新当前匹配括号序列长度
                        matchedLen = accumulatedLen;
                    } else {
                        matchedLen = i - stack.peek();
                    }

                    maxLen = Math.max(maxLen, matchedLen);
                }
            }
        }

        return maxLen;
    }
}
