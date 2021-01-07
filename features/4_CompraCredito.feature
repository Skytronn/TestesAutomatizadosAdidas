# language: pt

	Funcionalidade: Testar a funcionalidade do fluxo de compra por Cartão de credito
	
	@evidencia
	Cenario: Validar se a compra por boleto funciona
	Dado que eu esteja logado
	E seleciono um produto
	E finalizo o carrinho
	Quando preencho os detalhes de entrega
	E escolho pagamento no credito
	Entao ao preencher as informacoes do cartao o pedido finaliza