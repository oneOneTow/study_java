package factory_strategy.com.luzhiqing;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/14 15:50
 */
public class DeductionContext {
    private Deduction deduction;

    public DeductionContext(Deduction deduction) {
        this.deduction = deduction;
    }

    public boolean exec(Card card, Trade trade){
        return this.deduction.execute(card,trade);
    }
}
