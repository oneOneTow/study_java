package singleton;

/**
 * @author LuZhiqing
 * @Description:
 * @date 2018/12/10
 */
public class HungryManTwo {
    private static HungryManTwo instance;

    static {
        instance = new HungryManTwo();
    }

    private HungryManTwo() {
    }

    public static HungryManTwo getInstance() {
        return instance;
    }
}
