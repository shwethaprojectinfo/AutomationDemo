package genericLabrories;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {
	
	public WebDriver driver;
	public FileUtilities fu = new FileUtilities();
	//public ExcelUtilities ex = new ExcelUtilities();

	@BeforeClass
	public void launchBrowser() throws IOException {
		String Browser = fu.getPropertyData("Browser");
		if (Browser.equals("chrome")) {
//			ChromeOptions op=new ChromeOptions();
//			op.addArguments("--headless");
			driver = new ChromeDriver();
		}
		if (Browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		if (Browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		String url = fu.getPropertyData("baseUrl");
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Paths.implicitlyWaitDuration));
	}
	
	
	
	@AfterClass
	public void closeTheBrowser() {

		driver.close();
		System.out.println("--------------Close the Browser------------");
	}


}
