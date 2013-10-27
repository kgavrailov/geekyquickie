package hello.rest;

import hello.Application;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class RestWebXml implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext)
			throws ServletException {
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register(Application.class);
		servletContext.addListener(new ContextLoaderListener(rootContext));

		RepositoryRestExporterServlet exporter = new RepositoryRestExporterServlet();
		Dynamic reg = servletContext.addServlet("exporter", exporter);
		
		reg.setLoadOnStartup(1);
		reg.addMapping("/*");
	}

}
