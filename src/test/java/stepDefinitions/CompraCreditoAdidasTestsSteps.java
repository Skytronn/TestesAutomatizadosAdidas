package stepDefinitions;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.CompraBoletoPage;
import pages.CompraCreditoAdidasPage;

public class CompraCreditoAdidasTestsSteps {
	
	CompraCreditoAdidasPage compraCredito = new CompraCreditoAdidasPage();
	
	@E("escolho pagamento no credito")
	public void selecionarCredito() {
		
	}
	
	@Quando("preencho os detalhes de entrega")
	public void detalhesEntrega() {
		compraCredito.entregaPedido("462.607.170-83");
		compraCredito.clicarElemento(By.xpath("//*[@id=\"dwfrm_delivery\"]/div[2]/div[2]/div[2]/div[2]/div[1]/div/div"));
		compraCredito.clicarElemento(By.xpath("//*[@id=\"dwfrm_delivery_savedelivery\"]"));
	}
	
	@Entao("ao preencher as informacoes do cartao o pedido finaliza")
	public void finalizaCredito() throws InterruptedException {
		compraCredito.preencheCredito("1231312312312321312313212", "Primeiro Segundo", "123");
		Thread.sleep(5000);
	}
	
}