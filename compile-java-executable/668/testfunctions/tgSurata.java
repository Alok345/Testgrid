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

class tgsurata {

	public static void tgsurata() {
		tg.wait("ele_r1h6kqsqpp789", ComparisonType.IS_VISIBLE);
		tg.click("ele_r1h6kqsqpp789", 1);
		tg.wait("ele_r1h6kqsqpp789", ComparisonType.IS_VISIBLE);
		tg.type("ele_r1h6kqsqpp789", "retert");
		tg.wait(6);
		tg.wait(8);
		tg.wait(7);
		tg.wait(98);
	}
}