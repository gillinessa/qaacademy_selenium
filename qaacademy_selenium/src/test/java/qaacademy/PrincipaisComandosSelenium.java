package qaacademy;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class PrincipaisComandosSelenium {

    @Test
    public void TesteSeleniumClic()throws InterruptedException{
        String contato = "comp-k7g9c7sd3label";
        WebDriver driver = new ChromeDriver(); // abrir o browser 
        driver.get("https://www.qaacademy.com.br/");
        Thread.sleep(3000); // espera de 3 segundos 
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/button[1]")).click();
        Thread.sleep(1000); // espera 1 segundo
        //driver.findElement(By.xpath("//*[@id='img_1_comp-k0wqferu']/img")).click(); // clica no linkedin 
        driver.findElement(By.id(contato)).click();
            
        
    }
}
