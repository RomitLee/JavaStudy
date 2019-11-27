package com.Romit.SpringStudy.Common;


import cn.hutool.http.HttpStatus;

import java.util.HashMap;

/**
 * @author 李锐(Romit.Lee)
 * @date 2019/11/26 22:46
 */
public class R extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;
    /**
     * code 成功:1 ,失败:0, 为空:-1
     */
    public R() {
        put("code", 1);
        put("msg", "success");
    }

    public static R error() {
        return error(HttpStatus.HTTP_INTERNAL_ERROR, "未知异常，请联系管理员");
    }

    public static R error(String msg) {
        return error(HttpStatus.HTTP_INTERNAL_ERROR, msg);
    }

    public static R error(int code, String msg) {
        R r = new R();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    public static R ok(String msg,Object map) {
        R r = new R();
        r.put("msg", msg);
        r.put("data", map);
        return r;
    }

    public static R ok(Object map) {
        R r = new R();
        r.put("data", map);
        return r;
    }

    public static R ok() {
        return new R();
    }

    public R put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
