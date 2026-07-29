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

class dsfdsf {

	public static void dsfdsf() {
				tg.switchToFrame("ele_recaptcha408");
				tg.wait("ele_recaptcha408", ComparisonType.IS_VISIBLE);
				tg.click("ele_recaptcha408", 1);
				tg.switchToDefaultContent();
				tg.switchToFrame("ele_recaptchac752");
				tg.wait("ele_recaptchac752", ComparisonType.IS_VISIBLE);
				tg.click("ele_recaptchac752", 1);
	}
}