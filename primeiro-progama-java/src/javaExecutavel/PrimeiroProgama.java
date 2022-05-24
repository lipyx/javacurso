package javaExecutavel;

public class PrimeiroProgama {
	/*Essa variavel é do tipo Global é acessivel a todos e seu valor é compartilhado*/
	static int maiorIdadeGlobal = 30;
	
	/*testando commit, se alterar o projeto no github ja era.*/
	public static void main(String[] args) {
		
		System.out.println("Olá Mundo! primeiro progama em Java :D oi");
		/*Essas váriaveis são locais, portanto acessiveis somente a esse metodo*/
		int maiorIdade = 18;
		
		int idosoIdade = 60;
		
		int jovem = 16;
		
		int crianca = 7;
		
		String cpf = "421.178.858.21";
		
		System.out.println("Maior idade é = " + maiorIdade);
		System.out.println("Para ser idoso sua idade deve ser maior que " + idosoIdade + " anos.");
		
		 metodo2();
	}
	
	public static void metodo2() {
		System.out.println("Valor da váriavel Global é " + maiorIdadeGlobal);
	}
	
	

}
