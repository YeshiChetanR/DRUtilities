package utilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Env 
{
	static WebDriver driver = null;
	static String browserName = null;
	static String env = null;
	static String testcase = null;
	static String cloudBrowserConfigFile = null;
	static String cloudPlatformConfigFile = null;
	static String currentPath = System.getProperty("user.dir");
	static Properties prop = new Properties();
	static Dimension d  = new Dimension(600,800);
	
	public static String getBrowserName()
	{
		browserName = System.getProperty("browser");
		
		if(browserName == null)
		{

			browserName = "firefox";

			}

		return browserName;
	}
	
	public static String getEnv()
	{
		env = System.getProperty("env");
		

		if(env == null)
		{
			env = "qa";
			
			}
		env="https://access."+env+".redhat.com";
		return env;
	}
	
	public static WebDriver CreateWebDriver(String browser)
	{       
		    testcase = System.getProperty("case");
			//System.out.println("Browser: " + browser+ " and case : "+testcase);
			
					
					
			switch (browser.toLowerCase()) {
			case "phantom":
				String Node3 = "http://jenkins-qa.gsslab.pnq2.redhat.com:4444/wd/hub";
				 DesiredCapabilities cap4 = DesiredCapabilities.firefox();
				 cap4.setCapability("acceptSslCerts", true);			 
				 try {
					driver = new RemoteWebDriver(new URL(Node3), cap4);
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case "grid":
				String Nodegrid = "http://jenkins-qa.gsslab.pnq2.redhat.com:4449/wd/hub";
				DesiredCapabilities capgrid = DesiredCapabilities.chrome();
				try {
					driver = new RemoteWebDriver(new URL(Nodegrid), capgrid);
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case "firefox":
				String firefoxNode = "https://nancyjain1:xs9bpjAy8qm13MVvKxYF@hub-cloud.browserstack.com/wd/hub";
				
				

			      DesiredCapabilities firefoxCap = DesiredCapabilities.firefox();
			      firefoxCap.setCapability("browserstack.local", "true");
			      firefoxCap.setCapability("browserstack..networkLogs", "true");
			      firefoxCap.setCapability("browser", "Firefox");
			      firefoxCap.setCapability("browser_version", "67.0 beta");
			      firefoxCap.setCapability("os", "Windows");
			      firefoxCap.setCapability("os_version", "10");
			      firefoxCap.setBrowserName("firefox");
			      firefoxCap.setCapability("acceptSslCerts", true);
			      
			      try {
			      driver = new RemoteWebDriver(new URL(firefoxNode), firefoxCap);
			     } catch (MalformedURLException e) {
			      // TODO Auto-generated catch block
			      e.printStackTrace();
			     }
			     break;

			case "chrome":
				String Node = "http://jenkins-qa.gsslab.pnq2.redhat.com:4545/wd/hub";
				DesiredCapabilities cap = DesiredCapabilities.chrome();
				 cap.setBrowserName("chrome");
				 
				 try {
					driver = new RemoteWebDriver(new URL(Node), cap);
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

			case "gridgcs":
				String Node10 = "http://jenkins-qa.gsslab.pnq2.redhat.com:4444/wd/hub";
				DesiredCapabilities cap10 = DesiredCapabilities.chrome();
				try {
					driver = new RemoteWebDriver(new URL(Node10), cap10);
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case "internetexplorer":
				//driver = new InternetExplorerDriver();
				
				String Node5 = "http://jenkins-qa.gsslab.pnq2.redhat.com:4545/wd/hub";
				 DesiredCapabilities cap5 = DesiredCapabilities.internetExplorer();
				 cap5.setBrowserName("internet explorer");
				 
				 try {
					driver = new RemoteWebDriver(new URL(Node5), cap5);
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case "ff":
				System.setProperty("webdriver.gecko.driver", "/home/cyeshi/Downloads/geckodriver-v0.20.1-linux64/geckodriver");
				String Node9 = "http://localhost:4444/wd/hub";
				 DesiredCapabilities cap9 = DesiredCapabilities.firefox();
				 cap9.setBrowserName("firefox");
				 
				 try {
					driver = new RemoteWebDriver(new URL(Node9), cap9);
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 
				break;		
			 default:
				 System.out.println("Invalid browser name "+browser);
				 System.exit(0);
					break;	
			}
				
			driver.manage().window().setSize(d);
			driver.manage().deleteAllCookies();
			driver.manage().window().setSize(new Dimension(1300,1000));
			//driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			return driver;
        }
	}