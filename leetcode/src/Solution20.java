import java.util.Stack;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-10-16 23:41
 **/
class Solution20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if(c=='('||c=='['||c=='{'){
                stack.add(c);
            }else {
                if(stack.isEmpty()){
                    return false;
                }
                char cc =stack.pop();
                if(c==')'){
                    if(cc!='('){
                        return false;
                    }
                }
                if(c=='}'){
                    if(cc!='{'){
                        return false;
                    }
                }
                if(c==']'){
                    if(cc!='['){
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
