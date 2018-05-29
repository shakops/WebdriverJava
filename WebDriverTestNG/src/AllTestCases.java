//
//import java.util.Set;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//public class AllTestCases {
//	public static WebDriver driver;
//
//	@BeforeTest
//	public void start() {
//		System.out.println("I am from @before start method");
//		System.setProperty("webdriver.gecko.driver",
//				"C:\\Users\\EliteBook-p\\Desktop\\Automation\\drivers\\geckodriver.exe");
//		driver = new FirefoxDriver();
//		driver.get("https://tuclothing.sainsburys.co.uk/");
//		driver.manage().window().maximize();
//
//	}
//
//	@Test
//	public void loginWithValidData() {
//		driver.findElement(By.linkText("Tu Log In / Register")).click();
//		driver.findElement(By.id("j_username")).sendKeys("srut@gmail.com");
//		driver.findElement(By.id("j_password")).sendKeys("sruthi123");
//		driver.findElement(By.className("loginButtonMain")).click();
//
//	}
//
//	@Test
//	public void loginWithInvalidData() {
//		driver.findElement(By.linkText("Tu Log In / Register")).click();
//		driver.findElement(By.id("j_username")).sendKeys("srut12@gmail.com");
//		driver.findElement(By.id("j_password")).sendKeys("sruthi12");
//		driver.findElement(By.className("loginButtonMain")).click();
//
//	}
//
//	@Test
//	public void loginWithEmptyEmailAndEmptyPassword() {
//		driver.findElement(By.linkText("Tu Log In / Register")).click();
//		driver.findElement(By.id("j_username")).sendKeys(" ");
//		driver.findElement(By.id("j_password")).sendKeys(" ");
//		driver.findElement(By.className("loginButtonMain")).click();
//
//	}
//
//	@Test
//	public void loginWithEmptyEmailAndValidPassword() {
//		driver.findElement(By.linkText("Tu Log In / Register")).click();
//		driver.findElement(By.id("j_username")).sendKeys(" ");
//		driver.findElement(By.id("j_password")).sendKeys("sruthi123");
//		driver.findElement(By.className("loginButtonMain")).click();
//
//	}
//
//	@Test
//	public void loginWithInvalidEmailAndValidPassword() {
//		driver.findElement(By.linkText("Tu Log In / Register")).click();
//		driver.findElement(By.id("j_username")).sendKeys("srut12@gmail.com");
//		driver.findElement(By.id("j_password")).sendKeys("sruthi123");
//		driver.findElement(By.className("loginButtonMain")).click();
//
//	}
//
//	@Test
//	public void loginWithValidEmailAndEmptyPassword() {
//		driver.findElement(By.linkText("Tu Log In / Register")).click();
//		driver.findElement(By.id("j_username")).sendKeys("srut@gmail.com");
//		driver.findElement(By.id("j_password")).sendKeys(" ");
//		driver.findElement(By.className("loginButtonMain")).click();
//
//	}
//
//	@Test
//	public void loginWithValidEmailAndInValidPassword() {
//		driver.findElement(By.linkText("Tu Log In / Register")).click();
//		driver.findElement(By.id("j_username")).sendKeys("srut@gmail.com");
//		driver.findElement(By.id("j_password")).sendKeys("sruthi12");
//		driver.findElement(By.className("loginButtonMain")).click();
//
//	}
//
//	@Test
//	public void loginWithInvalidEmailAndInValidPassword() {
//		driver.findElement(By.linkText("Tu Log In / Register")).click();
//		driver.findElement(By.id("j_username")).sendKeys("srut12@gmail.com");
//		driver.findElement(By.id("j_password")).sendKeys("sruthi12");
//		driver.findElement(By.className("loginButtonMain")).click();
//
//	}
//
//	@Test
//	public void searchWithEmptyData() {
//		driver.findElement(By.id("search")).clear();
//		driver.findElement(By.id("search")).sendKeys("");
//		driver.findElement(By.className("searchButton")).click();
//	}
//
//	@Test
//	public void searchWithFewLettersOfProductName() {
//		driver.findElement(By.id("search")).clear();
//		driver.findElement(By.id("search")).sendKeys("Dre");
//		driver.findElement(By.className("searchButton")).click();
//
//	}
//
//	@Test
//	public void searchWithInvalidProductName() {
//		driver.findElement(By.id("search")).clear();
//		driver.findElement(By.id("search")).sendKeys("ksdjdgfed");
//		driver.findElement(By.className("searchButton")).click();
//
//	}
//
//	@Test
//	public void searchWithvalidProductName() {
//		driver.findElement(By.id("search")).clear();
//		driver.findElement(By.id("search")).sendKeys("Dress");
//		driver.findElement(By.className("searchButton")).click();
//
//	}
//
//	@Test
//	public void searchBoxthroughSearchBlogWithInvalidData() {
//		driver.findElement(By.id("searchBlog")).click();
//		driver.findElement(By.id("search")).clear();
//		driver.findElement(By.id("search")).sendKeys("sshhfeg");
//		driver.findElement(By.className("searchButton")).click();
//
//	}
//
//	@Test
//	public void searchBoxthroughSearchBlogWithNoData() {
//		driver.findElement(By.id("searchBlog")).click();
//		driver.findElement(By.id("search")).clear();
//		driver.findElement(By.id("search")).sendKeys("");
//		driver.findElement(By.className("searchButton")).click();
//
//	}
//
//	@Test
//	public void searchBoxForSearchingProductsWithSearchProposals() {
//		driver.findElement(By.id("searchBlog")).click();
//		driver.findElement(By.id("search")).clear();
//		driver.findElement(By.id("search")).sendKeys("Baby");
//		driver.findElement(By.className("searchButton")).click();
//
//	}
//
//	@Test
//	public void storeLocatorWithBlankData() {
//		driver.findElement(By.linkText("Tu Store Locator")).click();
//		driver.findElement(By.name("q")).sendKeys("   ");
//		driver.findElement(By.cssSelector(".form.search")).click();
//
//	}
//
//	@Test
//	public void storeLocatorInvalidTownNameOrPostCode() {
//		driver.findElement(By.linkText("Tu Store Locator")).click();
//		driver.findElement(By.name("q")).sendKeys("asvfhheg");
//		driver.findElement(By.cssSelector(".form.search")).click();
//
//	}
//
//	@Test
//	public void storeLocatorWithTickingBoxes() {
//		driver.findElement(By.linkText("Tu Store Locator")).click();
//		driver.findElement(By.name("q")).sendKeys("RH1");
//		driver.findElement(By.id("women")).click();
//		driver.findElement(By.id("men")).click();
//		driver.findElement(By.id("children")).click();
//		driver.findElement(By.id("gok")).click();
//		driver.findElement(By.id("click")).click();
//		driver.findElement(By.cssSelector(".form.search")).click();
//
//	}
//
//	@Test
//	public void storeLocatorWithValidPostCode() throws InterruptedException {
//		driver.findElement(By.linkText("Tu Store Locator")).click();
//		driver.findElement(By.name("q")).sendKeys("RH1");
//		driver.findElement(By.cssSelector(".form.search")).click();
//		Thread.sleep(2000);
//	}
//
//	@Test
//	public void storeLocatorWithValidTownName() throws InterruptedException {
//		driver.findElement(By.linkText("Tu Store Locator")).click();
//		driver.findElement(By.name("q")).sendKeys("Merstam");
//		driver.findElement(By.cssSelector(".form.search")).click();
//		Thread.sleep(2000);
//	}
//
//	@Test
//	public void SocialMedia() throws InterruptedException {
//		Thread.sleep(1000);
//		String parent = driver.getWindowHandle();
//		driver.findElement(By.linkText("Facebook")).click();
//		Thread.sleep(3000);
//		Set<String> handles = driver.getWindowHandles();
//		for (String child : handles) {
//			if (!parent.contains(child)) {
//				driver.switchTo().window(child);
//				driver.close();
//			}
//
//		}
//
//	}
//
//	@Test
//	public void registerWithBlankPasswordField() {
//		driver.findElement(By.linkText("Tu Log In / Register")).click();
//		driver.findElement(By.cssSelector(".tuButton.regToggle")).click();
//		driver.findElement(By.id("register_email")).clear();
//		driver.findElement(By.id("register_email")).sendKeys("srut@gmail.com");
//		WebElement ele = driver.findElement(By.id("register_title"));
//		Select dropdown = new Select(ele);
//		dropdown.selectByVisibleText("Mrs");
//		driver.findElement(By.id("register_firstName")).clear();
//		driver.findElement(By.id("register_firstName")).sendKeys("sre");
//		driver.findElement(By.id("register_lastName")).clear();
//		driver.findElement(By.id("register_lastName")).sendKeys("kguf ");
//		driver.findElement(By.id("password")).clear();
//		driver.findElement(By.id("password")).sendKeys(" ");
//		driver.findElement(By.id("register_checkPwd")).clear();
//		driver.findElement(By.id("register_checkPwd")).sendKeys("sruthi123");
//		driver.findElement(By.id("Terms & Conditions & Privacy Policy")).click();
//		driver.findElement(By.className("registerButton")).click();
//
//	}
//
//	@Test
//	public void registerWithBlankConfirmPasswordField() {
//		driver.findElement(By.linkText("Tu Log In / Register")).click();
//		driver.findElement(By.cssSelector(".tuButton.regToggle")).click();
//		driver.findElement(By.id("register_email")).clear();
//		driver.findElement(By.id("register_email")).sendKeys("srut@gmail.com");
//		WebElement ele = driver.findElement(By.id("register_title"));
//		Select dropdown = new Select(ele);
//		dropdown.selectByVisibleText("Mrs");
//		driver.findElement(By.id("register_firstName")).clear();
//		driver.findElement(By.id("register_firstName")).sendKeys("sre");
//		driver.findElement(By.id("register_lastName")).clear();
//		driver.findElement(By.id("register_lastName")).sendKeys("kguf");
//		driver.findElement(By.id("password")).clear();
//		driver.findElement(By.id("password")).sendKeys("sruthi123 ");
//		driver.findElement(By.id("register_checkPwd")).clear();
//		driver.findElement(By.id("register_checkPwd")).sendKeys("  ");
//		driver.findElement(By.id("Terms & Conditions & Privacy Policy")).click();
//		driver.findElement(By.className("registerButton")).click();
//
//	}
//
//	@Test
//	public void registerWithPasswordAndConfirmPasswordAreDifferent() {
//		driver.findElement(By.linkText("Tu Log In / Register")).click();
//		driver.findElement(By.cssSelector(".tuButton.regToggle")).click();
//		driver.findElement(By.id("register_email")).clear();
//		driver.findElement(By.id("register_email")).sendKeys("srut@gmail.com");
//		WebElement ele = driver.findElement(By.id("register_title"));
//		Select dropdown = new Select(ele);
//		dropdown.selectByVisibleText("Mrs");
//		driver.findElement(By.id("register_firstName")).clear();
//		driver.findElement(By.id("register_firstName")).sendKeys("sre");
//		driver.findElement(By.id("register_lastName")).clear();
//		driver.findElement(By.id("register_lastName")).sendKeys("kguf");
//		driver.findElement(By.id("password")).clear();
//		driver.findElement(By.id("password")).sendKeys("sruthi123");
//		driver.findElement(By.id("register_checkPwd")).clear();
//		driver.findElement(By.id("register_checkPwd")).sendKeys("sruth");
//		driver.findElement(By.id("Terms & Conditions & Privacy Policy")).click();
//		driver.findElement(By.className("registerButton")).click();
//
//	}
//
//	@Test
//	public void PasswordLessThan6Characters() {
//		driver.findElement(By.linkText("Tu Log In / Register")).click();
//		driver.findElement(By.cssSelector(".tuButton.regToggle")).click();
//		driver.findElement(By.id("register_email")).clear();
//		driver.findElement(By.id("register_email")).sendKeys("srut@gmail.com");
//		WebElement ele = driver.findElement(By.id("register_title"));
//		Select dropdown = new Select(ele);
//		dropdown.selectByVisibleText("Mrs");
//		driver.findElement(By.id("register_firstName")).clear();
//		driver.findElement(By.id("register_firstName")).sendKeys("sre");
//		driver.findElement(By.id("register_lastName")).clear();
//		driver.findElement(By.id("register_lastName")).sendKeys("kguf");
//		driver.findElement(By.id("password")).clear();
//		driver.findElement(By.id("password")).sendKeys("sruth");
//		driver.findElement(By.id("register_checkPwd")).clear();
//		driver.findElement(By.id("register_checkPwd")).sendKeys("sruth");
//		driver.findElement(By.id("Terms & Conditions & Privacy Policy")).click();
//		;
//		driver.findElement(By.className("registerButton")).click();
//
//	}
//
//	@Test
//	public void registerWithBlankSurNameField() {
//		driver.findElement(By.linkText("Tu Log In / Register")).click();
//		driver.findElement(By.cssSelector(".tuButton.regToggle")).click();
//		driver.findElement(By.id("register_email")).clear();
//		driver.findElement(By.id("register_email")).sendKeys("srut@gmail.com");
//		WebElement ele = driver.findElement(By.id("register_title"));
//		Select dropdown = new Select(ele);
//		dropdown.selectByVisibleText("Mrs");
//		driver.findElement(By.id("register_firstName")).clear();
//		driver.findElement(By.id("register_firstName")).sendKeys("sre");
//		driver.findElement(By.id("register_lastName")).clear();
//		driver.findElement(By.id("register_lastName")).sendKeys("  ");
//		driver.findElement(By.id("password")).clear();
//		driver.findElement(By.id("password")).sendKeys("sruthi123");
//		driver.findElement(By.id("register_checkPwd")).clear();
//		driver.findElement(By.id("register_checkPwd")).sendKeys("sruthi123");
//		driver.findElement(By.id("Terms & Conditions & Privacy Policy")).click();
//		;
//		driver.findElement(By.className("registerButton")).click();
//
//	}
//
//	@Test
//	public void registerWithValidData() {
//		driver.findElement(By.linkText("Tu Log In / Register")).click();
//		driver.findElement(By.cssSelector(".tuButton.regToggle")).click();
//		driver.findElement(By.id("register_email")).clear();
//		driver.findElement(By.id("register_email")).sendKeys("srut@gmail.com");
//		WebElement ele = driver.findElement(By.id("register_title"));
//		Select dropdown = new Select(ele);
//		dropdown.selectByVisibleText("Mrs");
//		driver.findElement(By.id("register_firstName")).clear();
//		driver.findElement(By.id("register_firstName")).sendKeys("sre");
//		driver.findElement(By.id("register_lastName")).clear();
//		driver.findElement(By.id("register_lastName")).sendKeys("kguf");
//		driver.findElement(By.id("password")).clear();
//		driver.findElement(By.id("password")).sendKeys("sruthi123");
//		driver.findElement(By.id("register_checkPwd")).clear();
//		driver.findElement(By.id("register_checkPwd")).sendKeys("sruthi123");
//		driver.findElement(By.id("Terms & Conditions & Privacy Policy")).click();
//		driver.findElement(By.className("registerButton")).click();
//		String message = driver.findElement(By.cssSelector(".content-container h2")).getText();
//		Assert.assertEquals("Thank you for registering with Tu", message);
//
//	}
//
//	@Test
//	public void registerWithBlankEmailAddress() {
//		driver.findElement(By.linkText("Tu Log In / Register")).click();
//		driver.findElement(By.cssSelector(".tuButton.regToggle")).click();
//		driver.findElement(By.id("register_email")).clear();
//		driver.findElement(By.id("register_email")).sendKeys("  ");
//		WebElement ele = driver.findElement(By.id("register_title"));
//		Select dropdown = new Select(ele);
//		dropdown.selectByVisibleText("Mrs");
//		driver.findElement(By.id("register_firstName")).clear();
//		driver.findElement(By.id("register_firstName")).sendKeys("sre");
//		driver.findElement(By.id("register_lastName")).clear();
//		driver.findElement(By.id("register_lastName")).sendKeys("kguf");
//		driver.findElement(By.id("password")).clear();
//		driver.findElement(By.id("password")).sendKeys("sruthi123");
//		driver.findElement(By.id("register_checkPwd")).clear();
//		driver.findElement(By.id("register_checkPwd")).sendKeys("sruthi123");
//		driver.findElement(By.id("Terms & Conditions & Privacy Policy")).click();
//
//		driver.findElement(By.className("registerButton")).click();
//
//	}
//
//	@Test
//	public void registerWithBlankFirstNameField() {
//		driver.findElement(By.linkText("Tu Log In / Register")).click();
//		driver.findElement(By.cssSelector(".tuButton.regToggle")).click();
//		driver.findElement(By.id("register_email")).clear();
//		driver.findElement(By.id("register_email")).sendKeys("srut@gmail.com");
//		WebElement ele = driver.findElement(By.id("register_title"));
//		Select dropdown = new Select(ele);
//		dropdown.selectByVisibleText("Mrs");
//		driver.findElement(By.id("register_firstName")).clear();
//		driver.findElement(By.id("register_firstName")).sendKeys("  ");
//		driver.findElement(By.id("register_lastName")).clear();
//		driver.findElement(By.id("register_lastName")).sendKeys("kguf");
//		driver.findElement(By.id("password")).clear();
//		driver.findElement(By.id("password")).sendKeys("sruthi123");
//		driver.findElement(By.id("register_checkPwd")).clear();
//		driver.findElement(By.id("register_checkPwd")).sendKeys("sruthi123");
//		driver.findElement(By.id("Terms & Conditions & Privacy Policy")).click();
//		driver.findElement(By.className("registerButton")).click();
//
//	}
//
//	@Test
//	public void registerWithBlankTitleField() {
//		driver.findElement(By.linkText("Tu Log In / Register")).click();
//		driver.findElement(By.cssSelector(".tuButton.regToggle")).click();
//		driver.findElement(By.id("register_email")).clear();
//		driver.findElement(By.id("register_email")).sendKeys("srut@gmail.com");
//		WebElement ele = driver.findElement(By.id("register_title"));
//		Select dropdown = new Select(ele);
//		dropdown.selectByVisibleText("Select title");
//		driver.findElement(By.id("register_firstName")).clear();
//		driver.findElement(By.id("register_firstName")).sendKeys("sre");
//		driver.findElement(By.id("register_lastName")).clear();
//		driver.findElement(By.id("register_lastName")).sendKeys("kguf");
//		driver.findElement(By.id("password")).clear();
//		driver.findElement(By.id("password")).sendKeys("sruthi123");
//		driver.findElement(By.id("register_checkPwd")).clear();
//		driver.findElement(By.id("register_checkPwd")).sendKeys("sruthi123");
//		driver.findElement(By.id("Terms & Conditions & Privacy Policy")).click();
//		;
//		driver.findElement(By.className("registerButton")).click();
//
//	}
//
//	@Test
//	public void registerWithInvalidEmailAddress() {
//		driver.findElement(By.linkText("Tu Log In / Register")).click();
//		driver.findElement(By.cssSelector(".tuButton.regToggle")).click();
//		driver.findElement(By.id("register_email")).clear();
//		driver.findElement(By.id("register_email")).sendKeys("@gmail.com");
//		WebElement ele = driver.findElement(By.id("register_title"));
//		Select dropdown = new Select(ele);
//		dropdown.selectByVisibleText("Mrs");
//		driver.findElement(By.id("register_firstName")).clear();
//		driver.findElement(By.id("register_firstName")).sendKeys("sre");
//		driver.findElement(By.id("register_lastName")).clear();
//		driver.findElement(By.id("register_lastName")).sendKeys("kguf");
//		driver.findElement(By.id("password")).clear();
//		driver.findElement(By.id("password")).sendKeys("sruthi123");
//		driver.findElement(By.id("register_checkPwd")).clear();
//		driver.findElement(By.id("register_checkPwd")).sendKeys("sruthi123");
//		driver.findElement(By.id("Terms & Conditions & Privacy Policy")).click();
//		;
//		driver.findElement(By.className("registerButton")).click();
//
//	}
//
//	@Test
//	public void registerWithoutSelectingAcceptTermsAndConditions() {
//		driver.findElement(By.linkText("Tu Log In / Register")).click();
//		driver.findElement(By.cssSelector(".tuButton.regToggle")).click();
//		driver.findElement(By.id("register_email")).clear();
//		driver.findElement(By.id("register_email")).sendKeys("sruab@gmail.com");
//		WebElement ele = driver.findElement(By.id("register_title"));
//		Select dropdown = new Select(ele);
//		dropdown.selectByVisibleText("Mrs");
//		driver.findElement(By.id("register_firstName")).clear();
//		driver.findElement(By.id("register_firstName")).sendKeys("sre");
//		driver.findElement(By.id("register_lastName")).clear();
//		driver.findElement(By.id("register_lastName")).sendKeys("kguf ");
//		driver.findElement(By.id("password")).clear();
//		driver.findElement(By.id("password")).sendKeys("sruthi123");
//		driver.findElement(By.id("register_checkPwd")).clear();
//		driver.findElement(By.id("register_checkPwd")).sendKeys("sruthi123");
//		driver.findElement(By.id("Terms & Conditions & Privacy Policy")).click();
//		WebElement checkbox = driver.findElement(By.id("Terms & Conditions & Privacy Policy"));
//		if (checkbox.isSelected()) {
//			checkbox.click();
//		}
//		driver.findElement(By.className("registerButton")).click();
//
//	}
//
//	@Test
//	public void registerWithSelectingAcceptTermsAndConditions() {
//		driver.findElement(By.linkText("Tu Log In / Register")).click();
//		driver.findElement(By.cssSelector(".tuButton.regToggle")).click();
//		driver.findElement(By.id("register_email")).clear();
//		driver.findElement(By.id("register_email")).sendKeys("  ");
//		WebElement ele = driver.findElement(By.id("register_title"));
//		Select dropdown = new Select(ele);
//		dropdown.selectByVisibleText("Select title");
//		driver.findElement(By.id("register_firstName")).clear();
//		driver.findElement(By.id("register_firstName")).sendKeys("  ");
//		driver.findElement(By.id("register_lastName")).clear();
//		driver.findElement(By.id("register_lastName")).sendKeys(" ");
//		driver.findElement(By.id("password")).clear();
//		driver.findElement(By.id("password")).sendKeys(" ");
//		driver.findElement(By.id("register_checkPwd")).clear();
//		driver.findElement(By.id("register_checkPwd")).sendKeys("  ");
//		driver.findElement(By.id("Terms & Conditions & Privacy Policy")).click();
//		driver.findElement(By.className("registerButton")).click();
//
//	}
//
//	@Test
//	public void BasketPageverifyingThroughSearchButton() {
//		driver.findElement(By.id("search")).clear();
//		driver.findElement(By.id("search")).sendKeys("Skirts");
//		driver.findElement(By.cssSelector(".button.searchButton")).click();
//		driver.findElement(By.linkText("Corduroy Mini Skirt")).click();
//		WebElement e = driver.findElement(By.id("Size"));
//		Select s = new Select(e);
//		s.selectByIndex(3);
//		WebElement q1 = driver.findElement(By.id("qty"));
//		Select qty = new Select(q1);
//		qty.selectByIndex(2);
//		driver.findElement(By.id("addToCartButton")).click();
//		driver.findElement(By.id("basket-title")).click();
//		driver.findElement(By.cssSelector(".active .doCheckoutBut.tuButton")).click();
//		WebElement up = driver.findElement(By.id("quantity0"));
//		Select update = new Select(up);
//		update.selectByValue("4");
//		driver.findElement(By.id("QuantityProduct_0")).click();
//		driver.findElement(By.id("RemoveProduct_0")).click();
//		driver.findElement(By.id("basketButtonBottom")).click();
//
//	}
//
//	@Test
//	public void BasketPageverifyingThroughSelectingProductFromCategory() {
//		Actions builder = new Actions(driver);
//		WebElement ele = driver.findElement(By.linkText("Women"));
//		builder.moveToElement(ele).build().perform();
//		driver.findElement(By.linkText("Skirts")).click();
//		driver.findElement(By.linkText("2")).click();
//		driver.findElement(By.linkText("Corduroy Mini Skirt")).click();
//		driver.findElement(By.id("Size")).click();
//		WebElement sz = driver.findElement(By.id("Size"));
//		Select size = new Select(sz);
//		size.selectByIndex(4);
//		driver.findElement(By.id("qty"));
//		WebElement q = driver.findElement(By.xpath(("//span[@class='qtyBox']//select[@name='qty']")));
//		Select qty = new Select(q);
//		qty.selectByIndex(2);
//		driver.findElement(By.id("addToCartButton")).click();
//		driver.findElement(By.id("basket-title")).click();
//		driver.findElement(By.cssSelector(".active .doCheckoutBut.tuButton")).click();
//		WebElement up = driver.findElement(By.id("quantity0"));
//		Select update = new Select(up);
//		update.selectByValue("4");
//		driver.findElement(By.id("QuantityProduct_0")).click();
//		driver.findElement(By.id("RemoveProduct_0")).click();
//
//	}
//
//	@Test
//	public void BasketPageverifyingThroughWithoutSelectingAnyProduct() {
//		WebElement view = driver.findElement(By.id("basket-title"));
//		Actions basket = new Actions(driver);
//		basket.moveToElement(view).build().perform();
//		if (view.isDisplayed()) {
//			System.out.println(view.getText());
//		}
//	}
//
//	@Test
//	public void addProductToBasketByUsingSearchButton() {
//		driver.findElement(By.id("search")).clear();
//		driver.findElement(By.id("search")).sendKeys("Skirts");
//		driver.findElement(By.cssSelector(".button.searchButton")).click();
//		driver.findElement(By.linkText("Corduroy Mini Skirt")).click();
//		WebElement e = driver.findElement(By.id("Size"));
//		Select s = new Select(e);
//		s.selectByIndex(3);
//		WebElement q1 = driver.findElement(By.id("qty"));
//		Select qty = new Select(q1);
//		qty.selectByIndex(3);
//		driver.findElement(By.id("addToCartButton")).click();
//
//	}
//
//	@Test
//	public void addToBasket() throws InterruptedException {
//		Actions builder = new Actions(driver);
//		WebElement ele = driver.findElement(By.linkText("Women"));
//		builder.moveToElement(ele).build().perform();
//		driver.findElement(By.linkText("Skirts")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.linkText("2")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.linkText("Corduroy Mini Skirt")).click();
//		driver.findElement(By.id("Size")).click();
//		WebElement sz = driver.findElement(By.id("Size"));
//		Select size = new Select(sz);
//		size.selectByIndex(5);
//		driver.findElement(By.id("qty")).click();
//		WebElement q = driver.findElement(By.xpath(("//span[@class='qtyBox']//select[@name='qty']")));
//		Select qty = new Select(q);
//		qty.selectByIndex(2);
//		driver.findElement(By.id("addToCartButton")).click();
//
//	}
//
//	@Test
//	public void addProductToBasketWithOutSelectingSize() throws InterruptedException {
//		Actions builder = new Actions(driver);
//		WebElement ele = driver.findElement(By.linkText("Women"));
//		builder.moveToElement(ele).build().perform();
//		driver.findElement(By.linkText("Skirts")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.linkText("2")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.linkText("Corduroy Mini Skirt")).click();
//		driver.findElement(By.id("Size")).click();
//		WebElement sz = driver.findElement(By.id("Size"));
//		Select size = new Select(sz);
//		size.selectByIndex(0);
//		driver.findElement(By.id("qty")).click();
//		WebElement q = driver.findElement(By.id("qty"));
//		Select qty = new Select(q);
//		qty.selectByIndex(5);
//		driver.findElement(By.id("addToCartButton")).click();
//	}
//
//	@Test
//	public void homeDeliveryWithValidData() throws InterruptedException {
//		driver.findElement(By.id("search")).clear();
//		driver.findElement(By.id("search")).sendKeys("Skirts");
//		driver.findElement(By.cssSelector(".button.searchButton")).click();
//		driver.findElement(By.linkText("Navy Quilted Skirt")).click();
//		WebElement e = driver.findElement(By.id("Size"));
//		Select s = new Select(e);
//		s.selectByIndex(3);
//		WebElement q1 = driver.findElement(By.id("qty"));
//		Select qty = new Select(q1);
//		qty.selectByIndex(2);
//		driver.findElement(By.id("addToCartButton")).click();
//		driver.findElement(By.id("basket-title")).click();
//		driver.findElement(By.cssSelector(".active .doCheckoutBut.tuButton")).click();
//		driver.findElement(By.id("QuantityProduct_0")).click();
//		driver.findElement(By.id("basketButtonBottom")).click();
//		driver.findElement(By.id("guest_email")).clear();
//		driver.findElement(By.id("guest_email")).sendKeys("saag@gmail.com");
//		driver.findElement(By.cssSelector(".checkout-loginoption--right .button.orange")).click();
//		driver.findElement(By.xpath("//li[@class='customer-options--item']//label[@for='HOME_DELIVERY']")).click();
//		driver.findElement(By.cssSelector(".center.button.orange")).click();
//		WebElement dropdown2 = driver.findElement(By.id("address.title"));
//		Select homedeliveryTitle = new Select(dropdown2);
//		homedeliveryTitle.selectByValue("mrs");
//		driver.findElement(By.id("address.firstName")).clear();
//		driver.findElement(By.id("address.firstName")).sendKeys("sru");
//		driver.findElement(By.id("address.surname")).clear();
//		driver.findElement(By.id("address.surname")).sendKeys("khdsufhh");
//		driver.findElement(By.id("addressDeliveryhouseNameOrNumber")).clear();
//		driver.findElement(By.id("addressDeliveryhouseNameOrNumber")).sendKeys("Residential Care Home");
//		driver.findElement(By.id("addressPostcode")).clear();
//		driver.findElement(By.id("addressPostcode")).sendKeys("RH1 1HH");
//		Thread.sleep(1000);
//		driver.findElement(By.cssSelector(".secondaryButton.address-lookup")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector(("#continue"))).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//li[@class='customer-options--item']//label[@for='standard-delivery']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.cssSelector("input[value='Continue']")).click();
//		driver.findElement(By.cssSelector(".button.orange.center")).click();
//		WebElement ele = driver.findElement(By.id("newTitle"));
//		Select drop = new Select(ele);
//		drop.selectByValue("mrs");
//		driver.findElement(By.id("newFirstName")).clear();
//		driver.findElement(By.id("newFirstName")).sendKeys("sgas");
//		driver.findElement(By.id("newSurname")).clear();
//		driver.findElement(By.id("newSurname")).sendKeys("sdgas");
//		driver.findElement(By.id("addressDeliveryhouseNameOrNumber")).clear();
//		driver.findElement(By.id("addressDeliveryhouseNameOrNumber")).sendKeys("20");
//		driver.findElement(By.id("addressPostcode")).sendKeys("Rh10 6TL");
//		Thread.sleep(1000);
//		driver.findElement(By.cssSelector(".secondaryButton.address-lookup")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("termsAndConditionsId")).click();
//		driver.findElement(By.id("contPayment")).click();
//		System.out.println(driver.getTitle());
//		driver.switchTo().frame("cardPaymentFrame");
//		driver.findElement(By.id("cardNumber")).sendKeys("1234567891256437");
//		Thread.sleep(1000);
//		driver.findElement(By.id("cardholderName")).sendKeys("sruthi");
//		WebElement ele1 = driver.findElement(By.id("expiryMonth"));
//		Select num = new Select(ele1);
//		num.selectByValue("01");
//		WebElement ele2 = driver.findElement(By.id("expiryYear"));
//		Select num1 = new Select(ele2);
//		num1.selectByValue("2018");
//		driver.findElement(By.id("csc")).sendKeys("0314");
//		driver.findElement(By.xpath("//div[@id='commands']//input[@id='btnSubmit']")).click();
//		Thread.sleep(2000);
//		String message = "Invalid card number";
//		if (message.contains("Invalid card number")) {
//			System.out.println("True");
//
//		} else {
//			System.out.println("False");
//		}
//		driver.findElements(By.cssSelector(".customer-options--cta")).get(0).click();
//
//	}
//
//	@Test
//	public void clickAndCollect() throws InterruptedException {
//		driver.findElement(By.id("search")).clear();
//		driver.findElement(By.id("search")).sendKeys("Skirts");
//		driver.findElement(By.cssSelector(".button.searchButton")).click();
//		driver.findElement(By.linkText("Corduroy Mini Skirt")).click();
//		WebElement e = driver.findElement(By.id("Size"));
//		Select s = new Select(e);
//		s.selectByIndex(3);
//		WebElement q1 = driver.findElement(By.id("qty"));
//		Select qty = new Select(q1);
//		qty.selectByIndex(1);
//		driver.findElement(By.id("addToCartButton")).click();
//		driver.findElement(By.id("basket-title")).click();
//		driver.findElement(By.cssSelector(".active .doCheckoutBut.tuButton")).click();
//		WebElement up = driver.findElement(By.id("quantity0"));
//		Select update = new Select(up);
//		update.selectByValue("1");
//		driver.findElement(By.id("QuantityProduct_0")).click();
//		driver.findElement(By.id("RemoveProduct_0")).click();
//		driver.findElement(By.id("basketButtonBottom")).click();
//		driver.findElement(By.id("guest_email")).clear();
//		driver.findElement(By.id("guest_email")).sendKeys("saag@gmail.com");
//		driver.findElement(By.cssSelector(".checkout-loginoption--right .button.orange")).click();
//		driver.findElement(By.cssSelector(".customer-options--title")).click();
//		driver.findElement(By.cssSelector(".center.button.orange")).click();
//		Thread.sleep(2000);
//	}
//
//	@Test
//	public void deliverySelectingClickAndCollectThroughLoginDetails() {
//		driver.findElement(By.id("search")).clear();
//		driver.findElement(By.id("search")).sendKeys("Skirts");
//		driver.findElement(By.cssSelector(".button.searchButton")).click();
//		driver.findElement(By.linkText("Corduroy Mini Skirt")).click();
//		WebElement e = driver.findElement(By.id("Size"));
//		Select s = new Select(e);
//		s.selectByIndex(3);
//		WebElement q1 = driver.findElement(By.id("qty"));
//		Select qty = new Select(q1);
//		qty.selectByIndex(3);
//		driver.findElement(By.id("addToCartButton")).click();
//		driver.findElement(By.id("basket-title")).click();
//		driver.findElement(By.cssSelector(".active .doCheckoutBut.tuButton")).click();
//		String message = "There were items in your basket the last time you logged out, so we've added them to your current basket.";
//		if (message.contains(
//				"There were items in your basket the last time you logged out, so we've added them to your current basket.")) {
//			System.out.println(message);
//			driver.switchTo().defaultContent();
//		}
//		driver.findElement(By.id("QuantityProduct_0")).click();
//		driver.findElement(By.id("RemoveProduct_0")).click();
//		String update = "Product quantity has been updated";
//		if (update.contains("Product quantity has been updated.")) {
//			System.out.println(update);
//			driver.switchTo().defaultContent();
//		}
//		driver.findElement(By.id("basketButtonBottom")).click();
//		driver.findElement(By.id("j_username")).clear();
//		driver.findElement(By.id("j_username")).sendKeys("srut@gmail.com");
//		driver.findElement(By.id("j_password")).clear();
//		driver.findElement(By.id("j_password")).sendKeys("sruthi123");
//		driver.findElement(By.cssSelector(".checkout-loginoption--left .button.orange")).click();
//		driver.findElement(By.id("basketButtonBottom")).click();
//		driver.findElement(By.xpath("//li[@class='customer-options--item']//label[@for='HOME_DELIVERY']")).click();
//
//	}
//
//	@Test
//	public void SelectingHomeDeliveryThroughLoginDetails() {
//		driver.findElement(By.id("search")).clear();
//		driver.findElement(By.id("search")).sendKeys("Skirts");
//		driver.findElement(By.cssSelector(".button.searchButton")).click();
//		driver.findElement(By.linkText("Corduroy Mini Skirt")).click();
//		WebElement e = driver.findElement(By.id("Size"));
//		Select s = new Select(e);
//		s.selectByIndex(3);
//		WebElement q1 = driver.findElement(By.id("qty"));
//		Select qty = new Select(q1);
//		qty.selectByIndex(3);
//		driver.findElement(By.id("addToCartButton")).click();
//		driver.findElement(By.id("basket-title")).click();
//		driver.findElement(By.cssSelector(".active .doCheckoutBut.tuButton")).click();
//		WebElement up = driver.findElement(By.id("quantity0"));
//		Select update = new Select(up);
//		update.selectByValue("2");
//		driver.findElement(By.id("QuantityProduct_0")).click();
//		driver.findElement(By.id("RemoveProduct_0")).click();
//		driver.findElement(By.id("basketButtonBottom")).click();
//		driver.findElement(By.id("j_username")).clear();
//		driver.findElement(By.id("j_username")).sendKeys("srut@gmail.com");
//		driver.findElement(By.id("j_password")).clear();
//		driver.findElement(By.id("j_password")).sendKeys("sruthi123");
//		driver.findElement(By.cssSelector(".checkout-loginoption--left .button.orange")).click();
//		// driver.findElement(By.xpath("html/body/div[6]/div/div[2]/form/ul/li[2]/label/h3")).click();
//		driver.findElement(By.xpath("//li[@class='customer-options--item']//label[@for='HOME_DELIVERY']")).click();
//
//	}
//
//	@Test
//	public void throughGuestCheckOutSelectingHomeDelivery() {
//		driver.findElement(By.id("search")).clear();
//		driver.findElement(By.id("search")).sendKeys("Skirts");
//		driver.findElement(By.cssSelector(".button.searchButton")).click();
//		driver.findElement(By.linkText("Corduroy Mini Skirt")).click();
//		WebElement e = driver.findElement(By.id("Size"));
//		Select s = new Select(e);
//		s.selectByIndex(3);
//		WebElement q1 = driver.findElement(By.id("qty"));
//		Select qty = new Select(q1);
//		qty.selectByIndex(3);
//		driver.findElement(By.id("addToCartButton")).click();
//		driver.findElement(By.id("basket-title")).click();
//		driver.findElement(By.cssSelector(".active .doCheckoutBut.tuButton")).click();
//		WebElement up = driver.findElement(By.id("quantity0"));
//		Select update = new Select(up);
//		update.selectByValue("4");
//		driver.findElement(By.id("QuantityProduct_0")).click();
//		driver.findElement(By.id("RemoveProduct_0")).click();
//		driver.findElement(By.id("basketButtonBottom")).click();
//		driver.findElement(By.id("guest_email")).clear();
//		driver.findElement(By.id("guest_email")).sendKeys("saag@gmail.com");
//		driver.findElement(By.cssSelector(".checkout-loginoption--right .button.orange")).click();
//		// driver.findElement(By.xpath("html/body/div[6]/div/div[2]/form/ul/li[2]/label/h3")).click();
//		driver.findElement(By.xpath("//li[@class='customer-options--item']//label[@for='HOME_DELIVERY']")).click();
//	}
//
//	@Test
//	public void throughGuestCheckoutWithClickAndCollect() {
//		driver.findElement(By.id("search")).clear();
//		driver.findElement(By.id("search")).sendKeys("Skirts");
//		driver.findElement(By.cssSelector(".button.searchButton")).click();
//		driver.findElement(By.linkText("Corduroy Mini Skirt")).click();
//		WebElement e = driver.findElement(By.id("Size"));
//		Select s = new Select(e);
//		s.selectByIndex(4);
//		WebElement q1 = driver.findElement(By.id("qty"));
//		Select qty = new Select(q1);
//		qty.selectByIndex(2);
//		driver.findElement(By.id("addToCartButton")).click();
//		driver.findElement(By.id("basket-title")).click();
//		driver.findElement(By.cssSelector(".active .doCheckoutBut.tuButton")).click();
//		WebElement up = driver.findElement(By.id("quantity0"));
//		Select update = new Select(up);
//		update.selectByValue("4");
//		driver.findElement(By.id("QuantityProduct_0")).click();
//		driver.findElement(By.id("RemoveProduct_0")).click();
//		driver.findElement(By.id("basketButtonBottom")).click();
//		driver.findElement(By.id("guest_email")).clear();
//		driver.findElement(By.id("guest_email")).sendKeys("saag@gmail.com");
//		driver.findElement(By.cssSelector(".checkout-loginoption--right .button.orange")).click();
//		driver.findElement(By.cssSelector(".customer-options--title")).click();
//
//	}
//
//	@Test
//	public void guestCheckoutUsingRegisteredEmail() {
//		driver.findElement(By.id("search")).clear();
//		driver.findElement(By.id("search")).sendKeys("Skirts");
//		driver.findElement(By.cssSelector(".button.searchButton")).click();
//		driver.findElement(By.linkText("Corduroy Mini Skirt")).click();
//		WebElement e = driver.findElement(By.id("Size"));
//		Select s = new Select(e);
//		s.selectByIndex(3);
//		WebElement q1 = driver.findElement(By.id("qty"));
//		Select qty = new Select(q1);
//		qty.selectByIndex(3);
//		driver.findElement(By.id("addToCartButton")).click();
//		driver.findElement(By.id("basket-title")).click();
//		driver.findElement(By.cssSelector(".active .doCheckoutBut.tuButton")).click();
//		WebElement up = driver.findElement(By.id("quantity0"));
//		Select update = new Select(up);
//		update.selectByValue("4");
//		driver.findElement(By.id("QuantityProduct_0")).click();
//		driver.findElement(By.id("RemoveProduct_0")).click();
//		driver.findElement(By.id("basketButtonBottom")).click();
//		driver.findElement(By.id("guest_email")).clear();
//		driver.findElement(By.id("guest_email")).sendKeys("srut@gmail.com");
//		driver.findElement(By.cssSelector(".checkout-loginoption--right .button.orange")).click();
//		String error = "You already have a Tu account. Please login to continue";
//		if (error.equals("You already have a Tu account. Please login to continue")) {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
//
//	}
//
//	@Test
//	public void CheckOutAsAGuestThroughProductcategorySearch() {
//		Actions builder = new Actions(driver);
//		WebElement ele = driver.findElement(By.linkText("Women"));
//		builder.moveToElement(ele).build().perform();
//		driver.findElement(By.linkText("Skirts")).click();
//		driver.findElement(By.linkText("2")).click();
//		driver.findElement(By.linkText("Premium Embroidered Mesh Skirt")).click();
//		driver.findElement(By.id("Size")).click();
//		WebElement sz = driver.findElement(By.id("Size"));
//		Select size = new Select(sz);
//		size.selectByIndex(3);
//		WebElement q1 = driver.findElement(By.id("qty"));
//		Select qty = new Select(q1);
//		qty.selectByIndex(3);
//		driver.findElement(By.id("addToCartButton")).click();
//		driver.findElement(By.id("basket-title")).click();
//		driver.findElement(By.cssSelector(".active .doCheckoutBut.tuButton")).click();
//		WebElement up = driver.findElement(By.id("quantity0"));
//		Select update = new Select(up);
//		update.selectByValue("4");
//		driver.findElement(By.id("QuantityProduct_0")).click();
//		driver.findElement(By.id("RemoveProduct_0")).click();
//		driver.findElement(By.id("basketButtonBottom")).click();
//		driver.findElement(By.id("guest_email")).clear();
//		driver.findElement(By.id("guest_email")).sendKeys("ssag@gmail.com");
//		driver.findElement(By.cssSelector(".checkout-loginoption--right .button.orange")).click();
//
//	}
//
//	@Test
//	public void UsingGuestCheckOutWithBlankEmailAddress() {
//		Actions builder = new Actions(driver);
//		WebElement ele = driver.findElement(By.linkText("Women"));
//		builder.moveToElement(ele).build().perform();
//		driver.findElement(By.linkText("Skirts")).click();
//		driver.findElement(By.linkText("2")).click();
//		driver.findElement(By.linkText("Premium Embroidered Mesh Skirt")).click();
//		driver.findElement(By.id("Size")).click();
//		WebElement sz = driver.findElement(By.id("Size"));
//		Select size = new Select(sz);
//		size.selectByIndex(3);
//		WebElement q1 = driver.findElement(By.id("qty"));
//		Select qty = new Select(q1);
//		qty.selectByIndex(3);
//		driver.findElement(By.id("addToCartButton")).click();
//		driver.findElement(By.id("basket-title")).click();
//		driver.findElement(By.cssSelector(".active .doCheckoutBut.tuButton")).click();
//		WebElement up = driver.findElement(By.id("quantity0"));
//		Select update = new Select(up);
//		update.selectByValue("4");
//		driver.findElement(By.id("QuantityProduct_0")).click();
//		driver.findElement(By.id("RemoveProduct_0")).click();
//		driver.findElement(By.id("basketButtonBottom")).click();
//		driver.findElement(By.id("guest_email")).clear();
//		driver.findElement(By.id("guest_email")).sendKeys("  ");
//		driver.findElement(By.cssSelector(".checkout-loginoption--right .button.orange")).click();
//		String Error = "Please enter a valid email address";
//		if (Error.contains("Please enter a valid email address")) {
//			System.out.println(Error);
//
//		}
//	}
//
//	@Test
//	public void guestCheckOutUsingNewMailAddress() {
//		driver.findElement(By.id("search")).clear();
//		driver.findElement(By.id("search")).sendKeys("Skirts");
//		driver.findElement(By.cssSelector(".button.searchButton")).click();
//		driver.findElement(By.linkText("Corduroy Mini Skirt")).click();
//		WebElement e = driver.findElement(By.id("Size"));
//		Select s = new Select(e);
//		s.selectByIndex(3);
//		WebElement q1 = driver.findElement(By.id("qty"));
//		Select qty = new Select(q1);
//		qty.selectByIndex(3);
//		driver.findElement(By.id("addToCartButton")).click();
//		driver.findElement(By.id("basket-title")).click();
//		driver.findElement(By.cssSelector(".active .doCheckoutBut.tuButton")).click();
//		WebElement up = driver.findElement(By.id("quantity0"));
//		Select update = new Select(up);
//		update.selectByValue("4");
//		driver.findElement(By.id("QuantityProduct_0")).click();
//		driver.findElement(By.id("RemoveProduct_0")).click();
//		driver.findElement(By.id("basketButtonBottom")).click();
//		driver.findElement(By.id("guest_email")).clear();
//		driver.findElement(By.id("guest_email")).sendKeys("saffg@gmail.com");
//		driver.findElement(By.cssSelector(".checkout-loginoption--right .button.orange")).click();
//
//	}
//
//	@Test
//	public void paginationSortBy() {
//		driver.findElement(By.id("search")).clear();
//		driver.findElement(By.id("search")).sendKeys("Dress");
//		driver.findElement(By.className("searchButton")).click();
//		;
//		driver.findElement(By.id("sortOptions1")).click();
//		;
//		Select options = new Select(driver.findElement(By.id("sortOptions1")));
//		options.selectByIndex(2);
//
//	}
//
//	@Test
//	public void paginationShowPerPage() {
//		driver.findElement(By.id("search")).clear();
//		driver.findElement(By.id("search")).sendKeys("Dress");
//		driver.findElement(By.className("searchButton")).click();
//		driver.findElement(By.className("prodFoundShowAll")).click();
//
//	}
//
//	@Test
//	public void pagination() {
//		driver.findElement(By.id("search")).clear();
//		driver.findElement(By.id("search")).sendKeys("Dress");
//		driver.findElement(By.className("searchButton")).click();
//		driver.findElement(By.linkText("2")).click();
//		driver.navigate().back();
//
//	}
//
//	@Test
//	public void colourFunctionality() {
//		driver.findElement(By.id("search")).clear();
//		driver.findElement(By.id("search")).sendKeys("Dress");
//		driver.findElement(By.className("searchButton")).click();
//		driver.findElement(By.xpath("html/body/div[9]/div/div[2]/div[1]/div/div[4]/div[2]/div[1]/ul/li[6]/form/label"))
//				.click();
//
//	}
//
//	@AfterTest
//	public void end() {
//		driver.close();
//	}
//}
