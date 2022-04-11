package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CromeBrowserTest {

    public static void main(String[] args) {
        //How to launch browser
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in"; //
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        // System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new ChromeDriver(); //obj
        //Launch the URL
        driver.get(baseUrl);
        //to Maximize window
        driver.manage().window().maximize();
        //We give implicit time to drive
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get title of the page
        String title = driver.getTitle();
        System.out.println("Title = " +title);
        // Get Current URL
        System.out.println("Current URL = " + driver.getCurrentUrl() );
        //
        String loginURL = "https://courses.ultimateqa.com/users/sign_in";
        driver.navigate().to(loginURL);

        System.out.println("Current URL = " + driver.getCurrentUrl() );

        // to find email field element
        WebElement emailField = driver.findElement(By.id("user[email]")); // copy
        //sending email field element
        emailField.sendKeys("prime123@gmail.com");

        //Find the password field element
        WebElement passWordField = driver.findElement(By.name("user[password]"));
        //Sending password to password field element
        passWordField.sendKeys("Prine123");

        // to close the browser
          driver.close();
    }

}

