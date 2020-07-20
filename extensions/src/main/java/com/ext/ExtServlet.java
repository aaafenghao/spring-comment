package com.ext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public interface ExtServlet {

	void onStartup(ServletContext servletContext) throws ServletException;

}
