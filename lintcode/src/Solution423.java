/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-09 01:02
 **/

import java.util.Stack;

/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution423 {
    /**
     * @param s: A string
     * @return: whether the string is a valid parentheses
     */
    public boolean isValidParentheses(String s) {
        // write your code here
        Stack<Character> stack = new Stack<>();
        for(Character c:s.toCharArray()){
            if(c == '('|| c=='[' ||c=='{'){
                stack.push(c);
            }else if(stack.isEmpty()){
                return false;
            }else {
                Character last = stack.pop();
                if(last=='('){
                    if(c!=')'){
                        return false;
                    }
                }
                if(last=='['){
                    if(c!=']'){
                        return false;
                    }
                }
                if(last=='{'){
                    if(c!='}'){
                        return false;
                    }
                }
            }
        }
        if(stack.isEmpty()) {
            return true;
        }else {
            return false;
        }
    }

}
