package br.com.cwi.automation_training.pages.treinamento;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.cwi.automation_training.pages.BasePage;

public class TreinamentoElementMap extends BasePage {
	//classe para mapear os elementos web

	//cenario1
	protected WebElement search_query_top;
	
	@FindBy(css = ".button-search")
	protected WebElement botaoPesquisar;
	
	@FindBy(css = ".ajax_add_to_cart_button")
	protected WebElement botaoAddCart;
	
	@FindBy(css = ".product_img_link")
	protected WebElement imagem;
		
	@FindBy(css = ".layer_cart_product h2")
	protected WebElement mensagem;
	
	
	//cenario2
	@FindBy(css = "[title='Contact Us']")
	protected WebElement botaoContactUs;
	
	protected WebElement email;
	protected WebElement id_contact;
	protected WebElement message;
	protected WebElement submitMessage;	
		
	@FindBy(css = "[value='2']")
	protected WebElement customerService;
	
	@FindBy(css = ".alert.alert-success")
	protected WebElement mensagemEnvio;
	
	
	
	
	
	
	
	
	
	
}