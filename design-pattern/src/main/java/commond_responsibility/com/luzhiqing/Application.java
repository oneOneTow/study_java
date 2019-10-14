package commond_responsibility.com.luzhiqing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/14 15:03
 */
public class Application {
    public static void main(String[] args) throws IOException {
        Invoker invoker = new Invoker();
        while(true){
            System.out.print("#");
            String input = (new BufferedReader(new InputStreamReader(System.in))).readLine();
            if(input.equals("quit") || input.equals("exit")){
                return;
            }
            System.out.println(invoker.exec(input));
        }
    }

}
