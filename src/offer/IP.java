package offer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-15 14:37
 **/
public class IP {

    public static void main(String[] args)
    {
        System.out.println(-2>>1);
        Lock lock = new ReentrantLock();

        String ip = "172.185.255.233";

        //step1: 分解IP字符串，并对应写对字节数组
        byte[] ip1 = ipToBytes(ip);

        //step2: 对字节数组里的每个字节进行左移位处理，分别对应到整型变量的4个字节
        int ip2 = bytesToInt(ip1);
        System.out.println("整型ip ----> " + ip2);

        //对整型变量进行右位移处理，恢复IP字符串
        String ip3 = intToIp(ip2);
        System.out.println("字符串ip---->"+ip3);
        HashMap hashMap = new HashMap();

    }

    /**
     * 第一步，把IP地址分解为一个btye数组
     *
     * @param ipAddr
     * @return int
     */
    public static byte[] ipToBytes(String ipAddr)
    {
        //初始化字节数组，定义长度为4
        byte[] ret = new byte[4];
        try
        {
            //使用关键字"." 分割字符串数组
            String[] ipArr = ipAddr.split("\\.");

            //将字符串数组依次写入字节数组
            ret[0] = (byte) (Integer.parseInt(ipArr[0]));
            ret[1] = (byte) (Integer.parseInt(ipArr[1]));
            ret[2] = (byte) (Integer.parseInt(ipArr[2]));
            ret[3] = (byte) (Integer.parseInt(ipArr[3]));
            return ret;
        } catch (Exception e)
        {
            throw new IllegalArgumentException("invalid IP : "+ipAddr);
        }
    }

    /**
     * 根据位运算把 byte[] -> int
     *
     * 原理：将每个字节强制转化为8位二进制码，然后依次左移8位，对应到Int变量的4个字节中
     *
     * @param bytes
     * @return int
     */
    public static int bytesToInt(byte[] bytes)
    {
        //初始化Int变量addr=0
        int addr = 0;
        //强制转化为8位二进制码，比如原码是101，强转后00000101
        addr |= (bytes[0] & 0xFF);
        //左移8位，得到00000101 00000000，给下个字节的拼接创造环境（预留8位0，方便用|进行拼接）
        addr = addr << 8;
        //强制转化为8位二进制码，比如原码是10101，强转后00010101,和00000101 00000000进行或运算后得到00000101 00010101
        addr |=(bytes[1] & 0xFF);
        //左移8位，得到00000101 00010101 00000000
        addr = addr << 8;
        //强制转化为8位二进制码，比如原码是111，强转后00000111,和00000101 00010101 00000000进行或运算后得到00000101 00010101 00000111
        addr |= (bytes[2] & 0xFF);
        //左移8位，得到00000101 00010101 00000111 00000000
        addr = addr << 8;
        //强制转化为8位二进制码，比如原码是1，强转后00000001,和00000101 00010101 00000111 00000000进行或运算后得到00000101 00010101 00000111 00000001
        addr |= ((bytes[3]) & 0xFF);
        //拼接结束，返回int变量
        return addr;

//      优化之后的写法，原理相同，不过是先移位后直接强转的同时指定位数
//      int addr = bytes[3] & 0xFF;
//      addr |= ((bytes[2] << 8) & 0xFF00);
//      addr |= ((bytes[1] << 16) & 0xFF0000);
//      addr |= ((bytes[0] << 24) & 0xFF000000);
//      return addr;

    }


    /**
     * 把int->string地址
     * @param ipInt
     * @return String
     */
    public static String intToIp(int ipInt) {
        return //右移3个字节（24位），得到IP地址的第一段也就是int变量的第一个字节（从左边算起）
                String.valueOf((ipInt >>> 24) & 0xFF) + '.' +
                        //右移2字节（16位），得到int变量的第一和第二个字节（从左边算起），经过&0xFF处理得到后8位也就是byte[1]
                        ((ipInt >>> 16) & 0xFF) + '.' +
                        //同理如上
                        ((ipInt >>> 8) & 0xFF) + '.' +
                        //同理如上
                        (ipInt & 0xFF);

//        第二种，先强转二进制，再进行移位处理
//        return new StringBuilder()
//                .append(((ipInt & 0xFF000000) >> 24) & 0xFF).append('.')   //右移3个字节（24位），得到IP地址的第一段也就是byte[0],为了防止符号位是1也就是负数，最后再一次& 0xFF
//                .append((ipInt & 0xFF0000) >> 16).append('.')
//                .append((ipInt & 0xFF00) >> 8).append('.')
//                .append((ipInt & 0xFF))
//                .toString();
    }
}
