package commond_responsibility.com.luzhiqing;

import commond_responsibility.com.luzhiqing.command.Command;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/14 13:59
 */
public class Invoker {
    public String exec(String commandStr){
        String res = "";
        CommandVO commandVO = new CommandVO(commandStr);
        if(CommandEnum.getNames().contains(commandVO.getCommandName())){
            String className = CommandEnum.valueOf(commandVO.getCommandName()).getValue();
            Command command;
            try {
                command = (Command) Class.forName(className).newInstance();
                res = command.execute(commandVO);
            } catch (Exception e) {

            }

        }
        return res;
    }
}
