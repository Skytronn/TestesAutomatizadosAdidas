package stepDefinitions;

import java.util.Random;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.CadastroAdidasPage;

public class CadastroAdidasTestsSteps {
	
	CadastroAdidasPage cadastroAdidas = new CadastroAdidasPage();
	
	@Dado("que eu navegue até a pagina de login")
	public void entrarPaginadeCadastro() {
		cadastroAdidas.acessoPaginaLogin();
	}
	
	@E("clico em cadastrar")
	public void clicarCadastrar() {
		cadastroAdidas.clicarElemento(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/div[2]/button"));
	}
	
	@Quando("preencho os dados")
	public void PreencherDados() {
		Random random = new Random();
		int aleatorio = random.nextInt(4351);
		//Gerar e-mail aleatorio
		String Email = "teste" + aleatorio + "@gmail.com";
		//Gerar senha aleatoria
		String senha = "Teste" + aleatorio;
		cadastroAdidas.preencheDadosDeCadastro("Primeiro", "Segundo", "13", "10", "1998", Email, "Teste123");
	}
	@E("aceito os termos")
	public void aceitaTermos() {
		cadastroAdidas.clicarElemento(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/div[1]/form/div[9]/div/div/div/label/span"));
	}
	@E("clico no botão cadastrar")
	public void clicarBotaoCadastro() throws InterruptedException {
		Thread.sleep(2000);
		cadastroAdidas.clicarElemento(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/div[1]/form/button"));
		Thread.sleep(5000);
	}
	@Entao("estou cadastrado")
	public void conferirSite() {
		cadastroAdidas.navegarAteSite("https://www.adidas.com.br/my-account");
		cadastroAdidas.validarElementoEmTela(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/div/div/div[1]/div[1]/div/div/div/button"));
	}
}