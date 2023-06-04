package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;


    public class driver_factory {
        private static WebDriver driver;

        public static WebDriver getDriver() {
            return driver;
        }

        public static void setDriver(WebDriver driverref) {
            driver = driverref;
        }

        public static void initializeddriver() throws IOException {
            String browsername = utilityFetchProperty.fetchPropertyValue("browser");
            switch (browsername) {
                case "Chrome":
                    ChromeOptions ops = new ChromeOptions();
                    ops.addArguments("--remote-allow-origins=*");
                    driver = new ChromeDriver(ops);
                    setDriver(driver);
                    break;
                case "Firefox":
                    driver = new FirefoxDriver();
                    setDriver(driver);
                    break;
                case "Edge":
                    driver = new EdgeDriver();
                    setDriver(driver);
                    break;
                default:
                    driver = new ChromeDriver();
                    setDriver(driver);
                    break;
            }
        }

        public static void quitdriver() {
            getDriver().quit();
        }

    }


