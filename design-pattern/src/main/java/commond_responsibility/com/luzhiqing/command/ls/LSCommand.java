package commond_responsibility.com.luzhiqing.command.ls;

import commond_responsibility.com.luzhiqing.CommandVO;
import commond_responsibility.com.luzhiqing.CommandName;
import commond_responsibility.com.luzhiqing.command.Command;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/14 14:50
 */
public class LSCommand extends Command {
    @Override
    protected String execute(CommandVO commandVO) {
        CommandName firstNode = super.buildChain(AbstractLS.class).get(0);
        return firstNode.handleMessage(commandVO);
    }
}
