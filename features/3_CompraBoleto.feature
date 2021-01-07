# language: pt

	Funcionalidade: Testar a funcionalidade do fluxo de compra por boleto
	
	@evidencia
	Cenario: Validar se a compra por boleto funciona
	Dado que eu esteja logado
	E seleciono um produto
	E finalizo o carrinho
	Quando preencho os dados para entrega
	E escolher pagamento por boleto
	Entao ao finalizar será gerado o boleto
	
