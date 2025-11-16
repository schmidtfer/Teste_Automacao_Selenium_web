package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// tipo de classe que vai rodar os testes
//cucumber interpreta o BDD escrito no formato Gherkin, e transforma isso em métodos (ação)
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/cucumberReport.json", "html:target/reports/"},           //é onde fica as configuraçõe do report do teste, no caso do relatório do cucumber
        features = "src/test/resources/features",
        tags = {"~@ignore"},  //tudo que for different do ignore, vai ser executado
        //pega as linhas do BDD e transforma em métodos
        glue = {"steps"}
)
public class RunCucumberTest {     //é quem chama e executa os teste. config acima

    public static WebDriver driver;     //preciso criar uma variável global pra chamar o driver

    @BeforeClass
    public static void start() {
        driver = new ChromeDriver();
    }

    @AfterClass
    public static void end() {
        driver.quit();

    }
}



