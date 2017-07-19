import Config.ApplicationConfig;
<<<<<<< HEAD:ATP_IuhCoder/WebAPP/src/Test/Test.java
import Data.ICoderRatingLoader;
=======
import Models.WebAppException;
import Service.ICoderRatingLoader;
>>>>>>> 3c44acfa483bdb60b02266348c1b9d5cc172544c:ATP_IuhCoder/WebAPP/src/Test/Java/Test.java
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
