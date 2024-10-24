package demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

        public  static void main(String[] args)
        {
            WebDriverManager.chromedriver().setup();
            ChromeDriver d = new ChromeDriver();
            d.manage().window().maximize();
            d.get("https://www.youtube.com/user/Youtube");
            System.out.println(" LauncH");
                System.out.println(" 1LauncH");
            d.close();
        }

}
