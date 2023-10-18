package class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClass extends CommonMethods {
    public static void main(String[] args) {
        String url="http://35.175.58.98/simple_context_menu.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement hover = driver.findElement(By.xpath("//button[text()='Hover me!']"));
        Actions action=new Actions(driver);
        action.moveToElement(hover).perform();


//        draggable
        WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));

//        droplocation
        WebElement dropLocation = driver.findElement(By.xpath("//div[@id='droppable']"));

//        action.dragAndDrop(draggable,dropLocation).perform();

        action.clickAndHold(draggable).moveToElement(dropLocation).release().build().perform();

    }}




