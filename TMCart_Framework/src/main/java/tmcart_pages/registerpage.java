package tmcart_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.driver_factory;

import java.time.Duration;

public class registerpage {
    public static void userRegistration() throws InterruptedException {
        driver_factory.getDriver().manage().timeouts().implicitlyWait(Duration.ofMinutes(20));

        driver_factory.getDriver().findElement(By.xpath("//input[@id='txt-name']")).sendKeys("laxmi1");
        driver_factory.getDriver().findElement(By.xpath("//input[@id='txt-email']")).sendKeys("laxmi1@gmail.com");
        driver_factory.getDriver().findElement(By.xpath("//input[@id='txt-password']")).sendKeys("laxmi@123");
        driver_factory.getDriver().findElement(By.xpath("//input[@id='txt-password-confirmation']")).sendKeys("laxmi@123");
        //driver.findElement(By.xpath("//*[@id='main-section']/div[2]/div/div/div/div/div[1]/div/div/form/div/div[6]/p[1]/label/span")).isSelected();
        // Thread.sleep(5000);

        WebElement ele = driver_factory.getDriver().findElement(By.xpath("//label[@for='agree-terms-and-policy']/span"));
        WebElement ele2 = driver_factory.getDriver().findElement(By.xpath("//button[text()='Register']"));
        //ele.click();
        JavascriptExecutor js = (JavascriptExecutor) driver_factory.getDriver();

        js.executeScript("arguments[0].scrollIntoView()", ele);
        WebDriverWait wait = new WebDriverWait(driver_factory.getDriver(), Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(ele));

        js.executeScript("arguments[0].click()", ele);
        js.executeScript("arguments[0].click()", ele2);
        driver_factory.getDriver().close();

    }
    }
//    public static void userSucessfully_registered(){
//        //String actualmessage="user scucessfully registered";
//
//        String actualurl="https://ecom.gotechmasters.com/";
//        String expectedurl=driver_factory.getDriver().getCurrentUrl();
//        System.out.println(expectedurl);
//        Assert.assertEquals(actualurl,expectedurl);
//        if(actualurl.contentEquals(expectedurl))
//        {
//            System.out.println("Test case is passed");
//        }
//        else {
//            System.out.println("Test case is failed");
//        }
//    }

