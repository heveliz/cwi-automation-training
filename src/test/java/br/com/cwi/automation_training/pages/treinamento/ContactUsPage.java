package br.com.cwi.automation_training.pages.treinamento;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import br.com.cwi.automation_training.util.TestRule;

public class ContactUsPage extends TreinamentoElementMap {
	
	public ContactUsPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}
	
	
	public void selecionarSubject() {
		id_contact.click();
		customerService.click();
	}
	
	public void inserirEmail() {
		email.sendKeys("teste@teste.com");
	}
	
	public void inserirMensagem(String mensagem) {
		message.sendKeys(mensagem);
	}
	
	public void enviarMensagem() {
		submitMessage.click();
	}
	
	public void validarEnvio(String mensagem) {
		boolean validar = mensagemEnvio.getText().equals(mensagem);
		Assert.assertTrue(validar);
		logPrint("Mensagem enviada no Contact Us");
	}
	 

}
