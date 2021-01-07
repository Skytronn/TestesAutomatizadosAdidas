package stepDefinitions;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.CompraBoletoPage;
import pages.LoginAdidasPage;

public class LoginAdidasTestsSteps {
	
	LoginAdidasPage login = new LoginAdidasPage();

	@Dado("que eu vá para pagina de login")
	public void paginaLogin() {
		login.navegarAteSite("https://www.adidas.com.br/account-login");
	}
	@Quando("preencho os dados correto de login")
	public void preencherLogin() {
		login.preencherTextoElemento(By.id("login-email"), "teste1209@gmail.com");
		login.preencherTextoElemento(By.id("login-password"), "Teste12345");
	}
	@E("clico para logar")
	public void clickLogin() {
		login.clicarElemento(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/div[1]/form/div[5]/button"));
	}
	@Entao("estou logado")
	public void estouLogado() {
		login.validarElementoEmTela(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/div/div/div[1]/div[1]/div/div/div/button"));
	}
}