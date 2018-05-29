package declaringElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgottenPassword {
	public static String BASE_URL="https://tuclothing.sainsburys.co.uk/";
	public static By LOGIN_REGISTER_BUTTON=By.linkText("Tu Log In / Register");
	public static By REG_TOGGLE=By.className("regToggle");
	public static By JUSERNAME=By.id("j_username");
	
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\EliteBook-p\\eclipse-workspace\\WebDriverCucumber\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(BASE_URL);
		driver.manage().window().maximize();
		driver.findElement(LOGIN_REGISTER_BUTTON).click();
		driver.findElement(REG_TOGGLE).click();
		driver.findElement(JUSERNAME).clear();
		driver.findElement(By.id("j_username")).sendKeys("toccsubject@gmail.com");
		driver.findElement(By.linkText("Forgotten your password?")).click();
		driver.findElement(By.className("required")).clear();
		driver.findElement(By.className("required")).sendKeys("toccsubject@gmail.com");

	}

}
