package portalTest;

import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;

public class Main {
    WebDriver driver;
    HomePage page;
    WebDriverWait wait;
    String email = "";
    String password = "";
    FileInputStream file;
    HSSFWorkbook workbook;
    HSSFSheet sheet;

    @Test
    public void launchChrome() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-gpu");
        driver.manage().window().maximize();
        driver.get("http://10.43.240.197:9090");
        Thread.sleep(5000);
        page.clickLoginBtn();


    }
}