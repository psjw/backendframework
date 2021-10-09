package com.code5.fw.web;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class MasterController extends HttpServlet {


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String name = req.getParameter("NAME");
        String msg = "WELCOME = " + name;

        PrintWriter out = resp.getWriter();
        out.println(msg);
    }
}
