package singleton;

/**
 * @author LuZhiqing
 * @Description:
 * @date 2018/12/10
 */
public class SlackerThree {
    private static SlackerThree slackerTwo;
    private SlackerThree(){}
    public static  SlackerThree getInstance(){
        if(slackerTwo==null){
            synchronized (SlackerThree.class) {
                slackerTwo=new SlackerThree();
            }
        }
        return slackerTwo;
    }
}
