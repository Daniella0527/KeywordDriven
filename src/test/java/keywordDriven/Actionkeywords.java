package keywordDriven;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Actionkeywords {
	
	
static WebDriver driver;
static String arr[] = new String[10];
static String restored;


public static void OPENBROWSER()
{
	WebDriverManager.chromedriver().setup();
	 //driver = new FirefoxDriver();
	driver = new ChromeDriver();
    driver.manage().window().maximize();
    
}

public static void CloseBrowser() throws InterruptedException
{
	Thread.sleep(10000);
	driver.quit();


}

public static void NAVIGATEURL(String URL)
{
	String finalurl =  URL;
	driver.get(finalurl);
}


private static By locatorValue(String locatorType, String value) {
    By by;
    switch (locatorType) {
        case "id":
            by = By.id(value);
            break;
        case "name":
            by = By.name(value);
            break;
        case "xpath":
            by = By.xpath(value);
            break;
        case "css":
            by = By.cssSelector(value);
            break;
        case "linkText":
            by = By.linkText(value);
            break;
        case "partialLinkText":
            by = By.partialLinkText(value);
            break;
        case "className":
            by = By.className(value);
            break;
        default:
            by = null;
            break;
    }
    return by;
}

public static void ENTERTEXT(String locatorType, String value, String text) {
    By locator = locatorValue(locatorType, value);
    WebElement element = driver.findElement(locator);
    element.sendKeys(text);
	
}


public static void WAIT(String value) {
	
	int wait = Integer.valueOf(value);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(wait));
}

public static void UPLOADFILE(String locatorType, String value, String text) {
	
	 By locator = locatorValue(locatorType, value);
	 WebElement element = driver.findElement(locator);
	
	 element.sendKeys(text);
}
public static void CHECKURL(String value) {
	
	String URL = driver.getCurrentUrl();
	
	
	if(URL.contains(value)) {
		
	
		System.out.println("Equals");
	
	}
	
	else {
		
		System.out.println("Wrong");
	}
	
	
}


public static void CLICKBUTTON(String locatorType, String value) {
	By locator = locatorValue(locatorType, value);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	wait.until(ExpectedConditions.elementToBeClickable(locator));
    WebElement element = driver.findElement(locator);
    element.click();
}


		public static void EnterWhitelistedCN(String locatorType, String value) {
		    By locator = locatorValue(locatorType, value);
		    WebElement element = driver.findElement(locator);
		    element.sendKeys("09271271316");
			
		}
		
		public static void RandomDate(String locatorType, String value) {
			By locator = locatorValue(locatorType, value);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			wait.until(ExpectedConditions.elementToBeClickable(locator));
		    WebElement calendar = driver.findElement(locator);
		    calendar.click();
		    
		    WebElement month = driver.findElement(By.xpath("/html/body/app-root/app-home/div[2]/div/div[2]/app-customer-info/div/form/div[3]/div[1]/div/ngb-datepicker/div[1]/ngb-datepicker-navigation/ngb-datepicker-navigation-select/select[1]"));
				   
		    int x = (int) (Math.random()* 10)+1;
				 
				   switch (x) {
				   
				
		            case 1:
		                 month.sendKeys("January");
		                  break;

		            case 2:
		            	month.sendKeys("February");
		                  break;

		            case 3:
		            	month.sendKeys("March");
		                  break;

		            case 4:
		            	month.sendKeys("April");
		                  break;

		            case 5:
		            	month.sendKeys("May");
		                  break;

		            case 6:
		            	month.sendKeys("June");
		                  break;

		            case 7:
		            	month.sendKeys("July");
		                  break;

		            case 8:
		            	month.sendKeys("August");
		                  break;

		            case 9:
		            	month.sendKeys("September");
		                  break;

		            case 10:
		            	month.sendKeys("October");
		                  break;

		            case 11:
		            	month.sendKeys("November");
		                  break;

		            case 12:
		            	month.sendKeys("December");
		                  break;

		            default:
		            	System.out.print("Invalid month.");
		                  break;

		            }
				   //Select Year
				   int c = (int) (Math.random()* 2003) + 1920;
				   String str1 = Integer.toString(c);
				   WebElement years = driver.findElement(By.xpath("/html/body/app-root/app-home/div[2]/div/div[2]/app-customer-info/div/form/div[3]/div[1]/div/ngb-datepicker/div[1]/ngb-datepicker-navigation/ngb-datepicker-navigation-select/select[2]"));
				   years.sendKeys(str1);	
				   
				   
				   // Select Day
				   int a = (int) (Math.random()* 6) + 2;
				   int b = (int) (Math.random()* 7) + 1;
				   String day = "/html/body/app-root/app-home/div[2]/div/div[2]/app-customer-info/div/form/div[3]/div[1]/div/ngb-datepicker/div[2]/div/ngb-datepicker-month/div["+ a + "]/div[" + b + "]/div";
				   WebElement days = driver.findElement(By.xpath(day));
				   days.click();	   
	
				
}
		
		
		public static void SELECTDROPDOWN(String locatorType, String value, String text) {
		    By locator = locatorValue(locatorType, value);
		
			
			    WebElement dropdown = driver.findElement(locator);
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); //here, wait time is 20 seconds
				
				wait.until(ExpectedConditions.visibilityOf(dropdown));
				dropdown.click();
				
				Select Cdropdown = new Select(dropdown);
				Cdropdown.selectByVisibleText(text);
				dropdown.sendKeys(text);
				
				
}
	
		
		
		
		public static void OPENNEWTAB(String URL) throws Exception {
			//Use robot class to press Ctrl+t keys
			
			Thread.sleep(5000);
			  Robot robot = new Robot();                          
		       robot.keyPress(KeyEvent.VK_CONTROL); 
		        robot.keyPress(KeyEvent.VK_T); 
		        robot.keyRelease(KeyEvent.VK_CONTROL); 
		        robot.keyRelease(KeyEvent.VK_T);
		        Thread.sleep(1000);
		        String finalurl =  URL;
		    	
		        Set<String> handles = driver.getWindowHandles();
		        List<String> handlesList = new ArrayList<String>(handles);
		        String newTab = handlesList.get(handlesList.size() - 1);
              
                	// WebDriverWait wait = new WebDriverWait(driver, 20);
                //	wait.until(ExpectedConditions.titleIs("New Tab"));
                	//wait.until(ExpectedConditions.titleContains("New Tab"));
		        
                	 driver.switchTo().window(newTab); 
                    driver.get(finalurl);  
                    
		}
		public static void COPY(String locatorType, String value) {
				By locator = locatorValue(locatorType, value);
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
				wait.until(ExpectedConditions.presenceOfElementLocated(locator));
				wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
				wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
				wait.until(ExpectedConditions.elementToBeClickable(locator));
			    
				JavascriptExecutor js = (JavascriptExecutor) driver;
			       js.executeScript("window.scrollBy(0,-350)", "");
				
				
			restored = driver.findElement(locator).getText();
			System.out.print(restored);
		}
		
		public static void PASTE(String locatorType, String value) throws InterruptedException {
			By locator = locatorValue(locatorType, value);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			wait.until(ExpectedConditions.elementToBeClickable(locator));
			
			WebElement paste = driver.findElement(locator);
			paste.sendKeys(restored);
			Actionkeywords.COPY(locatorType, value);
			
			System.out.print(restored);
	}
		
		public static void WaitLogger(String locatorType, String value) {
			By locator = locatorValue(locatorType, value);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));		
		
}
                
		public static void IDLE(String value) throws InterruptedException {
			
			int wait = Integer.valueOf(value);
			Thread.sleep(wait);
		}         
}
		
		

		