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
public class deleteiconchckfsdfsdfsdfsdfsdf {

	@Test(retryAnalyzer = RetryFailedTestCases.class)
	public void deleteiconchckfsdfsdfsdfsdfsdf() {
		tg.openBrowser();
				tg.wait("ele_emailaddre865", ComparisonType.IS_VISIBLE);
				tg.click("ele_emailaddre865", 1);
				tg.wait("ele_r1h6kqsqpp789", ComparisonType.IS_VISIBLE);
				tg.click("ele_r1h6kqsqpp789", 1);
				tg.wait("ele_emailaddre509", ComparisonType.IS_VISIBLE);
				tg.click("ele_emailaddre509", 1);
				tg.wait("ele_emailaddre509", ComparisonType.IS_VISIBLE);
				tg.click("ele_emailaddre509", 1);
				tg.wait("ele_r1hmkqsqpp679", ComparisonType.IS_VISIBLE);
				tg.click("ele_r1hmkqsqpp679", 1);
				tg.wait("ele_r1hmkqsqpp679", ComparisonType.IS_VISIBLE);
				tg.typeEncrypted("ele_r1hmkqsqpp679", "WDRyCVBcTnBoql8zqQoy7w==:MTIzNDU2Nzg5MTAxMTEyMQ==");
				tg.wait("ele_r1hmkqsqpp679", ComparisonType.IS_VISIBLE);
				tg.click("ele_r1hmkqsqpp679", 1);
		tg.close();
	}
}