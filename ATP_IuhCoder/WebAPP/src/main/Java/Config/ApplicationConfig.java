package Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by lldtien on 7/3/2017.
 */
@Configuration
@ComponentScan({"Controller", "Models", "Service", "DataAccess"})
@PropertySource("classpath:app.properties")
public class ApplicationConfig {

    @Bean( name = "viewResolver")
    public InternalResourceViewResolver resolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/Views/");
        resolver.setSuffix(".jsp");
        return  resolver;
    }
    @Bean(name = "multipartResolver")
    public MultipartResolver getMultipartResolver() {
        CommonsMultipartResolver configMaxSizeUpload = new CommonsMultipartResolver();
        // 1MB
        configMaxSizeUpload.setMaxUploadSize(1 * 1024 * 1024);
        return configMaxSizeUpload;
    }
}
