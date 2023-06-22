package calculatorTask;

import interViews.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Interview21_06 {
    protected WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = DriverFactory.getDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.manage().window().maximize();
//        System.out.println("Start on, Right now im on: " + driver.getCurrentUrl());
    }

    @AfterMethod
    public void tearDown() {


    }

    @Test
    public void calculatorTest () {

        driver.get("https://calculator.com/");
        // 2023
        driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[12]")).click();
        driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[18]")).click();
        driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[12]")).click();
        driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[13]")).click();
        // +
        driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[14]")).click();
        // 1
        driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[11]")).click();
        // 2
        driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[12]")).click();
        // =
        driver.findElement(By.xpath("//*[@id=\"equals_btn\"]")).click();
        // wynik
//        System.out.println("Aaa" + driver.findElement(By.name("tapefld[]")).getClass());
        String number = driver.findElement(By.cssSelector("#fld_5")).getAttribute("value");
        int number1 = Integer.parseInt(number);
        System.out.println("Aaaaaaaaa " + number);
        // liczenie 2023 * 2035

//        driver.findElement(By.xpath("//*[@id=\"calcbuttons\"][@value=\"1\"]")).click();
//        driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[18]")).click();
//        driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[12]")).click();
//        driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[13]")).click();
//        // *
//        driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[8]")).click();
        // 2035

        // ------------------------------------------------- Po zakonczeniu rozmowy:
        // Po zakonczeniu rozmowy:
        // ------------------------------------------------- Po zakonczeniu rozmowy:
        // 2023
        driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[12]")).click();
        driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[18]")).click();
        driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[12]")).click();
        driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[13]")).click();
        // *
        driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[8]")).click();

        char [] charArray = number.toCharArray();
//        driver.get("https://calculator.com/");
//        driver.findElement(By.xpath("//*[@id=\"calcbuttons\"][@value=\"1\"]")).click();
//        driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[18]")).click();
//        driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[12]")).click();
//        driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[13]")).click();

        System.out.println(charArray);
        for (char i = 0; i < charArray.length; i++) {
            driver.findElement(By.xpath("//input[@type='button' and @value='" + charArray[i] + "']")).click();
        }
        driver.findElement(By.xpath("//*[@id=\"equals_btn\"]")).click();
        int expected = 4116805;
        String actual = driver.findElement(By.xpath("//*[@id=\"fld_10\"]")).getAttribute("value");
        int actualResult = Integer.parseInt(actual);
        System.out.println(actual);
        Assert.assertEquals(expected, actualResult);
     }
}