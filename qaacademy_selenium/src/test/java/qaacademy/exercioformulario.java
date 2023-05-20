package qaacademy;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exercioformulario {


        @Test
        public void testeformularioselenium() throws InterruptedException{


            String primeiroNome= "//*[@id='basicBootstrapForm']/div[1]/div[1]/input";
            String ultimoNome= "//*[@id='basicBootstrapForm']/div[1]/div[2]/input";
            String endereco= "//*[@id='basicBootstrapForm']/div[2]/div/textarea";
            String email= "//*[@id='eid']/input";
            String telefone= "//*[@id='basicBootstrapForm']/div[4]/div/input";
            String homem= "//*[@id='basicBootstrapForm']/div[5]/div/label[1]";
            String  movies= "//*[@id='checkbox2']";
            String indioma= "//*[@id='msdd']";
            WebDriver driver = new ChromeDriver();
             driver.get("https://demo.automationtesting.in/Register.html");
            Thread.sleep(1000);
            driver.findElement(By.xpath(primeiroNome)).click();
            driver.findElement(By.xpath(primeiroNome)).sendKeys("gilliard");
            driver.findElement(By.xpath(ultimoNome)).click();
            driver.findElement(By.xpath(ultimoNome)).sendKeys("lima");
            driver.findElement(By.xpath(endereco)).click();
            driver.findElement(By.xpath(endereco)).sendKeys("adelina");
            driver.findElement(By.xpath(email)).click();
            driver.findElement(By.xpath(email)).sendKeys("gilli_inacio@hotmail.com");
            driver.findElement(By.xpath(telefone)).click();
            driver.findElement(By.xpath(telefone)).sendKeys("11959473213");
            driver.findElement(By.xpath(homem)).click();
            driver.findElement(By.xpath(movies)).click();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,400)", "");
            driver.findElement(By.xpath(indioma)).click();
            driver.findElement(By.xpath(indioma)).sendKeys("Portuguese");



            





        }       
    }




    


