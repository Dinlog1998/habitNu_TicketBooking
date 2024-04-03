package assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.sql.Array;
import java.util.*;


public class TicketBooking {
    @Test
    public void ticketBooking() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://blazedemo.com/index.php");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("destination of the week! The Beach!")).click();
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
        WebElement departure = driver.findElement(By.xpath("//select[@name='fromPort']"));
        departure.click();
        Select select = new Select(departure);
        select.selectByVisibleText("Mexico City");
        WebElement destination = driver.findElement(By.xpath("//select[@name='toPort']"));
        destination.click();
        Select select1 = new Select(destination);
        select1.selectByVisibleText("London");
        WebElement findFlights = driver.findElement(By.xpath("//input[@type='submit']"));
        findFlights.click();
        List<WebElement> price = driver.findElements(By.xpath("//tbody//td[6]"));
        ArrayList<Integer> ele8 = new ArrayList<Integer>();
        ArrayList<String> ele9 = new ArrayList<String>();
        List<WebElement> chooseFlights = driver.findElements(By.xpath("//tbody//td[6]/..//input[@class='btn btn-small']"));
        String remove1 = "";
        int allPrice=0;
        for (WebElement t : price) {
            String remove = (t.getText().replace("$", ""));
            remove1 = (remove.replace(".", ""));
           // ele9.add(remove1);
             allPrice = Integer.parseInt(remove1);
        }



//        char[] digits = String.valueOf(allPrice).toCharArray();
//        digits.
//        int[] allPrices=allPrice
//
//        String last = "h";
//        int min = 0;
//        for (int i = 0; i < ele8.size(); i++) {
//            for (int j = 0; j < ele9.size(); j++) {
//                min = ele8.get(2);
//                if (ele8.get(j) < min) {
//                    min = ele8.get(j);
//
//
//                    last = Integer.toString(min);
//
//                    }
//
//            }
//            System.out.println(last);
//
//            for (WebElement f : chooseFlights) {
//                if (ele9.get(i).contains(last)){
//                    Thread.sleep(5000);
//                    f.click();
//                }
//
//            }
//        }
        WebElement chooseflight= driver.findElement(By.xpath("(//input[@class='btn btn-small'])[3]"));
        chooseflight.click();
        WebElement findText = driver.findElement(By.xpath("//*[contains(text(),'Total Cost: ')]"));
            String text = findText.getText();
            boolean page = text.contains("Total Cost:");
            if (page) {
                System.out.println("Text present " + text);
            } else {
                System.out.println("No Text found");
            }

            WebElement puechaseFlight = driver.findElement(By.xpath("//input[@value='Purchase Flight']"));
            puechaseFlight.click();
            WebElement saveID = driver.findElement(By.xpath("/html/body/div[2]/div/table/tbody/tr[1]/td[2]"));
            String text1 = saveID.getText();
            System.out.println("ID "+text1);
            driver.quit();

        }

}