package commond_responsibility.com.luzhiqing.command.ls;

import commond_responsibility.com.luzhiqing.CommandVO;
import commond_responsibility.com.luzhiqing.FileManager;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/14 14:22
 */
public class LS extends AbstractLS {


    @Override
    protected String getOperateParam() {
        return DEFAULT_PARAM;
    }

    @Override
    protected String echo(CommandVO commandVO) {
        return FileManager.ls(commandVO.getData());
    }
}
