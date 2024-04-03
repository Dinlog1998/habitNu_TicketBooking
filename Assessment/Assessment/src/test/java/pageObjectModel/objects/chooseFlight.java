package pageObjectModel.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class chooseFlight {
    WebDriver driver;

    public chooseFlight(WebDriver driver){
        this.driver = driver;

}
    By choosecheapFlightsLocate = By.xpath("(//input[@class='btn btn-small'])[3]");
    public void ChooseCheapFlight() {
        driver.findElement(choosecheapFlightsLocate).click();
    }

}