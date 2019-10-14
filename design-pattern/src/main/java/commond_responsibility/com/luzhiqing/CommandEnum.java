package commond_responsibility.com.luzhiqing;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/14 14:01
 */
public enum CommandEnum {
    ls("LSCommand");

    private String value = "";

     CommandEnum(String value){
        this.value = value;
    }
    public String getValue(){
        return this.value;
    }
    public static List<String> getNames(){
        CommandEnum[] commandEnum = CommandEnum.values();
        List<String> names = new ArrayList<String>();
        for(CommandEnum c:commandEnum){
            names.add(c.name());
        }
        return names;
    }

}
