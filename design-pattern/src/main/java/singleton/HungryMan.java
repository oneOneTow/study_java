package singleton;

/**
 * @author LuZhiqing
 * @Description: 饿汉式
 * 线程安全
 * 容易产生垃圾，因为一开始就初始化
 * @date 2018/12/10
 */
public class HungryMan {
    private final static HungryMan instance = new HungryMan();

    private String des;

    private HungryMan() {
        this.des = "vens";
    }

    public static HungryMan getInstance() {
        return instance;
    }
}
