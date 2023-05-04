package base;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

		public static WebDriver driver;
		public static Properties prop=new Properties();
		public static Properties loc=new Properties();
		public static FileReader fr;
		public static FileReader fr1;
		
		@BeforeTest
		public void setUp() throws IOException {
			
			if(driver==null) {
				FileReader fr= new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");
				FileReader fr1= new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\locators.properties");
				prop.load(fr);
				loc.load(fr1);
			}
			if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
			    driver=new ChromeDriver();
			    driver.get(prop.getProperty("testURL"));
			}
			else if (prop.getProperty("browser").equalsIgnoreCase("Edge")) {
				WebDriverManager.edgedriver().setup();
				driver =new EdgeDriver();
				driver.get(prop.getProperty("testURL"));
				
			}
			
		}
		
		@AfterTest
	    public void teardown() {
	    	driver.close();
	    	
	    	
	    }

}
