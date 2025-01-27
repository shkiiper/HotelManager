//package com.example.demo.selenium;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import java.time.Duration;
//import java.util.List;
//
//public class demo {
//    public static void main(String[] args) {
//
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver = new FirefoxDriver();
//
//        driver.get("https://demoqa.com/text-box");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//
//        WebElement fullNameInput = driver.findElement(By.id("userName"));
//        fullNameInput.sendKeys("Max");
//
//        WebElement emailInput = driver.findElement(By.id("userEmail"));
//        emailInput.sendKeys("shygaev.xxx@gmail.com");
//
//        WebElement currentAddressInput=driver.findElement(By.id("currentAddress"));
//        currentAddressInput.sendKeys("Veselaya 110");
//
//        WebElement permanentAddressInput=driver.findElement(By.id("permanentAddress"));
//        permanentAddressInput.sendKeys("Backstreet 1");
//
//        WebElement submitBtn = driver.findElement(By.id("submit"));
//        submitBtn.click();
//
//// ----------------------------------------------------------------------->
//
//
//
//// Поиск поля по name
//        WebElement usernameField = driver.findElement(By.name("username"));
//        usernameField.sendKeys("myUsername");
//
//// Поиск кнопки по классу
//        WebElement loginButton = driver.findElement(By.className("login-btn"));
//        loginButton.click();
//
//// Поиск тега
//        List<WebElement> buttons = driver.findElements(By.tagName("button"));
//        for (WebElement button : buttons) {
//            System.out.println(button.getText());
//        }
//
//// Поиск ссылки по полному тексту
//        WebElement link = driver.findElement(By.linkText("Home"));
//        link.click();
//
//// Поиск ссылки по части текста
//        WebElement partialLink = driver.findElement(By.partialLinkText("Sign"));
//        partialLink.click();
//
//// Поиск с помощью CSS селектора
//        WebElement buttonCSS = driver.findElement(By.cssSelector(".container .btn-primary"));
//        buttonCSS.click();
//
//// Поиск с использованием XPath
//        WebElement divXPath = driver.findElement(By.xpath("//div[@id='login-container']"));
//        divXPath.click();
//
//    }
//}