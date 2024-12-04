package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		//initialize web driver
		WebDriver Driver=new EdgeDriver();
		Driver.get("https://www.leafground.com/");
		//Driver.manage().window().maximize();
		
		

		// click Browser menu
		Driver.findElement(By.xpath("//*[@id=\"menuform:j_idt39\"]/a")).click();
		// click alert
		Driver.findElement(By.xpath("//*[@id=\"menuform:m_overlay\"]/a/span")).click();
		Driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span[2]")).click();;


		org.openqa.selenium.Alert alert=Driver.switchTo().alert();
		alert.accept();

		Driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]")).click();
		org.openqa.selenium.Alert Confirm=Driver.switchTo().alert();
		Confirm.dismiss();

		Thread.sleep(1000);
		Driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt104\"]/span[2]")).click();
		org.openqa.selenium.Alert Prompt=Driver.switchTo().alert();
		Prompt.sendKeys("Check");
		Prompt.accept();
		
	// press f5 in java robot class methd 
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);

		// another way to take screenshot:
		/*Robot ro=new Robot();
	Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();//this method will capture 
	Rectangle rectangle=new Rectangle(screensize);
	BufferedImage sour=ro.createScreenCapture(rectangle);

	File Destination=new File("D://righhh");
	ImageIO.write(sour, "png", Destination);*/
		//

	}
}
