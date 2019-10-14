package commond_responsibility.com.luzhiqing.command.ls;

import commond_responsibility.com.luzhiqing.CommandVO;
import commond_responsibility.com.luzhiqing.FileManager;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/14 14:32
 */
public class LS_A extends AbstractLS {
    @Override
    protected String getOperateParam() {
        return A_PARAM;
    }

    @Override
    protected String echo(CommandVO commandVO) {
        return FileManager.ls_a(commandVO.getData());
    }
}
