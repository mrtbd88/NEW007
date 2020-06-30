package june30PraBAMTS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDrop extends Config{

	@Test (priority=2)
	public void dragAnddrop() throws InterruptedException {
		System.out.println("Drag and Drop method features testing+++++++");
	
	List<WebElement> frame = driver.findElements(By.tagName("iframe"));
	
	System.out.println(frame.size());
	
	driver.switchTo().frame(0);
	System.out.println(driver.findElement(By.xpath("//*[@id=\"draggable\"]")).getText());
	System.out.println(driver.findElement(By.xpath("//*[@id=\"droppable\"]")).getText());
	
	WebElement drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
    WebElement drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
    
    Actions act=new Actions(driver);
    Thread.sleep(3000);
    act.dragAndDrop(drag, drop).build().perform();

	}
	@Test (priority=1)
	public void AccTest() {
		System.out.println("getting info. of Accordion link");
		driver.findElement(By.xpath(AccLoc)).getText();
	}

}
