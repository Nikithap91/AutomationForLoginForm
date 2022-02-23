import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    private WebDriver driver;

    @Before
    public void launch() {
        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        // launch Chrome and direct it to the URL
        driver.get("https://takehome.zeachable.com");
    }

    @Test
    public void signInTest() {
        String expectedTitle = "takehome";
        String actualTitle = "";

        driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
        driver.findElement(By.id("email")).sendKeys("takehome@test.com");
        driver.findElement(By.id("password")).sendKeys("Teachable");
        driver.findElement(By.name("commit")).click();

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
    }

    @Test
    public void signUpTest() {
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click();
        driver.findElement(By.id("user_name")).sendKeys("Nikitha");
        driver.findElement(By.id("user_email")).sendKeys("nikitha0820@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Password@123");
        driver.findElement(By.name("allow_marketing_emails")).click();
        driver.findElement(By.name("commit")).click();

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
    }

    @After
    public void tearDown() {
        //close Fire fox
        driver.close();
    }

}
