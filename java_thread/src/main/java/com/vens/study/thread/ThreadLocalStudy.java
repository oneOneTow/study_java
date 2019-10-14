package com.vens.study.thread;

/**
 * @author LuZhiqing
 * @Description:
 * @date 2018/12/10
 */
public class ThreadLocalStudy {
    private ThreadLocal<Integer> name = new ThreadLocal<>();

    public ThreadLocal<Integer> getName() {
        return name;
    }

    public void setName(ThreadLocal<Integer> name) {
        this.name = name;
    }

    public static void main(String[] args) {
//        ThreadLocalStudy threadLocalStudy = new ThreadLocalStudy();
//        Thread t = new Thread() {
//            @Override
//            public void run() {
//                threadLocalStudy.getName().set(50);
//                int i = 0;
//                while (i < 20) {
//                    int a = threadLocalStudy.getName().get() - i;
//                    threadLocalStudy.getName().remove();
//                    i++;
//                }
//                threadLocalStudy.getName().get();
//            }
//        };
//        t.start();
        ABS abs = new ABS();
        ABS2 abs2 = new ABS2();
        abs2.field = "skdhfjksdf";
        abs.field = abs2;
        ABS2 a= abs.field;
        abs.field = null;
        System.out.println(a);
        System.out.println(abs.field);
    }

}
class ABS{
    public ABS2 field;
}
class ABS2{
    public String field;

    @Override
    public String toString() {
        return super.toString();
    }
}
