import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-04-16 10:31
 **/
import java.util.ArrayList;
import java.util.List;

public class TX {
    public static void main(String[] args) {
        int n = 5;
        int[] a= new int[]{1,2,3,2,5};
        int[] b= new int[20000];
        int offset=0;
        for(int i=0;i<n;++i){
            ++b[a[i]+offset];
        }
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        for(int i=0;i<b.length;++i)
        {
            if(b[i]>1){
                l1.add(b[i]-offset);
            }else if(b[i]==0){
                l2.add(b[i]-offset);
            }
        }
        int sum =0;
        for(int i=0;i<l1.size();++i){
            sum+= Math.abs(l2.get(i) - l1.get(i));
        }
        System.out.println(sum);
    }
}


