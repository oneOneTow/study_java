package commond_responsibility.com.luzhiqing;

import java.util.List;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/14 14:01
 */
public class CommandVO {
    private String commandName;
    private List<String> param;
    private String data;

    public CommandVO(String commandStr) {

    }

    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    public List<String> getParam() {
        return param;
    }

    public void setParam(List<String> param) {
        this.param = param;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
