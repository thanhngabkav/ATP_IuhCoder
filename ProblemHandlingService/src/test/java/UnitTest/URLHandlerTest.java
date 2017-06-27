package UnitTest;


import com.sun.activation.registries.LogSupport;
import com.sun.javafx.util.Logging;
import org.junit.Test;

import ErrorHandling.ProblemExceptionHandler;
import Utilities.URLHandler;
import sun.rmi.runtime.Log;

import java.io.Console;
import java.util.logging.Logger;

import static junit.framework.TestCase.assertEquals;

public class URLHandlerTest {

	@Test
	public void testWriteFile() throws ProblemExceptionHandler {
		String expected = URLHandler.CODE_URL  + "/" + "xxx" + ".cpp";
		String actualURL = URLHandler.writeFile("abc", "xxx");
		assertEquals(expected, actualURL);
	}

}
