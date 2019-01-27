package TetNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class testNgAnnotations {
    @BeforeSuite
    public  void setup(){
        System.out.println("beforesuite");
    }
    @BeforeTest
    public void launchBrowser(){
        System.out.println("beforeTest");
    }

}
