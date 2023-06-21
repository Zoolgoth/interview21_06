package calculatorTask;

import interViews.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
        driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[8]")).click();
        // 2035

        // ------------------------------------------------- Po zakonczeniu rozmowy:
        // Po zakonczeniu rozmowy:
        // ------------------------------------------------- Po zakonczeniu rozmowy:

        char [] charArray = number.toCharArray();
        driver.get("https://calculator.com/");

//        System.out.println("chararray = " + charArray.toString());

                for (char i = 0; i <= charArray.length; i++) {
//                System.out.println(number);
                    System.out.println(charArray[i]);
                if (charArray[i] == 0) {
                    driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[18]")).click();
                    System.out.println("0");
                } else if (charArray[i] == 1) {
                    driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[11]")).click();
                    System.out.println("1");
                } else if (charArray[i] == 2) {
                    driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[12]")).click();
                    System.out.println("2");
                } else if (charArray[i] == 3) {
                    driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[13]")).click();
                    System.out.println("3");
                } else if (charArray[i] == 4) {
                    driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[5]")).click();
                    System.out.println("4");
                } else if (charArray[i] == 5) {
                    driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[5]")).click();
                    System.out.println("5");
                } else if (charArray[i] == 6) {
                    driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[6]")).click();
                    System.out.println("6");
                } else if (charArray[i] == 7) {
                    driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[7]")).click();
                    System.out.println("7");
                } else if (charArray[i] == 8) {
                    driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[1]")).click();
                    System.out.println("8");
                } else if (charArray[i] == 9) {
                    driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[2]")).click();
                    System.out.println("9");
                } else {
                    System.out.println("not enough");
                }
            }

                }
            }

//        for (int i = 0; i < number.length(); i++) {
//            System.out.println(numberB[i]);
//            switch (numberB[i]) {
//                case 0:
//                    driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[18]")).click();
//                    System.out.println("a");
//                case 1:
//                    driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[11]")).click();
//                    System.out.println("a");
//                case 2:
//                    driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[12]")).click();
//                    System.out.println("a");
//                case 3:
//                    driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[13]")).click();
//                    System.out.println("a");
//                case 4:
//                    driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[5]")).click();
//                    System.out.println("a");
//                case 5:
//                    driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[6]")).click();
//                    System.out.println("a");
//                case 6:
//                    driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[7]")).click();
//                    System.out.println("a");
//                case 7:
//                    driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[1]")).click();
//                    System.out.println("a");
//                case 8:
//                    driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[2]")).click();
//                    System.out.println("a");
//                case 9:
//                    driver.findElement(By.xpath("//*[@id=\"calcbuttons\"]/div[8]/input[3]")).click();
//                    System.out.println("a");
//            }
//            System.out.println(numberB[0] +"+"+ numberB[1] +"+"+ numberB[2] +"+"+ numberB[3]);
//              }