package selenium.practices;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFistProgram {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chorm.driver", "src/test/resources/chromedriver.exe");
		
        WebDriver driver=new ChromeDriver(); 
        
        driver.get("https://www.google.com");
	}

}
