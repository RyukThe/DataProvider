package swaglab_DDF_01;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;

public class BaseClass
{
	public static WebDriver m;
	public ChromeOptions op;
	public void initializeBrowser() throws IOException
	{
		op= new ChromeOptions();

		op.addArguments("--remote-allow-origins=*");
		m=new  ChromeDriver(op);
		 m= new ChromeDriver();
		 m.get(Utility_Class.getPropertyFileData("URL"));
		 m.manage().window().maximize();
		 m.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 
	}
	
	
	
}
