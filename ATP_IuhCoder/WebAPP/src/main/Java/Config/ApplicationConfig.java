package Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by lldtien on 7/3/2017.
 */
@Configuration
@ComponentScan(basePackages = {"Controller", "Models", "Service", "DataAccess"})
@PropertySource("classpath:app.properties")
public class ApplicationConfig {

    @Bean( name = "viewResolver")
    public InternalResourceViewResolver resolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/Views/");
        resolver.setSuffix(".jsp");
        return  resolver;
    }
}
