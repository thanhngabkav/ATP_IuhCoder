package Config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by lldtien on 7/3/2017.
 */
public class InitializerConfig implements WebApplicationInitializer {
    public void onStartup(ServletContext servletContext) throws ServletException {

        AnnotationConfigWebApplicationContext applicationContext = registerConfig();
        dispatcherServlets(servletContext, applicationContext);
        addServletListener(servletContext, applicationContext);
        charatorFilter(servletContext);
    }

    private AnnotationConfigWebApplicationContext registerConfig() {
        AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
        applicationContext.register(ApplicationConfig.class);
        return applicationContext;
    }

    private void dispatcherServlets(ServletContext servletContext, AnnotationConfigWebApplicationContext applicationContext) {
        ServletRegistration.Dynamic dynamic = servletContext.addServlet("SpringDispatcher", new DispatcherServlet(applicationContext));
        dynamic.setLoadOnStartup(1);
        dynamic.addMapping("/");
        dynamic.setInitParameter("contextClass", applicationContext.getClass().getName());
    }

    private void addServletListener(ServletContext servletContext, AnnotationConfigWebApplicationContext applicationContext) {
        servletContext.addListener(new ContextLoaderListener(applicationContext));
    }

    private void charatorFilter(ServletContext servletContext) {
        FilterRegistration.Dynamic filterRegistration = servletContext.addFilter("endcodingFilter", CharacterEncodingFilter.class);
        filterRegistration.setInitParameter("encoding","UTF-8");
        filterRegistration.setInitParameter("forceEncoding","true");
        filterRegistration.addMappingForUrlPatterns(null,true,"/*");
    }


}
