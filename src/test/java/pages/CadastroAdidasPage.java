package pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.everis.beca.CommonsBasePage;

public class CadastroAdidasPage extends CommonsBasePage {
	
	WebDriverWait wait;
	Actions builder;
	
	WebElement pesquisar;
	
	String campoPesquisar = "/html/body/div/main/div[2]/div/div[1]/div[2]/div/div/div/div/input";
	
	public CadastroAdidasPage() {
		wait = new WebDriverWait(_Driver(), 15);
		builder = new Actions(_Driver());
	}
	
	public void acessoPaginaLogin() {
		navegarAteSite("https://www.adidas.com.br/account-login");
	}
	
	public void preencheDadosDeCadastro(String nome, String sobrenome, String NDia, String NMes, String NAno, String email, String senha) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstName"))).sendKeys(nome);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("lastName"))).sendKeys(sobrenome);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("day"))).sendKeys(NDia);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("month"))).sendKeys(NMes);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("year"))).sendKeys(NAno);
		clicarElemento(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/div[1]/form/div[4]/section/div/div/label[1]/span"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email"))).sendKeys(email);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys(senha);
		
	}
	
	public void validaSite(String validacao) {
		assertTrue("URL contem", wait.until(ExpectedConditions.urlContains(validacao)));
	}

}