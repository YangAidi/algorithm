package test;

import java.util.Scanner;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-20 14:32
 **/

public class Test {

    public static void main(String[]Args){
        Scanner input = new Scanner(System.in);
        int i= input.nextInt();//左区间
        int k =input.nextInt();//右区间


        int count=0;	//计数
        for(; i<k ; i++){		//设置范围
            if(isPrimeNum(i)&&fanxuNum(i)==i){  //输出条件：本身和反序数和本身相同
//                System.out.printf("%3d   ",i);
                count++;
//                if(count%7==0){		//满七个数 	换行
//                    System.out.println();
//                }
            }
        }

        System.out.println(count);

    }
    public static boolean isPrimeNum(int a){		//判断是否是素数
        for(int i=2 ; i<=Math.sqrt(a) ; i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
    public static int fanxuNum(int a){			//求反序数
        int length1 = (a+"").length();
        if(length1==1){
            return a;
        }
        if(length1==2){
            int x = a/10;
            int y = a%10;
            return y*10+x;
        }
        else{
            int x = a/100;
            int y = a/10%10;
            int z = a%10;
            return x+y*10+z*100;
        }
    }

}
