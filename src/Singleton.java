/**
 * @program: LintCode
 * @author: YangAidi
 * @create: 2019-09-05 10:17
 **/
public class Singleton {
    private static Singleton ourInstance = new Singleton();

    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
    }
}
