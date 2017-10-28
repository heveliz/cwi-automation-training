package br.com.cwi.automation_training.steps.treinamento;

import br.com.cwi.automation_training.pages.treinamento.ContactUsPage;
import br.com.cwi.automation_training.pages.treinamento.TreinamentoPage;
import br.com.cwi.automation_training.util.TestRule;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class TreinamentoSteps {	
	
	@Dado("que estou na homepage do site \"(.*)\"")
	public void acessarHomePage(String url) {
		TestRule.openApplicationChrome(url);
	}
	
	@E("pesquiso pelo produto \"(.*)\"")
	public void pesquisarProduto(String nomeProduto) {
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		treinamentoPage.buscarProduto(nomeProduto);
	}
	
	@Quando("clico no botao Add to Cart")
	public void clicarBotao() {
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		treinamentoPage.clicarBotaoAddCart();
	}
	
	@Entao("deve apresentar a mensagem \"(.*)\"")
	public void verificarMensagem(String mensagem) {
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		treinamentoPage.verificarMensagem(mensagem);
	}
	
	@Quando("acesso o \"(.*)\"")
	public void clicarContact (String title) {
		TreinamentoPage treinamentoPage = new TreinamentoPage();
		treinamentoPage.clicarContactUs();
	}
	
	@E("envio a mensagem \"(.*)\"")
	public void enviarMensagem(String mensagem) {
		ContactUsPage contactUsPage = new ContactUsPage();
		contactUsPage.selecionarSubject();
		contactUsPage.inserirEmail();
		contactUsPage.inserirMensagem(mensagem);
		contactUsPage.enviarMensagem();
		
	}
	
	@Entao("deve confirmar com a mensagem \"(.*)\"")
	public void validarEnvio(String mensagem) {
		ContactUsPage contactUsPage = new ContactUsPage();
		contactUsPage.validarEnvio(mensagem);
	}
}

