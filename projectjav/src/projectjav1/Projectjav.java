package projectjav1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Projectjav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("launch facebook");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\USER\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
	}

}
