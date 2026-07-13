import io.testgrid.listeners.TestListener;
import io.testgrid.listeners.RetryFailedTestCases;
import io.testgrid.tg;
import org.testng.annotations.*;
import app.getxray.xray.testng.annotations.XrayTest;
import io.testgrid.enums.ComparisonType;
import org.json.JSONObject;
import io.testgrid.enums.Direction;
import io.testgrid.enums.Size;
import io.testgrid.enums.Buttons;
import static io.testgrid.baseClass.driver;
import org.openqa.selenium.*;
import static io.testgrid.enums.KeyboardKeys.*;
import org.openqa.selenium.support.ui.Select;
import java.net.*;
import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

@Listeners(TestListener.class);
public class tc001rz {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void tc001rz() {
		tg.openBrowser();
		tg.click("ele_username444", 1);
		tg.type("ele_username444", "dasfasdf");
		tg.click("ele_password660", 1);
		tg.click("ele_password264", 1);
		tg.typeEncrypted("ele_password264", "nImTfyNQZ+GLA1pGz6NvWw==:MTIzNDU2Nzg5MTAxMTEyMQ==");
		tg.click("ele_submit135", 1);
		tg.takeFullScreenshot();
		tg.close();
	}
}