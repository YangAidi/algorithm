package test;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-20 14:17
 **/
import java.util.Scanner;

public class intToHex {

    /**
     * 先输入一个整型数字，判断其是否为0，若为0，则其16进制同样为0；
     * 若number不为0，则对16取余，并转换成16进制相应的字符；
     * number=number/16,重复过程2、3，用字符数组s依次保存每一位；
     * 输出的时候逆序输出即可
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i = 0;
        char[] S = new char[100];
        if(number == 0){
            System.out.print(0);
        }
        else{
            while(number!=0)
            {
                int t=number%16;
                if(t >=0 && t<10)
                {
                    S[i] = (char)(t+'0');
                    i++;
                }
                else
                {
                    S[i] = (char)(t+'A'-10);
                    i++;
                }
                number=number/16;
            }

            for (int j=i-1;j>=0;j--)
            {
                System.out.println(S[j]);
            }
        }
    }
}
