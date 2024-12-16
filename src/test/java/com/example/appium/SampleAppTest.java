package com.example.appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.InteractsWithApps;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.nio.file.Paths;

import static java.lang.System.getenv;

public class SampleAppTest {
    private AppiumDriverLocalService server;
    private AppiumDriver driver;

    @BeforeClass
    private void setUp() {
        String platform = getenv("APPIUM_DRIVER");
        platform = platform == null ? "ANDROID" : platform.toUpperCase();
        String path = System.getProperty("user.dir");

        if (platform.equals("ANDROID")) {
            var options = new UiAutomator2Options()
                    .setPlatformName("Android")
                    .setDeviceName("emulator-5554")
                    .setApp(Paths.get(path).resolve("ApiDemos-debug.apk").toString());

            server = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().usingAnyFreePort());
            server.start();
            driver = new AndroidDriver(server, options);

            ((InteractsWithApps) driver).activateApp("io.appium.android.apis");
        } else {
            var options = new XCUITestOptions()
                    .setPlatformName("iOS")
                    .setPlatformVersion("16C5032a")
                    .setAutomationName("XCuiTest")
                    .setDeviceName("iPhone 15")
                    .setApp(Paths.get(path).resolve("TestApp.app.zip").toString());

            server = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().usingAnyFreePort());
            server.start();
            driver = new IOSDriver(server, options);
        }
    }

    @Test
    public void textFieldTest() {
        // initialise PageView and set "text" to its textField
        PageView pageView = new PageView(driver);
        pageView.setTextField("text");

        // assert that textField equals to "text"
        assert pageView.getTextField().equals("text") : "Incorrect value";
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        if (server != null) {
            server.stop();
        }
    }
}
