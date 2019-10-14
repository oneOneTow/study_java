package observe.com.luzhiqing;

import java.util.Observable;
import java.util.Observer;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/12 18:42
 */
public class ObserverImpl implements Observer {
    public void update(Observable o, Object arg) {
        System.out.println("监听。。。。。");
    }
}
