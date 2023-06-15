package principio.responsabilidade;

public class TestConta {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		ContaBancaria bancaria = new ContaBancaria();
		bancaria.setDescricao("Conta bancaria do Alex");
		
		System.out.println(bancaria);
		
		bancaria.diminui100Reais();
		bancaria.diminui100Reais();
		
		System.out.println(bancaria);
		
		bancaria.sacarDinheiro(400);
		
		System.out.println(bancaria);
		
		bancaria.depositoDinheiro(1000);
		
		System.out.println(bancaria);
		
		bancaria.soma100Reais();
		
		System.out.println(bancaria);
		
		String string = new String();
		
		/*string*/  /* ao descomentar a variável string e acrescentar um ponto poderá observar quantos métodos simples o objeto String possui*/
		
		/* Princípio da responsabilidade = tudo que eu preciso está dentro da classe ContaBancaria */
		/* Por exemplo se fosse gerar um relatório teria uma outra classe com tudo o necessário para fazer isso */
		/* Pois a ContaBancaria está para efetuar saque, depósitos, manter o saldo espelhando o mundo real */
		/* Outro exemplo: não é função da ContaBancaria enviar um SMS, isso seria de um serviço externo */
		/* Resumindo: tudo que preciso está dentro do objeto, então pode-se criar pequenos métodos desde que ... */
		/* ... a resposabilidade seja condizente com o objeto */

	}

}
