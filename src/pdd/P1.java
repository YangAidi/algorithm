//package pdd;
//
///**
// * @program: LintCode
// * @author: YangAidi
// * @create: 2019-08-11 16:28
// **/
//package pdd; /**
// * @program: LintCode
// * @author: YangAidi
// * @create: 2019-08-07 16:54
// **/
//
//import java.text.DecimalFormat;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; ++i) {
//            a[i] = in.nextInt();
//        }
//        Arrays.sort(a);
//        double min = Double.MAX_VALUE;
//        for (int i = 2; i < n; ++i) {
//            double avg = (a[i]+a[i-1]+a[i-2])/3.0;
//            double res = (Math.abs(a[i] - avg) * Math.abs(a[i] - avg)+Math.abs(a[i-1] - avg) * Math.abs(a[i-1] - avg)+Math.abs(a[i-2] - avg) * Math.abs(a[i-2] - avg))/3;
//            if(res<min){
//                min =res;
//            }
//        }
//        DecimalFormat df=new DecimalFormat("#,##0.00");
//        System.out.println(df.format(min));
//    }
//}
