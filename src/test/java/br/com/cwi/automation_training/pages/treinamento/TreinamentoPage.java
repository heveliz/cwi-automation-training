package br.com.cwi.automation_training.pages.treinamento;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import br.com.cwi.automation_training.util.TestRule;


public class TreinamentoPage extends TreinamentoElementMap {
	//classe para tudo que acontece na pagina web 

	public TreinamentoPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}

	public void buscarProduto(String produto){
		search_query_top.sendKeys(produto);
		botaoPesquisar.click();		
	}
		
	//deveria estar na classe ProdutoPage
	public void clicarBotaoAddCart(){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)","");
		moveToElement(imagem);
		//botaoAddCart.click();
		//imagem.click();
		botaoAddCart.click();
		logPrint("Clicou no botao Add to Cart");		
	}
		
	//deveria estar na classe ProdutoPage
	public void verificarMensagem(String m){
		boolean verificaM =	mensagem.getText().equals(m);
		Assert.assertTrue(verificaM);
		logPrint("Mensagem apareceu");
	}
	
	public void clicarContactUs() {
		botaoContactUs.click();
		logPrint("Clicou no Contact Us");
	}
	
	
	
}