package com.dezhonger.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Dezhonger on 2017/2/12.
 */
public class ControllerUtil {

    public static final String COOKIE_DOMAIN = "";

    public static String getCookieValue(HttpServletRequest request, String name) {
        if (!StringUtil.isEmpty(name) && request != null && request.getCookies() != null) {
            for (Cookie cookie : request.getCookies()) {
                if (name.equals(cookie.getName())) {
                    return cookie.getValue();
                }
            }
        }
        return null;
    }

    public static void addCookie(HttpServletResponse response, String cookieName, String value,
                                 int maxAge) {
        Cookie cookie = new Cookie(cookieName, value);
        cookie.setPath("/");
        cookie.setDomain(COOKIE_DOMAIN);
        cookie.setMaxAge(maxAge);
        response.addCookie(cookie);
    }

    public static void delCookie(HttpServletResponse response, String cookieName) {
        Cookie cookie = new Cookie(cookieName, "");
        cookie.setPath("/");
        cookie.setDomain(COOKIE_DOMAIN);
        cookie.setMaxAge(0);
        response.addCookie(cookie);
    }
}
