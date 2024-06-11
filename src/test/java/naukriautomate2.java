import org.apache.logging.log4j.core.appender.rolling.action.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukriautomate2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();//maximize the window 
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@id=\'login_Layer\']")).click();
		//driver.findElement(By.xpath("//input[@placeholder=\'Enter your active Email ID / Username\']")).click();
		//driver.findElement(By.xpath(//input[@placeholder='Enter your password']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder=\'Enter your active Email ID / Username\']")).sendKeys("rajput.rishika24@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\'Enter your password\']")).sendKeys("Rishika24#");
		driver.findElement(By.xpath("//button[@type=\'submit\']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt=\'naukri user profile img\']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@href,\'/mnjuser/profile?id=&altresid\')]")).click();
		
		driver.findElement(By.xpath("//span[contains(@class,\'edit icon\')]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//tdriverextarea[@rel=\'required:resumeHeadline,custom:validChar\']")).clear();
		//Thread.sleep(2000);
		//driver.findElement (By.xpath("//tdriverextarea[@rel=\'required:resumeHeadline,custom:validChar\']")).sendKeys("2.6 Years Exp. in Selenium, WebDriver, Java, TestNG, Maven, Jenkins, SVN,API Testing, Regression,Mobile Testing,Page Object Model, Agile,Automation testing, Manual Testing, Framework Design, SQL, Web Services, Grid, JIRA, Cucumber, Git Rest assured");
		
		
		//JavascriptExecutor newDriver =(JavascriptExecutor)driver;
		//newDriver.executeScript("document.getElementById('email').Value='rajput.rishika24@gmail.com'");
		//newDriver.executeScript("document.getElementById('pass').Value='rishika24#'");
		
		// TODO Auto-generated method stub

	}

}
