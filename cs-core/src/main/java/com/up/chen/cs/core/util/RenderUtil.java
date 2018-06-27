package com.up.chen.cs.core.util;

import com.alibaba.fastjson.JSON;
import com.up.chen.cs.core.exception.CsException;
import com.up.chen.cs.core.exception.CsExceptionEnum;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 渲染工具类
 *
 */
public class RenderUtil {

    /**
     * 渲染json对象
     */
    public static void renderJson(HttpServletResponse response, Object jsonObject) {
        try {
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            PrintWriter writer = response.getWriter();
            writer.write(JSON.toJSONString(jsonObject));
        } catch (IOException e) {
            throw new CsException(CsExceptionEnum.WRITE_ERROR);
        }
    }
}
