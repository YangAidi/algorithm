package huawei;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-08-07 19:09
 **/
public class Problem1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.hasNext();
        String s =in.next();
        if(s==null){
            return;
        }
        String[] array = s.split("@");
        if(array.length<2){
            System.out.println(s);
            return;
        }
        String[] all = array[0].split(",");
        Map<String,Integer> charMap= new HashMap<>();
        for(String chars:all){
            String[] charAndCount = chars.split(":");
            charMap.put(charAndCount[0],Integer.valueOf(charAndCount[1]));
        }
        String[] use = array[1].split(",");
        for(String chars:use){
            String[] charAndCount = chars.split(":");
            charMap.put(charAndCount[0],charMap.get(charAndCount[0])-Integer.valueOf(charAndCount[1]));
        }
        StringBuilder result= new StringBuilder();
        boolean first = true;
        for(Map.Entry<String,Integer> map:charMap.entrySet()){
            if(map.getValue()<=0){
                continue;
            }
            if(!first){
                result.append(",");
            }
            first = false;
            result.append(map.getKey()).append(":").append(map.getValue());
        }
        System.out.println(result);
    }

}
