package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Test;
import pages.PageLogin;

public class StepsLogin extends PageLogin {
    @Test
    @Given("^eu estou na tela de login$")
    public void euEstouNaTelaDeLogin() {
        System.out.println("test");
    }

    @Test
    @And("^envio um usuario e senha validos$")
    public void envioUmUsuarioESenhaValidos() {
        cpfCpnj.sendKeys("");
        senha.sendKeys("");
    }

    @When("^clico no botão entrar$")
    public void clicoNoBotãoEntrar() {
        acessarMinhaConta.click();
    }

    @Then("^o login deverá ser feito$")
    public void oLoginDeveráSerFeito() {
        //assert com a validação
    }
}
