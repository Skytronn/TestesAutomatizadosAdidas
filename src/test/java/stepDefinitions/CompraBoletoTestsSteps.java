package stepDefinitions;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.CompraBoletoPage;

public class CompraBoletoTestsSteps {
	
	CompraBoletoPage compraBoleto = new CompraBoletoPage();
	
	@Dado("que eu esteja logado")
	public void logar() throws InterruptedException {
		compraBoleto.fazerLogin("teste1209@gmail.com", "Teste12345");
		Thread.sleep(3000);
	}
	@E("seleciono um produto")
	public void selecionarProduto() throws InterruptedException{
		compraBoleto.navegarAteSite("https://www.adidas.com.br/homem-calcados-tenis");
		compraBoleto.clicarElemento(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/div/div[2]/div/div/div[2]/div[1]/div/div[3]/div/div/div/div/div"));
		compraBoleto.clicarElemento(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/div[2]/div[2]/section/div[1]/div[2]/button[2]"));
		compraBoleto.clicarElemento(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/div[2]/div[2]/section/div[3]/button"));
		Thread.sleep(2500);
	}
	@E("finalizo o carrinho")
	public void finalizoCarrinho() {
		compraBoleto.navegarAteSite("https://www.adidas.com.br/on/demandware.store/Sites-adidas-BR-Site/pt_BR/Cart-Show");
		compraBoleto.clicarElemento(By.name("dwfrm_cart_checkoutCart"));;
	}
	@Quando("preencho os dados para entrega")
	public void preenchoEntrega() {
		compraBoleto.detalhesEntrega("Primeiro", "Segundo", "03470-040", "Rua Jerônimo Coelho", "639", "Jardim Vila Formosa", "Sao Paulo", "11912345678", "330.220.970-34");
		compraBoleto.clicarElemento(By.xpath("//*[@id=\"dwfrm_delivery_savedelivery\"]"));
	}
	@E("escolher pagamento por boleto")
	public void selecionarBoleto() {
		compraBoleto.clicarElemento(By.xpath("//*[@id=\"content\"]/div/div[1]/div[3]/div/div[2]/div/div"));
	}
	@Entao("ao finalizar será gerado o boleto")
	public void finalizarPedido() {
		compraBoleto.clicarElemento(By.xpath("//*[@id=\"content\"]/div/div[1]/div[5]/div/p/button"));
		compraBoleto.validarElementoEmTela(By.xpath("//*[@id=\"boletourl\"]"));
	}
}
	