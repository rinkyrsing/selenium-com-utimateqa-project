package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowserTest {

    public static void main(String[] args) {
        //Launch browser
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        driver.get(baseUrl);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String title = driver.getTitle();
        System.out.println("Title:" + title);

        System.out.println("Current URL = " + driver.getCurrentUrl());

        System.out.println(driver.getPageSource());

        driver.findElement(By.id("user[email]")).sendKeys("rinky@gmail.com");
        driver.findElement(By.name("user[password]")).sendKeys("rinky123");

        //Close browswe
        driver.close();


    }


    
}
