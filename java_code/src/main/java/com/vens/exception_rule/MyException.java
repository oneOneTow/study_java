package com.vens.exception_rule;

/**
 * @author LuZhiqing
 * @Description:
 * @date 2018/11/8
 */
public class MyException extends RuntimeException{
    public MyException(){}
    public MyException(String msg){
        super(msg);
    }
    public MyException(Throwable cause){
        super(cause);
    }
    public MyException(String msg,Throwable cause){
        super(msg,cause);
    }
    public MyException(String message, Throwable cause,
                       boolean enableSuppression,
                       boolean writableStackTrace){
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
class OtherException extends Exception{
    public OtherException(){}
    public OtherException(String msg){

        super(msg);
    }

}
class Test{
    /**
     * �̳�RuntimeException����Ҫ�������粻��Ҫ��testOneʹ��thows
     */
    public void testOne(){
        throw new MyException("RuntimeException");
    }

    /**
     * �̳�Exception��Ҫ����
     * @throws Exception
     */
    public void testTwo() throws Exception{
        throw new OtherException("Exception");
    }
    public static void main(String[] args) {
        Test t=new Test();
        try{
            t.testOne();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try{
            t.testTwo();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
