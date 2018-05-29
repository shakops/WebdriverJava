import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchWithValidData {

	public static void main(String[] args) {
		// System.setProperty("webdriver.chrome.driver","C:/Users/EliteBook-p/Desktop/Automation/drivers/chromedriver.exe");
		// WebDriver driver=new ChromeDriver();

		System.setProperty("webdriver.gecko.driver", "C:/Users/EliteBook-p/Desktop/Automation/drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		driver.manage().window().maximize();
		driver.findElement(By.id("search")).clear();
		driver.findElement(By.id("search")).sendKeys("dress");
		driver.findElement(By.className("searchButton")).click();
		driver.findElement(By.className("details")).click();
		driver.findElement(By.className("tu-pdp__information-selector-link")).click();
		driver.findElement(By.id("productVariantSize")).click();
		WebElement ele = driver.findElement(By.id("productVariantSize"));
		Select dropdown = new Select(ele);
		dropdown.selectByIndex(4);
		// driver.findElement(By.linkText("Size chart")).click();
		// Thread.sleep(3000);
		WebElement q1 = driver.findElement(By.id("productVariantQty"));
		Select qty = new Select(q1);
		qty.selectByIndex(2);
		driver.findElement(By.id("AddToCart")).click();
		driver.findElement(By.className("tuButton")).click();
		// driver.findElement(By.className("clickCollect")).click();
		driver.findElement(By.className("basketButtonContinue")).click();
	}

}
