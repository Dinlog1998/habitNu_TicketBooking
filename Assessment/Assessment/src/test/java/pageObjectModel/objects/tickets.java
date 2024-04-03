package pageObjectModel.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tickets {
    WebDriver driver;
    public tickets(WebDriver driver){
        this.driver=driver;
    }
    By saveIDLocate= By.xpath("/html/body/div[2]/div/table/tbody/tr[1]/td[2]");
    public void saveID(){
        WebElement saveIDNo=driver.findElement(saveIDLocate);
        String text1 = saveIDNo.getText();
        System.out.println("ID "+text1);
    }
}
