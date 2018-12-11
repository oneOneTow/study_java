package com.vens.interface_difine;

/**
 * @author LuZhiqing
 * @Description:
 * @date 2018/11/8
 */
public class PageResultBean <T>{
    private static final long serialVersionUID = 1L;

    public static final int SUCCESS = 0;

    public static final int FAIL = 1;

    public static final int NO_PERMISSION = 2;

    private String msg = "success";

    private int code = SUCCESS;

    private T data;

    private int count;

    private int pageNum;

    public PageResultBean() {
        super();
    }

    public PageResultBean(T data) {
        super();
        this.data = data;
    }

    public PageResultBean(Throwable e) {
        super();
        this.msg = e.toString();
        this.code = FAIL ;
    }
}
