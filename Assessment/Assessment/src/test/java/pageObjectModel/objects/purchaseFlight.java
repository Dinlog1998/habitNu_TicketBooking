package pageObjectModel.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class purchaseFlight {
    WebDriver driver;
    public purchaseFlight(WebDriver driver){
        this.driver=driver;
    }
    By findtextLocate= By.xpath("//*[contains(text(),'Total Cost: ')]");
    By purchaseLocate=By.xpath("//input[@value='Purchase Flight']");
    public void findTostalCost(){
        WebElement findText = driver.findElement(findtextLocate);
        String text = findText.getText();
        boolean page = text.contains("Total Cost:");
        if (page) {
            System.out.println("Text present: " + text);
        } else {
            System.out.println("No Text found");
        }
    }
    public void purchaseFlights(){
        WebElement flights= driver.findElement(purchaseLocate);
        flights.click();
    }
}
