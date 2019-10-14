package observe.com.luzhiqing;

import java.util.Observable;
import java.util.Observer;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/12 18:41
 */
public class ObservableImpl extends Observable implements Operater{

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
    }

    public void operate() {
        System.out.println("干了某事。。。。");
        this.notifyObservers();
    }
}
