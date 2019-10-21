package singleton;

/**
 * @author LuZhiqing
 * @Description: 线程安全
 * 延迟初始化
 * 安全且在多线程情况下能保持高性能
 * @date 2018/12/10
 */
public class DoubleCheck {

    /**
     * 由于singleton=new Singleton()对象的创建在JVM中可能会进行重排序，
     * 在多线程访问下存在风险，使用volatile修饰signleton实例变量有效，解决该问题
     */
    private volatile static DoubleCheck doubleCheck;

    private DoubleCheck() {
    }

    public static DoubleCheck getInstance() {
        if (doubleCheck == null) {
            synchronized (SlackerThree.class) {
                if (doubleCheck == null) {
                    doubleCheck = new DoubleCheck();
                }
            }
        }
        return doubleCheck;
    }
}
