package HomePage;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupOfVolunteers {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407");
		driver.findElement(By.name("RESULT_TextField-1")).sendKeys("Farwa");
		driver.findElement(By.name("RESULT_TextField-2")).sendKeys("Mahmood");
		driver.findElement(By.name("RESULT_TextField-3")).sendKeys("03374924248");
		driver.findElement(By.name("RESULT_TextField-4")).sendKeys("Pakistan");
		driver.findElement(By.name("RESULT_TextField-5")).sendKeys("Lahore");
		driver.findElement(By.name("RESULT_TextField-6")).sendKeys("farwamahmood523@gmail.com");
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Thread.sleep(5000);
		jse.executeScript("scroll(0,550)");
		Thread.sleep(7000);
		// driver.findElement(By.id("RESULT_RadioButton-7")).isDisplayed();
		// driver.findElement(By.id("RESULT_CheckBox-8_0")).click();

		driver.findElement(By.xpath("//label[contains(.,'Male')]")).click();
		driver.findElement(By.xpath("//label[contains(.,'Monday')]")).click();

		WebElement time_drp_down = driver.findElement(By.id("RESULT_RadioButton-9"));
		Select option_drp_down = new Select(time_drp_down);
		option_drp_down.selectByValue("Radio-1");

		Thread.sleep(3000);
		driver.navigate().to("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.id("imagesrc")).sendKeys("C:\\Users\\user\\OneDrive\\Desktop\\abc.jpg");
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("You want to close the driver? Y/N");
			String Option = sc.nextLine();
			if (Option.equals("YES")) {
				driver.quit();
				System.out.println("BYE! Have a nice day");
			}
		}

	}

}
