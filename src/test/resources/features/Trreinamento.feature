#language: pt
#encoding: iso-8859-1
Funcionalidade: Compra

  @treinamento
  Cenario: Adicionar produto ao carrinho
    Dado que estou na homepage do site "http://automationpractice.com"
    E pesquiso pelo produto "Dress" 
    Quando clico no botao Add to Cart
    Entao deve apresentar a mensagem "Product successfully added to your shopping cart"
    
 @treinamento @cenario2
  Cenario: Enviar mensagem atraves do menu Contact Us
    Dado que estou na homepage do site "http://automationpractice.com"
    Quando acesso o "Contact Us" 
    E envio a mensagem "Quero trocar o produto"
    Entao deve confirmar com a mensagem "Your message has been successfully sent to our team." 
    