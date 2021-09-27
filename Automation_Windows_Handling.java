package HomePage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchingWindows {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[contains(text(), 'Open New Seperate Windows')]")).click();
		driver.findElement(By.cssSelector(".btn-primary")).click();
		
		Set <String> window_handles= driver.getWindowHandles();
		
		for(String i:window_handles) {
				
			String w_title=driver.switchTo().window(i).getTitle();
			String parent="Frames & windows";
			String child="Selenium";
			if(parent.equals(w_title)) {
				System.out.println("Title of parent tab "+w_title);
			}
			if(child.equals(w_title)) {
				System.out.println("Title of child tab "+w_title);
			}
			
			
		}
		
		driver.quit();

	}

}
