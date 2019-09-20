import java.util.*;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-20 00:09
 **/
class Solution17 {
    public List<String> letterCombinations(String digits) {
        if(digits==null||digits.length()==0){
            return new ArrayList<>();
        }

        for(int i=0;i<digits.length();++i)
        {
            char cs = digits.charAt(i);
            Set<String> res2 = new HashSet<>();
            for (String c : map.get(cs)) {
                if(res.isEmpty()){
                        res2.add(c);

                }else {
                    for (String s : res) {
                        res2.add(s + c);
                    }
                }
            }
            res =res2;
        }
        return new ArrayList<>(res);

//        dfs(digits, 0, "");
//        return res;
    }

    public void dfs(String s, int i, String pre) {
        if (i == s.length()) {
            res.add(pre);
            return;
        }
        char cs = s.charAt(i);
        for (String c : map.get(cs)) {
            dfs(s, i + 1, pre + c);
        }
    }

    private Map<Character, List<String>> map = new HashMap<Character, List<String>>() {
        {
            put('2', new ArrayList<String>() {
                {
                    add("a");
                    add("b");
                    add("c");
                }
            });
            put('3', new ArrayList<String>() {
                {
                    add("d");
                    add("e");
                    add("f");
                }
            });
            put('4', new ArrayList<String>() {
                {
                    add("g");
                    add("h");
                    add("i");
                }
            });
            put('5', new ArrayList<String>() {
                {
                    add("j");
                    add("k");
                    add("l");
                }
            });
            put('6', new ArrayList<String>() {
                {
                    add("m");
                    add("n");
                    add("o");
                }
            });
            put('7', new ArrayList<String>() {
                {
                    add("p");
                    add("q");
                    add("r");
                    add("s");
                }
            });
            put('8', new ArrayList<String>() {
                {
                    add("t");
                    add("u");
                    add("v");
                }
            });
            put('9', new ArrayList<String>() {
                {
                    add("w");
                    add("x");
                    add("y");
                    add("z");
                }
            });
        }
    };

    private Set<String> res = new HashSet<>();
}
