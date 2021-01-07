package pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.everis.beca.CommonsBasePage;

public class CompraBoletoPage extends CommonsBasePage {
	
	WebDriverWait wait;
	Actions builder;
	
	WebElement pesquisar;
	
	String campoPesquisar = "/html/body/div/main/div[2]/div/div[1]/div[2]/div/div/div/div/input";
	
	public CompraBoletoPage() {
		wait = new WebDriverWait(_Driver(), 15);
		builder = new Actions(_Driver());
	}
	
	public void detalhesEntrega(String nome, String sobrenome, String cep, 
			String endereco, String numero, String bairro, String cidade, String telefone, String cpf) {
	
			
				preencherTextoElemento(By.xpath("//*[@id=\"dwfrm_delivery_singleshipping_shippingAddress_addressFields_firstName\"]"), nome);
				preencherTextoElemento(By.xpath("//*[@id=\"dwfrm_delivery_singleshipping_shippingAddress_addressFields_lastName\"]"), sobrenome);
				preencherTextoElemento(By.xpath("//*[@id=\"dwfrm_delivery_singleshipping_shippingAddress_addressFields_zip\"]"), cep);
				clicarElemento(By.xpath("//*[@id=\"dwfrm_delivery_singleshipping_shippingAddress_addressFields_findAddress\"]"));
				preencherTextoElemento(By.xpath("//*[@id=\"dwfrm_delivery_singleshipping_shippingAddress_addressFields_address1\"]"), endereco);
				preencherTextoElemento(By.xpath("//*[@id=\"dwfrm_delivery_singleshipping_shippingAddress_addressFields_houseNumber\"]"), numero);
				preencherTextoElemento(By.xpath("//*[@id=\"dwfrm_delivery_singleshipping_shippingAddress_addressFields_district\"]"), bairro);
				preencherTextoElemento(By.xpath("//*[@id=\"dwfrm_delivery_singleshipping_shippingAddress_addressFields_city\"]"), cidade);
				clicarElemento(By.xpath("//*[@id=\"dwfrm_delivery\"]/div[2]/div[1]/div/fieldset/div/div[1]/div[10]/div/div"));
				clicarElemento(By.xpath("//*[@id=\"dwfrm_delivery\"]/div[2]/div[1]/div/fieldset/div/div[1]/div[10]/div/div/div/div/div[2]/div/ul/li[26]"));
				preencherTextoElemento(By.xpath("//*[@id=\"dwfrm_delivery_singleshipping_shippingAddress_addressFields_phone\"]"), telefone);
				clicarElemento(By.xpath("//*[@id=\"dwfrm_delivery\"]/div[2]/div[2]/div[2]/div[2]/div[1]"));
				preencherTextoElemento(By.xpath("//*[@id=\"dwfrm_delivery_singleshipping_shippingAddress_addressFields_cpf\"]"), cpf);
		
	}
}