import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
  public static void main(String[] args) {
    // Step 1: ChromeDriver path
    // System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver_win32");
    System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver_win32\\chromedriver.exe");


    // Step 2: Launch Chrome
    WebDriver driver = new ChromeDriver();

    // Step 3: Open Google
    driver.get("https://www.google.com");

    // Step 4: Search box find karo
    WebElement searchBox = driver.findElement(By.name("q"));
    searchBox.sendKeys("SDET Automation");

    // Step 5: Submit karo
    searchBox.submit();

    // Step 6: Wait & close
    try { Thread.sleep(3000); } catch (Exception e) {}
    driver.quit();
  }
}
