package me.chillgu;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;

public class HelloServlet extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		System.out.println("[servlet]: init");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ApplicationContext context = (ApplicationContext)getServletContext()
						.getAttribute(WebApplicationContext
						.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
		
		HelloService service = context.getBean(HelloService.class);
		
		System.out.println("[servlet]: doGet");
		resp.getWriter().println("<html>");
		resp.getWriter().println("<head>");
		resp.getWriter().println("<body>");
		resp.getWriter().println("Hello Servlet!" + service.getName("chilloutgu"));
		resp.getWriter().println("</body>");
		resp.getWriter().println("</head>");
		resp.getWriter().println("</html>");
	}
	
	@Override
	public void destroy() {
		System.out.println("[servlet]: destroy");
	}
	
}
