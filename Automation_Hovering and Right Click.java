package HomePage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action_classes_mouse {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();;
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		WebElement admin_menu= driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
		WebElement user_mmng= driver.findElement(By.id("menu_admin_UserManagement"));
		WebElement users= driver.findElement(By.id("menu_admin_viewSystemUsers"));
		
        act.moveToElement(admin_menu).moveToElement(user_mmng).moveToElement(users).click().build().perform();
		Thread.sleep(3000);
		
//Right Clicking 
		
		driver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement right_click=driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/p/span")); 
		act.contextClick(right_click).build().perform();
		driver.findElement(By.xpath("/html/body/ul/li[7]/span")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();

	}

}
