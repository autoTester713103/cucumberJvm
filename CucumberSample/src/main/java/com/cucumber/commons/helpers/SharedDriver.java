// very slightly modified version of: https://github.com/cucumber/cucumber-jvm/blob/master/examples/java-webbit-websockets-selenium/src/test/java/cucumber/examples/java/websockets/SharedDriver.java

package com.cucumber.commons.helpers;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

/**
 * 
 * <p>
 * A new instance of the SharedDriver is created for each Scenario and then
 * passed to the Step Definition classes' constructor. They all receive a
 * reference to the same instance. However, the REAL_DRIVER is the same instance
 * throughout the life of the JVM.
 * </p>
 */
public class SharedDriver extends EventFiringWebDriver {
	private static WebDriver REAL_DRIVER;
	private static final Logger logger = LogManager.getLogger();
	private static final Thread CLOSE_THREAD = new Thread() {
		@Override
		public void run() {
			REAL_DRIVER.close();
			REAL_DRIVER.quit();
		}
	};

	static {
		Runtime.getRuntime().addShutdownHook(CLOSE_THREAD);
		try {
			System.setProperty("webdriver.chrome.driver",
					"drivers/chromedriver.exe");
			REAL_DRIVER = new ChromeDriver();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			throw new Error(throwable);
		}
	}

	public SharedDriver() {

		super(REAL_DRIVER);
		REAL_DRIVER.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Override
	public void close() {
		if (Thread.currentThread() != CLOSE_THREAD) {
			throw new UnsupportedOperationException(
					"You shouldn't close this WebDriver. It's shared and will close when the JVM exits.");
		}
		super.close();
	}

	@Before
	public void before(Scenario scenario) throws MalformedURLException {
		logger.info("Called openBrowser for scenario [{}]", scenario.getId());
		
		REAL_DRIVER.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		REAL_DRIVER.manage().deleteAllCookies();
		REAL_DRIVER.manage().window().maximize();
	}

	@After
	public void after(Scenario scenario) {
		try {
			if (scenario.isFailed()) {
				scenario.write("Current Page URL is "
						+ REAL_DRIVER.getCurrentUrl());
				byte[] screenshot = ((TakesScreenshot) REAL_DRIVER)
						.getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			}
		} catch (WebDriverException wde) {
			System.out.println("Error: " + wde.getMessage());
		} finally {
			if (REAL_DRIVER != null) {
				REAL_DRIVER.close();
				REAL_DRIVER.quit();
			}
		}
	}
}
