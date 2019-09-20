import java.util.ArrayList;
import java.util.List;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-20 00:33
 **/
public class Solution17B {

        private String letterMap[] = {
                " ",    //0
                "",     //1
                "abc",  //2
                "def",  //3
                "ghi",  //4
                "jkl",  //5
                "mno",  //6
                "pqrs", //7
                "tuv",  //8
                "wxyz"  //9
        };

        private ArrayList<String> res;

        public List<String> letterCombinations(String digits) {

            res = new ArrayList<String>();
            if("".equals(digits)) {
                return res;
            }

            findCombination(digits, 0, "");
            return res;
        }

        private void findCombination(String digits, int index, String s){

            if(index == digits.length()){
                res.add(s);
                return;
            }
            char c = digits.charAt(index);
            String letters = letterMap[c - '0'];
            for(int i = 0 ; i < letters.length() ; i ++){
                findCombination(digits, index+1, s + letters.charAt(i));
            }
        }

    }
