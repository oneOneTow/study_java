package factory_strategy.com.luzhiqing;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/14 16:18
 */
public class StrategyFactory {
    public static Deduction getDeduction(StrategyMan strategy){
        Deduction deduction = null;
        try {
            deduction = (Deduction)Class.forName(strategy.getValue()).newInstance();
        } catch (Exception e) {

        }
        return deduction;
    }

}
