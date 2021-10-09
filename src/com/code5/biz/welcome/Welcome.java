package com.code5.biz.welcome;


import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

public class Welcome {

    public String execute(HttpServletRequest request) {

        String NAME = request.getParameter("NAME");

        String MSG = "WELCOME = " + NAME;

        request.setAttribute("msg", MSG);

        return "/WEB-INF/classes/com/code5/biz/welcome/welcome.jsp";
    }

}
