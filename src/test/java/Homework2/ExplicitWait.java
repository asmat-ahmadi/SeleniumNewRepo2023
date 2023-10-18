package Homework2;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


    public class ExplicitWait extends CommonMethods {
        public static void main(String[] args) {
            String url = "http://35.175.58.98/synchronization-explicit-wait.php";
            String browser = "chrome";
            openBrowserAndLaunchApplication(url, browser);

            WebElement clickCheckBoxBtn = driver.findElement(By.xpath("//button[@id='checkbox_button']"));
            clickCheckBoxBtn.click();
//        wait until the checkbox is selected
//        then get the state of the checkbox

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@id='checkbox']")));

            boolean stateOfCheckBox = driver.findElement(By.xpath("//input[@id='checkbox']")).isSelected();
            System.out.println(stateOfCheckBox);


        }
    }

