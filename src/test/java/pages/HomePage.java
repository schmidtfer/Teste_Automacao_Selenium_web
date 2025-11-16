package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import suport.Utils;

public class HomePage extends Utils {

    WebDriver driver;

    public HomePage(WebDriver driver) {  //crio um constructor -> btn D, generate
        this.driver = driver;  //recebendo por parâmetro
    }

    public void acessarAplicacao() {
        driver.get("https://qazando.com.br/curso.html");
        esperarElementoEstarPresente(By.id("btn-ver-cursos"),  10);
        Assert.assertEquals(true, driver.findElement(By.id("btn-ver-cursos")).isDisplayed());
    }

    public void scrollDown() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 10000);");  //precisa fazer o scroll para finalizar o teste
        Thread.sleep(2000);
    }

    public void preencheEmail(){
        driver.findElement(By.id("email")).sendKeys("teste@teste.com.br");
    }

    public void clickGanharDesconto(){
        driver.findElement(By.id("button")).click();
    }
    public void verificarCupomDesconto(){
        String texto_cupom = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();
        Assert.assertEquals("O cupom é!",  "QAZANDO15OFF", texto_cupom);
    }
}
