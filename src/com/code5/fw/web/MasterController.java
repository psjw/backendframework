package com.code5.fw.web;


import com.code5.biz.welcome.Welcome;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.io.IOException;

public class MasterController extends HttpServlet {


    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Welcome welcome = new Welcome();

        String jspUrl = welcome.execute(request);

        RequestDispatcher dispatcher = request.getRequestDispatcher(jspUrl);
        dispatcher.forward(request, response);
    }
}
