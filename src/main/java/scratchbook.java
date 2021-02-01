package main.java;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class scratchbook {
    public static WebDriver driver;
    public static void main(String args[]) {
        scratchbook obj = new scratchbook();
        obj.propValue();
        obj.chromeBrowser();
        obj.edgeBrowser();
    }

    public void chromeBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\BDDSeAutomation\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        String baseUrl = "http://google.com";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.quit();
    }

    public void edgeBrowser(){
        System.setProperty("webdriver.edge.driver", "C:\\BDDSeAutomation\\drivers\\msedgedriver.exe");
        driver = new EdgeDriver();

        String baseUrl = "http://google.com";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.quit();
    }

    public void propValue(){
        System.out.println(System.getProperty("user.dir"));
    }
}
