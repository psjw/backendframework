package com.code5.fw.web;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import java.util.Arrays;
import java.util.ResourceBundle;

public class RunCode5ByResourceBundle {
    public static void main(String[] args) throws LifecycleException {
        String classpath = System.getProperty("java.class.path");
        String[] classpathes = classpath.split(";");

        Arrays.stream(classpathes).forEach(System.out::println);

        //// classpaths[] + /com/code5/fw/init.properties
        ResourceBundle init = ResourceBundle.getBundle("com.code5.fw.init");

        String webappDir = init.getString("webappDir");
        String baseDir = init.getString("baseDir");
        int webPort = Integer.parseInt(init.getString("webPort"));

        Tomcat tomcat = new Tomcat();

        tomcat.addWebapp("", webappDir);

        // baseDir +  /WEB-INF/web.xml
        tomcat.setBaseDir(baseDir);

        tomcat.setPort(webPort);

        tomcat.start();
        System.out.println("Tomcat Start");
        tomcat.getServer().await();
    }
}
