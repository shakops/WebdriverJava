import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo extends AllTestCases {
	@BeforeTest
	public void start() {
		System.out.println("I am from @before start method");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\EliteBook-p\\Desktop\\Automation\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://tuclothing.sainsburys.co.uk/");
		driver.manage().window().maximize();

	}
	
	@Test
	public void searchWithInValidData() {
		System.out.println("I am in @Test test 1 method");
		driver.findElement(By.id("searchBlog")).click();
		driver.findElement(By.id("search")).clear();
		driver.findElement(By.id("search")).sendKeys("jjkkk");
		driver.findElement(By.cssSelector(".button.searchButton")).click();
		//driver.findElement(By.xpath("//*[@id='wp-content']/div/div[2]/div/div/p[1]")).clear();

	}
}
