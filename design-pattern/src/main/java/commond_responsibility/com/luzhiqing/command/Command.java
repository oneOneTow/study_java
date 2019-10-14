package commond_responsibility.com.luzhiqing.command;

import commond_responsibility.com.luzhiqing.ClassUtils;
import commond_responsibility.com.luzhiqing.CommandVO;
import commond_responsibility.com.luzhiqing.CommandName;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/14 13:59
 */
public abstract class Command {
    protected abstract String execute(CommandVO commandVO);
    protected final List<? extends CommandName> buildChain(Class<? extends CommandName> abstractClass){
        List<Class> clazzes = ClassUtils.getSonClass(abstractClass);
        List<CommandName> commandNames = new ArrayList<CommandName>();
        for(Class clazz : clazzes){
            CommandName commandName = null;
            try {
                commandName = (CommandName) Class.forName(clazz.getName()).newInstance();
            } catch (Exception e) {
            }
            if(commandNames.size()>0){
                commandNames.get(commandNames.size()-1).setNextOperator(commandName);
            }
            commandNames.add(commandName);
        }
        return commandNames;
    }

}
