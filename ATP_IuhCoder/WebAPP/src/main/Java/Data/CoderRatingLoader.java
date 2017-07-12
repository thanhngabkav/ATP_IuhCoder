package Data;

import Models.CoderRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import java.util.List;

/**
 * Created by lldtien on 7/11/2017.
 */
@Configuration
@PropertySource("classpath:app.properties")
public class CoderRatingLoader implements ICoderRatingLoader {

    @Autowired
    private Environment environment;

        public List<CoderRating> loadTop5Coder() {
            System.out.println(environment.getProperty("pages"));
        return null;
    }
}
