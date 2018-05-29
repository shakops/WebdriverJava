import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LoginWithValidData {
	public static WebDriver driver;

	public static void main(String[] args) {
		// System.setProperty("webdriver.chrome.driver","C:/Users/EliteBook-p/Desktop/Automation/drivers/chromedriver.exe");
		// WebDriver driver=new ChromeDriver();

		System.setProperty("webdriver.gecko.driver", "C:/Users/EliteBook-p/Desktop/Automation/drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Tu Log In / Register")).click();
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("shashi@gmail.com");
		driver.findElement(By.id("j_password")).clear();
		driver.findElement(By.id("j_password")).sendKeys("shashi123");
		driver.findElement(By.className("loginButtonMain")).click();
		
	}

}
