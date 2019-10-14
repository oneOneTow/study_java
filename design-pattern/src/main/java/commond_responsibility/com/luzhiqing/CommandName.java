package commond_responsibility.com.luzhiqing;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/14 14:00
 */
public abstract class CommandName {
    private CommandName nextOperator;
    public final String handleMessage(CommandVO commandVO){
        String res = "";
        if(0 == commandVO.getParam().size()){
            res = this.echo(commandVO);
        }else {
            if(null != this.nextOperator){
                res = this.nextOperator.handleMessage(commandVO);
            }else {
                System.out.println("命令无法执行！");
            }
        }
        return res;

    }
    public void setNextOperator(CommandName nextOperator){
        this.nextOperator = nextOperator;
    }
    protected abstract String getOperateParam();
    protected abstract String echo(CommandVO commandVO);

}
