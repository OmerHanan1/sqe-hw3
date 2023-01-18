package hellocucumber;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeOptions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Random;
import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

public class MoodleActuator {
    private WebDriver driver;
    private WebDriverWait wait;
    public void initSession(String webDriver, String path){
        // webDriver = "webdriver.chrome.driver"
        // path = "C:\University\Year C\Semester A\qa_course\assignment3\sqe-hw3\Selenium\chromedriver.exe";
        System.setProperty(webDriver, path);

        // new chrome driver object
        this.driver = new ChromeDriver();

        // new web driver wait -> waits until element are loaded (40 sec max)
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(40));

        // launch website -> localhost
        driver.get("http://localhost/");

        // maximize the window - some web apps look different in different sizes
        driver.manage().window().maximize();

        /*
            If we wanted to test the web application on different devices -
                1. Open the web app
                2. Right click -> click inspect
                3. Click on the phone icon at the top left corner of the inspect window (the app changes preview format at this point)
                4. Locate the dimensions drop-down list at the top of the web app and choose device
                5. Copy dimensions size (on the right side of the drop-down list)
                   -> driver.manage().window().setSize(new Dimension(width, height));
         */
        System.out.println("Driver setup finished for - " + driver.getTitle());
    }

    public void login(String username, String password)
    {
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("loginbtn")).click();
    }

    public void navigateToQuiz() throws InterruptedException {
        // navigate to the quiz page url
        driver.get("http://127.0.0.1/mod/quiz/view.php?id=4");
    }

    public void selectQuiz() {
<<<<<<< HEAD
        // select the quiz
        driver.findElement(By.xpath("btn btn-primary")).click();
=======
        // click the attempt quiz button
        driver.findElement(By.xpath("//form[1]/button[1]")).click();
    }

    public void answerQuestion() {
        driver.findElement(By.xpath("//div[1]/div[2]/input[2]")).click();
    }

    public void submitAnswer() throws AWTException {
        driver.findElement(By.xpath("//div[1]/div[1]/input[2]")).click();
        driver.findElement(By.xpath("//div[1]/div[2]/input[2]")).click();
        // click the submit button
        driver.findElement(By.xpath("//form[1]/div[1]/div[2]/input[1]")).click();
        // click submit all and finish button
        driver.findElement(By.xpath("//div[5]/div[1]/div[1]/form[1]/button[1]")).click();
        // click the finish attempt confirmation button
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public void submittedsuccessfully() {
        driver.findElement(By.xpath("//body/div[3]/div[5]/div[1]\n")).click();
        driver.findElement(By.xpath("//div[1]/section[1]/div[2]/div[1]/a[1]\n")).click();
    }

    public void editQuizQuestionType() {
        driver.get("http://127.0.0.1/mod/quiz/edit.php?cmid=4");
        driver.findElement(By.xpath("//div[1]/div[2]/a[1]/span[1]/span[1]\n")).click();
        WebElement choices = driver.findElement(By.xpath("//div[9]/div[2]/select[1]"));
        choices.sendKeys(Keys.DOWN);
        choices.sendKeys(Keys.ENTER);

        WebElement grade = driver.findElement(By.xpath("//div[2]/div[2]/select[1]"));
        grade.sendKeys(Keys.UP);
        grade.sendKeys(Keys.UP);
        grade.sendKeys(Keys.UP);
        grade.sendKeys(Keys.UP);
        grade.sendKeys(Keys.UP);
        grade.sendKeys(Keys.UP);
        grade.sendKeys(Keys.UP);
        grade.sendKeys(Keys.UP);
        grade.sendKeys(Keys.ENTER);

        WebElement defaultgrade = driver.findElement(By.xpath("//fieldset[2]/div[2]/div[5]/div[2]/select[1]"));
        defaultgrade.sendKeys(Keys.UP);
        defaultgrade.sendKeys(Keys.UP);
        defaultgrade.sendKeys(Keys.UP);
        defaultgrade.sendKeys(Keys.UP);
        defaultgrade.sendKeys(Keys.UP);
        defaultgrade.sendKeys(Keys.UP);
        defaultgrade.sendKeys(Keys.UP);
        defaultgrade.sendKeys(Keys.UP);
        defaultgrade.sendKeys(Keys.UP);
        defaultgrade.sendKeys(Keys.ENTER);

        driver.findElement(By.xpath("//div[4]/div[2]/fieldset[1]/div[1]/div[1]/span[1]/input[1]")).click();
    }

    public void success() {
<<<<<<< HEAD
        // assert that the page title is correct
        Assert.isTrue(true, "Page title is not correct");
        System.out.println(driver.getTitle());
=======
        System.out.println("Test passed");
>>>>>>> a96eacbda15a8a1d0406a872f21abc1c4fea2d67
>>>>>>> ab82bcf24a38897a2d0b3ce224a010e76e9f8286
    }
}
