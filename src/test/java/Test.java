import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test {
    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "/home/degu/Downloads/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.dns-shop.ru/");
    }

    @org.junit.Test
    public void test() {
       driver.findElement(By.linkText("Компьютеры и периферия")).click();
       driver.findElement(By.partialLinkText("Компьютерные системы")).click();
       driver.findElement(By.partialLinkText("Системные блоки")).click();
       driver.findElement(By.xpath(".//*[text()=' По возрастанию цены ']/..")).click();
       driver.findElement(By.xpath("//a[@data-id='2']/..")).click();
       driver.findElement(By.xpath("//div[@data-position-index='2']/..")).click();


    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
