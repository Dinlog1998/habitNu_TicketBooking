package pageObjectModel.Test_Scenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjectModel.objects.chooseFlight;
import pageObjectModel.objects.flightDestinationPage;
import pageObjectModel.objects.purchaseFlight;
import pageObjectModel.objects.tickets;

import java.util.concurrent.TimeUnit;

public class testTicketsBooking {
    WebDriver driver;
    @BeforeTest
    public void beforeTest(){
        //WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.get("https://blazedemo.com/index.php");
    }
    @Test(priority = 1)
public void hyperLinkTest(){
        flightDestinationPage page1 = new flightDestinationPage(driver);
        page1.hyperLinkLocate();
    }
    @Test(priority =2)
    public void WordTest(){
        flightDestinationPage page2= new flightDestinationPage(driver);
        page2.wordTest();
    }
@Test(priority = 3)
    public void findDeparture(){
        flightDestinationPage page3 =new flightDestinationPage(driver);
        page3.departure();
}
@Test(priority = 4)
    public void findDestination(){
        flightDestinationPage page4 = new flightDestinationPage(driver);
        page4.destination();
}
@Test(priority  =5)
public void findFlight(){
        flightDestinationPage page5=new flightDestinationPage(driver);
        page5.submit();
}
@Test(priority =6)
    public void ChooseCheapestFlight(){
    chooseFlight page6=new chooseFlight(driver);
        page6.ChooseCheapFlight();
    }
    @Test(priority = 6)
    public void verifyText(){
        purchaseFlight page7=new purchaseFlight(driver);
        page7.findTostalCost();
    }@Test(priority = 7)
    public void purchaseflight(){
        purchaseFlight page8 =new purchaseFlight(driver);
        page8.purchaseFlights();
    }
    @Test(priority =8 )
    public void SaveIDNo(){
        tickets page9 = new tickets(driver);
        page9.saveID();
    }
    @AfterTest
public void quit(){
    driver.quit();
    }
}
