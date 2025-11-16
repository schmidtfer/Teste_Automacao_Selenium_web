package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import runner.RunCucumberTest;
import pages.HomePage;

public class DescontoStep extends RunCucumberTest {

    HomePage homePage = new HomePage(driver);

    @Dado("^que estou no site da qazando$")
    public void acessar_site_qazando(){   //chamando do page objects HomePage
        homePage.acessarAplicacao();

    }    //para automatizar a criação dos métodos, dou um run depois de escrever o Dado.


    @Quando("^eu preencho meu e-mail$")
    public void eu_preencho_meu_e_mail() throws InterruptedException {
        homePage.scrollDown();
        homePage.preencheEmail();
    }

    @Quando("^clico em ganhar cupom$")
    public void clico_em_ganhar_cupom(){
        homePage.clickGanharDesconto();
    }

    @Então("^eu vejo o código de desconto$")
    public void eu_vejo_o_código_de_desconto(){
        homePage.verificarCupomDesconto();
        driver.quit(); //fecha o navegador no final do teste
    }
}
