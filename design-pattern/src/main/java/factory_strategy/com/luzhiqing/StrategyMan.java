package factory_strategy.com.luzhiqing;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/14 16:20
 */
public enum StrategyMan {
    SteadyDeduction(""),FreeDeduction("");
    private String value;

    StrategyMan(String value) {
        this.value = value;
    }
    public String getValue(){
        return this.value;
    }

}
