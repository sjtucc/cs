package com.up.chen.cs.core.base.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.up.chen.cs.core.base.tips.SuccessTip;
import com.up.chen.cs.core.base.wapper.BaseControllerWarpper;
import com.up.chen.cs.core.page.PageInfoBT;
import com.up.chen.cs.core.support.HttpKit;
import com.up.chen.cs.core.util.FileUtil;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;

/**
 * @Description:
 * @author chenchen
 * @date 2018/6/26 14:25
 */
public class BaseController {
    protected static String SUCCESS = "SUCCESS";
    protected static String ERROR = "ERROR";

    protected static String REDIRECT = "redirect:";
    protected static String FORWARD = "forward:";

    protected static SuccessTip SUCCESS_TIP = new SuccessTip();

    protected HttpServletRequest getHttpServletRequest() {
        return HttpKit.getRequest();
    }

    protected HttpServletResponse getHttpServletResponse() {
        return HttpKit.getResponse();
    }

    protected HttpSession getSession() {
        return getHttpServletRequest().getSession();
    }

    protected HttpSession getSession(Boolean flag) {
        return getHttpServletRequest().getSession(flag);
    }

    protected String getPara(String name) {
        return getHttpServletRequest().getParameter(name);
    }

    protected void setAttr(String name, Object value) {
       getHttpServletRequest().setAttribute(name, value);
    }
    protected Integer getSystemInvokCount() {
        return (Integer) getHttpServletRequest().getServletContext().getAttribute("systemCount");
    }

    /**
     * 把service层的分页信息，封装为bootstrap table通用的分页封装
     */
    protected <T> PageInfoBT<T> packForBT(Page<T> page) {
        return new PageInfoBT<T>(page);
    }

    /**
     * 包装一个list，让list增加额外属性
     */
    protected Object warpObject(BaseControllerWarpper warpper) {
        return warpper.warp();
    }

    /**
     * 删除cookie
     */
    protected void deleteCookieByName(String cookieName) {
        Cookie[] cookies = this.getHttpServletRequest().getCookies();
        for(Cookie cookie : cookies) {
            if(cookie.getName().equals(cookieName)) {
                Cookie tmp = new Cookie(cookieName, "");
                tmp.setMaxAge(0);
                this.getHttpServletResponse().addCookie(tmp);
            }
        }
    }

    /**
     * 返回前台文件流
     */
    protected ResponseEntity<byte[]> renderFile(String fileName, String filePath) {
        byte[] bytes = FileUtil.toByteArray(filePath);
        return renderFile(fileName, bytes);
    }

    /**
     * 返回前台文件流
     *
     */
    protected ResponseEntity<byte[]> renderFile(String fileName, byte[] fileBytes) {
        String dfileName = null;
        try {
            dfileName = new String(fileName.getBytes("gb2312"), "iso8859-1");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        headers.setContentDispositionFormData("attachment", dfileName);
        return new ResponseEntity<byte[]>(fileBytes, headers, HttpStatus.CREATED);
    }
}
