package BENCH.JENKINS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class HomePage {
	WebDriver driver;

	@BeforeClass
	public void startBrowser(){
		System.setProperty("webdriver.chrome.drier",  "\\drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

 

        driver.get("https://blazedemo.com/index.php");
	/*driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	*driver.get("https://blazedemo.com/index.php");
	*/}

	@AfterClass
	public void stopBrowser(){
	driver.quit();
	}
}
