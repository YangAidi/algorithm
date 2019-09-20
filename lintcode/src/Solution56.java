import java.lang.reflect.Array;
import java.util.*;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2018-03-28 17:36
 **/
public class Solution56 {
    /**
     * @return: [index1 + 1, index2 + 1] (index1 < index2)
     */
        class Pair {
            Integer value;
            Integer index;

            Pair(Integer value, Integer index) {
                this.value = value;
                this.index = index;
            }
            Integer getValue() {
                return this.value;
            }
        }

        class ValueComparator implements Comparator<Pair> {

            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        }
        public int[] twoSum(int[] numbers, int target) {
            // write your code here

            Pair[] number = new Pair[numbers.length];
            for(int i=0;i<numbers.length;i++) {
                number[i] = new Pair(numbers[i], i);
            }
            Arrays.sort(number, new ValueComparator());
            int L=0, R =  numbers.length-1;
            while(L<R) {
                if( number[L].getValue() + number[R].getValue() == target) {
                    int t1 = number[L].index;
                    int t2 = number[R].index;
                    return new int[]{Math.min(t1,t2), Math.max(t1,t2)};
                }
                if( number[L].getValue() + number[R].getValue() < target) {
                    L++;
                } else {
                    R--;
                }
            }
            return new int[]{};
        }
//    public int[] twoSum(int[] numbers, int target) {
//        // write your code here
//        if(numbers.length==2)return new int[]{0,1};
//        TreeMap<Integer,Integer> m= new TreeMap<>();
//        int i=0;
//        for(int number:numbers){
//            m.put(i++,number);
//        }
//
////        while (m.lastKey()>target) {
////            m.remove(m.lastKey());
////        }
//        while (true)
//        {
//            if(m.get(m.lastKey())+m.get(m.firstKey())==target)
//                break;
//            if(m.get(m.lastKey())+m.get(m.firstKey())>target){
//                m.remove(m.lastKey());
//            }else
//            {
//                m.remove(m.firstKey());
//            }
//        }
//        return m.firstKey()<m.get(m.lastKey())?new int[]{m.get(m.firstKey()),m.get(m.lastKey())}:new int[]{m.get(m.lastKey()),m.get(m.firstKey())};
//    }
}
