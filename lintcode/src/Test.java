/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-08-26 16:48
 **/
public class Test {

    byte[] memoryHog = new byte[1024 * 1024];

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalizing " + this + " in thread " + Thread.currentThread());
//        for (;;) {
            Thread.sleep(1000);
//        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Test();
        }
        System.out.println(Thread.currentThread());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
