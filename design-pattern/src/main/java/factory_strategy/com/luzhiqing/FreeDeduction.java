package factory_strategy.com.luzhiqing;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/14 15:41
 */
public class FreeDeduction implements Deduction{
    public boolean execute(Card card, Trade trade) {
        return false;
    }
}
