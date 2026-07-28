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

class tgsurat {

	public static void tgsurat() {
		tg.wait("ele_r1h6kqsqpp584", ComparisonType.IS_VISIBLE);
		tg.click("ele_r1h6kqsqpp584", 1);
		tg.wait("ele_r1h6kqsqpp584", ComparisonType.IS_VISIBLE);
		tg.type("ele_r1h6kqsqpp584", "dfdsf");
		tg.tapByImage("https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQ_Zuz3haRHrSz0f3bnMlUTGa14Qc7Z5LLQ3-l04P98hv9CMXQU", 0.65, "5");
	}
}