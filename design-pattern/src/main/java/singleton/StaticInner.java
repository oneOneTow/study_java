package singleton;

/**
 * @author LuZhiqing
 * @Description: 内部枚举类
 * 只有第一次调用getInstance方法时，虚拟机才加载 Inner 并初始化instance ，
 * 只有一个线程可以获得对象的初始化锁，其他线程无法进行初始化，保证对象的唯一性。
 * 目前此方式是所有单例模式中最推荐的模式，但具体还是根据项目选择。
 * @date 2018/12/10
 */
public class StaticInner {
    private StaticInner() {
    }

    private static class SingletonInstance {
        private static final StaticInner instance = new StaticInner();
    }

    public static StaticInner getInsance() {
        return SingletonInstance.instance;
    }
}
