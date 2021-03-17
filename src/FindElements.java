import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class FindElements {
//
//    public static void main(String[] args) {
//// TODO Auto-generated method stub
//
//        System.setProperty("webdriver.chrome.driver", "C://Selenium jars and drivers//Drivers//chromedriver_win32/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
//        driver.get("http://demo.guru99.com/test/ajax.html");
//
//// Find the radio button for “No” using its ID and click on it
//        driver.findElement(By.id("no")).click();
//
////Click on Check Button
//        driver.findElement(By.id("buttoncheck")).click();
//
//    }
//
//}
//

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

  public class FindElements {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C://Selenium jars and drivers//Drivers//chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/ajax.html");
        List<WebElement> elements = driver.findElements(By.name("name"));
        System.out.println("Number of elements:" +elements.size());

        for (int i=0; i<elements.size();i++){
            System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
        }
    }
}

//Summary:
//
//        Find Element command returns the web element that matches the first most element within the web page.
//        Find Elements command returns a list of web elements that match the criteria.
//        Find Element by XPath in Selenium command throws NoSuchElementException if it does not find the element matching the criteria.
//        Find Elements command returns an empty list in Selenium if there are no elements matching the criteria