package io.arukas.utils;

import org.json.JSONObject;

/**
 * Created by Administrator on 20/06/2017.
 */
public class JsonResult {

    /**
     * 返回json格式数据
     * @param status
     * @param message
     * @param result
     * @return
     */
    public static String fillResultString(Integer status, String message, Object result){
        JSONObject jsonObject = new JSONObject(){{
            put("status", status);
            put("message", message);
            put("result", result);
        }};
        return jsonObject.toString();
    }

}
