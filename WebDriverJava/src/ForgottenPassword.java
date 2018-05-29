import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgottenPassword {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\EliteBook-p\\eclipse-workspace\\WebDriverCucumber\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://tuclothing.sainsburys.co.uk/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Tu Log In / Register")).click();
		driver.findElement(By.className("regToggle")).click();
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("toccsubject@gmail.com");
		driver.findElement(By.linkText("Forgotten your password?")).click();
		driver.findElement(By.className("required")).clear();
		driver.findElement(By.className("required")).sendKeys("toccsubject@gmail.com");

	}

}
