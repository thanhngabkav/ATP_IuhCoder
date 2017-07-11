import Config.ApplicationConfig;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by lldtien on 7/11/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
public class Test {

    @org.junit.Test
    public  void testtest(){
        Assert.assertEquals("aaa","aaa");
    }
}
