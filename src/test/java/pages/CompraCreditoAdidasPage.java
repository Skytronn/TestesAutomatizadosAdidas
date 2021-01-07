package pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.everis.beca.CommonsBasePage;

public class CompraCreditoAdidasPage extends CommonsBasePage {
	
	WebDriverWait wait;
	Actions builder;
	
	WebElement pesquisar;
	
	String campoPesquisar = "/html/body/div/main/div[2]/div/div[1]/div[2]/div/div/div/div/input";
	
	public CompraCreditoAdidasPage() {
		wait = new WebDriverWait(_Driver(), 15);
		builder = new Actions(_Driver());
	}
	
	public void entregaPedido(String cpf) {
		clicarElemento(By.xpath("//*[@id=\"dwfrm_delivery\"]/div[2]/div[2]/div[2]/div[2]/div[1]"));
		preencherTextoElemento(By.xpath("//*[@id=\"dwfrm_delivery_singleshipping_shippingAddress_addressFields_cpf\"]"), cpf);
	}
	public void preencheCredito(String NCartao, String titular, String cvv) {
		preencherTextoElemento(By.xpath("//*[@id=\"dwfrm_adyenencrypted_number\"]"), NCartao);
		preencherTextoElemento(By.xpath("//*[@id=\"dwfrm_adyenencrypted_holderName\"]"), titular);
		preencherTextoElemento(By.xpath("//*[@id=\"dwfrm_adyenencrypted_cvc\"]"), cvv);
		
	}
}