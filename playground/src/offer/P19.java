package offer;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-08-05 15:28
 **/
public class P19 {

    public boolean match(char[] str, char[] pattern) {
        if (str == null || pattern == null) {
            return false;
        }

        return match(str, 0, pattern, 0);
    }

    private boolean match(char[] str, int strIndex, char[] pattern, int patternIndex) {
        if (strIndex == str.length && patternIndex == pattern.length) {
            return true;
        }
        if (patternIndex == pattern.length) {
            return false;
        }

        int patternNextIndex = patternIndex + 1;

        // 模式下一个字符为'*'
        if (patternNextIndex < pattern.length && pattern[patternNextIndex] == '*') {
            // str已经走到结尾 || str的字母不等于pattern的字母
            if (strIndex == str.length ||
                    (str[strIndex] != pattern[patternIndex] && pattern[patternIndex] != '.')) {
                return match(str, strIndex, pattern, patternIndex + 2);
            } else {
                // 这里只需要递归一次就可以了，如果匹配上了，让str前进一位继续和模式串匹配
                return match(str, strIndex + 1, pattern, patternIndex);
            }
        }
        // 模式下一个字符不为'*' && str走到了结尾
        else if (strIndex == str.length) {
            return false;
        } else if (str[strIndex] == pattern[patternIndex] || pattern[patternIndex] == '.') {
            return match(str, strIndex + 1, pattern, patternIndex + 1);
        }

        return false;
    }
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
    }

    /**
     * 功能测试
     * 0. 没有'.'和'*'
     * 1. '.'
     * 2. '.' + '*'
     * 3. '*'匹配0次
     * 4. '*'匹配多次
     * 5. '*'匹配一次
     */
    private static void test1() {
        P19 rem = new P19();
        boolean b = rem.match(new char[] {'a','a','b','c'}, new char[] {'a','a','b','c'});
        System.out.println(b);

        b = rem.match(new char[] {'a','a','a','b'}, new char[] {'a','.','.','.'});
        System.out.println(b);

        b = rem.match(new char[] {'a','a','a','b'}, new char[] {'a','.','*'});
        System.out.println(b);

        b = rem.match(new char[] {'a','b'}, new char[] {'a','a','*','b'});
        System.out.println(b);

        b = rem.match(new char[] {'a','b'}, new char[] {'a','b', '*'});
        System.out.println(b);

        b = rem.match(new char[] {'a','a','a','b'}, new char[] {'a','*','b'});
        System.out.println(b);

        System.out.println("====================================================");
    }

    /**
     * 功能测试
     * 0. 没有'.'和'*'
     * 1. '.'
     * 2. '.' + '*'
     * 3. '*'匹配0次
     * 4. '*'匹配多次
     * 5. '*'匹配一次
     */
    private static void test2() {
        P19 rem = new P19();
        boolean b = rem.match(new char[] {'a','a','b','c'}, new char[] {'a','a','b'});


        b = rem.match(new char[] {'a','a','a','b'}, new char[] {'a','.','.'});


        b = rem.match(new char[] {'a','a','a','b'}, new char[] {'a','.','*','c'});


        b = rem.match(new char[] {'a','b'}, new char[] {'a','a','*'});


        b = rem.match(new char[] {'a','b'}, new char[] {'a','b', '*','c'});


        b = rem.match(new char[] {'a','a','a','b'}, new char[] {'a','*'});

        System.out.println("====================================================");
    }

    /**
     * 边界测试
     * 1. '1' - '1'
     * 2. '1' - '.'
     * 3. '1' - '1','*'
     * 4. '1' - '.','*'
     */
    private static void test3() {
        P19 rem = new P19();
        boolean b = rem.match(new char[] {'1'}, new char[] {'1'});

        b = rem.match(new char[] {'1'}, new char[] {'.'});

        b = rem.match(new char[] {'1'}, new char[] {'1','*'});

        b = rem.match(new char[] {'1'}, new char[] {'.','*'});
        System.out.println("====================================================");
    }

    /**
     * 极端测试
     */
    private static void test4() {
        P19 rem = new P19();
        boolean b = rem.match(null, new char[] {'1'});

        b = rem.match(new char[] {'1'}, null);

        b = rem.match(null, null);
    }

}
