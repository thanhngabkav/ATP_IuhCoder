import Config.ApplicationConfig;
import Models.WebAppException;
import Service.ICoderRatingLoader;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    ICoderRatingLoader iCoderRatingLoader;

    @org.junit.Test
    public void testloadgido() throws WebAppException {
        iCoderRatingLoader.loadTopCoder(10);
        Assert.assertEquals("aaa","aaa");
    }
}
