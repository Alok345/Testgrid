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

@Listeners(TestListener.class)
public class gfh {

    public static String var_ra_dsfdf = "sdfsdf";

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void fghgfh() {
        tg.openBrowser();
        tg.wait(6);
        tg.close();
    }

    @Test(retryAnalyzer = RetryFailedTestCases.class)
    public void nmv() {
        tg.openBrowser();
        tg.wait(5);
        tg.close();
    }

    public static void deleteiconchck() {
        tg.wait("ele_r1h6kqsqpp584", ComparisonType.IS_VISIBLE);
        tg.click("ele_r1h6kqsqpp584");
        tg.wait("ele_r1h6kqsqpp584", ComparisonType.IS_VISIBLE, 20);
        tg.type("ele_r1h6kqsqpp584", "dfffddf");
        tg.wait("ele_r1hmkqsqpp049", ComparisonType.IS_VISIBLE);
        tg.click("ele_r1hmkqsqpp049", 1);
        tg.wait("ele_r1hmkqsqpp049", ComparisonType.IS_VISIBLE);
        tg.typeEncrypted("ele_r1hmkqsqpp049", "ILdzzmJ1Z7Yk6AHwmA4nsQ==:MTIzNDU2Nzg5MTAxMTEyMQ==");
        tg.wait("ele_r1hmkqsqpp049", ComparisonType.IS_VISIBLE);
        tg.click("ele_r1hmkqsqpp049", 1);
        tg.wait("ele_forgottenp897", ComparisonType.IS_VISIBLE);
        tg.click("ele_forgottenp897", 1);
        tg.tapByImage("ele_forgottenp897", 0.65);
        tg.wait("ele_continue869", ComparisonType.IS_VISIBLE);
        tg.click("ele_continue869", 1);
        tg.wait("ele_svg002424c191", ComparisonType.IS_VISIBLE);
        tg.click("ele_svg002424c191", 1);
        tg.wait("ele_createnewa443", ComparisonType.IS_VISIBLE);
        tg.click("ele_createnewa443", 1);
        tg.wait("ele_svg002424c775", ComparisonType.IS_VISIBLE);
        tg.click("ele_svg002424c775", 1);
    }

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
