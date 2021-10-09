package com.code5.fw.web;

import com.biz.board.BoardServlet;
import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.http.HttpServlet;
import java.io.File;

/**
 * @author zero
 *
 */
public class RunCode5BySimple {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		String root = new File(".").getAbsolutePath();

		String baseDir = root + File.separatorChar + "temp";

		int webPort = 18080;

		Tomcat tomcat = new Tomcat();
		tomcat.setPort(webPort);

		tomcat.setBaseDir(baseDir);
		tomcat.setPort(webPort);

		Context context = tomcat.addContext("/", baseDir);

		HttpServlet board = new BoardServlet();

		//http://localhost:18080/board?mode=callList
		tomcat.addServlet("/", "board", board);
		context.addServletMappingDecoded("/board", "board");

		tomcat.start();
		tomcat.getServer().await();

	}
}
