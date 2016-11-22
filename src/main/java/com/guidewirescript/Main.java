/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guidewirescript;

import java.util.Arrays;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 *
 * @author gonzalo.cattini
 */
public class Main {
    
    public static void main(String[] args){
        
        System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
        
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability("chrome.switches", Arrays.asList("--ignore-certificate-errors"));
        
        WebDriver driver = new ChromeDriver(capabilities);
        driver.get("https://localhost:8082/cc");
        
        WebElement username = driver.findElement(By.cssSelector("#Login:LoginScreen:LoginDV:username-inputEl"));
        WebElement password = driver.findElement(By.cssSelector("#Login:LoginScreen:LoginDV:password-inputEl"));
        
        username.sendKeys("su");
        password.sendKeys("gw");
        
        driver.findElement(By.id("Login:LoginScreen:LoginDV:submit")).click();
        
    }
    
}
