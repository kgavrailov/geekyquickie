package hello.rest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class RepositoryRestExporterServlet extends DispatcherServlet {

	private static final long serialVersionUID = -7111253079816240018L;

	public RepositoryRestExporterServlet() {
		configure();
	}

	public RepositoryRestExporterServlet(WebApplicationContext webApplicationContext) {
		super(webApplicationContext);
		configure();
	}

	private void configure() {
		setContextClass(AnnotationConfigApplicationContext.class);
		setContextConfigLocation(RepositoryRestMvcConfiguration.class.getName());
	}

}
