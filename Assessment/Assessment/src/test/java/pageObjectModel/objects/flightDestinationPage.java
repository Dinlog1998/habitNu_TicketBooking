package pageObjectModel.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class flightDestinationPage {

    WebDriver driver;
    public flightDestinationPage(WebDriver driver){
this.driver=driver;
    }
    By hyperLinkLocate= By.linkText("destination of the week! The Beach!");
    By departurelocate=By.xpath("//select[@name='fromPort']");
    By destinationLocate=By.xpath("//select[@name='toPort']");
    By findFligtsLocate=By.xpath("//input[@type='submit']");
    public void hyperLinkLocate(){
        driver.findElement(hyperLinkLocate).click();


    }
    public void wordTest(){
        String url = driver.getCurrentUrl();
        String str = url;
        System.out.println(str);
        String find = "vacation";
        boolean val = str.contains(find);
        if (val)
            System.out.println("String found " + find);
        else
            System.out.println("String not found");
        driver.navigate().back();
    }
    public void departure(){
       WebElement departureCity= driver.findElement(departurelocate);
       departureCity.click();
        Select select = new Select(departureCity);
        select.selectByVisibleText("Mexico City");
    }
    public void destination(){
        WebElement destinationCity=driver.findElement(destinationLocate);
        destinationCity.click();
        Select select1 = new Select(destinationCity);
        select1.selectByVisibleText("London");


    }
    public void submit(){
        driver.findElement(findFligtsLocate).click();

    }

}
